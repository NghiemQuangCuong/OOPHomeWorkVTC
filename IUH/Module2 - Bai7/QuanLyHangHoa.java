import java.text.DecimalFormat;
import java.util.ArrayList;

public class QuanLyHangHoa 
{
    private ArrayList<HangHoa> listHangHoa = new ArrayList<>();
    private int maxSize;

    public QuanLyHangHoa(int n)
    {
        listHangHoa.ensureCapacity(n);
        maxSize = n;
    }

    public boolean themHangHoa(HangHoa hangHoa)
    {
        if (listHangHoa.size() == maxSize)
            return false;
        
        for (HangHoa hh : listHangHoa)
            if (hh.equals(hangHoa))
                return false;

        listHangHoa.add(hangHoa);
        return true;
    }

    public void inDanhSachHangHoa()
    {
        System.out.println("Danh sach tat ca hang hoa: ");
        for (HangHoa hh : listHangHoa)
            System.out.println(hh.getInfo());
    }

    public void inDanhSachHangThucPham()
    {
        System.out.println("Danh sach cac mat hang thuc pham: ");
        for (HangHoa hh : listHangHoa)
            if (hh instanceof HangThucPham)
                System.out.println(hh.getInfo());
    }

    public void inDanhSachHangSanhSu()
    {
        System.out.println("Danh sach cac mat hang sanh su: ");
        for (HangHoa hh : listHangHoa)
            if (hh instanceof HangSanhSu)
                System.out.println(hh.getInfo());
    }

    public void inDanhSachHangDienMay()
    {
        System.out.println("Danh sach cac mat hang dien may: ");
        for (HangHoa hh : listHangHoa)
            if (hh instanceof HangDienMay)
                System.out.println(hh.getInfo());
    }

    public HangHoa getHangHoaVoiMaHangHoa(String maHang)
    {
        for (HangHoa hh : listHangHoa)
            if (hh.getMaHang().equals(maHang))
                return hh;

        return null;
    }

    public void sortTenHangTangDan()
    {
        listHangHoa.sort((s1, s2) -> 
        {
            return s1.getTenHang().compareTo(s2.getTenHang());
        });

        inDanhSachHangHoa();
    }

    public void sortSoLuongTonGiamDan()
    {
        listHangHoa.sort((s1, s2) -> 
        {
            if (s1.getSoLuongTon() > s2.getSoLuongTon())
                return -1;
            else
                return 1;
        });

        inDanhSachHangHoa();
    }

    public void inCacHangThucPhamKhoBan()
    {
        System.out.println("Danh sach cac hang thuc pham kho ban: ");
        for (HangHoa hh : listHangHoa)
            if (hh instanceof HangThucPham && hh.mucDoBanBuon().equals("Kho ban"))
                System.out.println(hh.getInfo());
    }

    public boolean xoaHangHoaVoiMaHang(String maHang)
    {
        for (int i = 0; i < listHangHoa.size(); i++)
            if (listHangHoa.get(i).getMaHang().equals(maHang))
            {
                listHangHoa.remove(i);
                return true;
            }

        return false;
    }

    public void suaDonGiaVoiMaHang(String maHang) throws NullPointerException, NumberFormatException
    {
        for (HangHoa hh : listHangHoa)
            if (hh.getMaHang().equals(maHang))
            {
                DecimalFormat df = new DecimalFormat("#,###,###.000");
                System.out.println("Don gia cu: " + df.format(hh.getDonGia()));
                System.out.println("Nhap don gia moi: ");
                double newPrice = 0;
                do
                {
                    newPrice = Double.parseDouble(MainP.sc.nextLine());
                    if (newPrice < 0) 
                        System.out.println("Don gia nhap vao phai lon hon khong, moi ban nhap lai");
                } while (newPrice < 0);
                hh.setDonGia(newPrice);
                System.out.println("Da nhap don gia moi thanh cong!");
                return;
            }

        System.out.println("Khong tim thay ma hang trong danh sach");
        return;
    }
}
