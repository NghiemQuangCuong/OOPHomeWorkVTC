import java.time.LocalDate;
import java.util.ArrayList;

public class DanhSachHoaDon 
{
    private ArrayList<HoaDon> danhSach;
    private int count;

    public DanhSachHoaDon(int n)
    {
        danhSach = new ArrayList<>();
        count = n;
        danhSach.ensureCapacity(n);
    }

    public boolean them(HoaDon hd)
    {
        for (HoaDon hoaDon : danhSach)
            if  ((hoaDon != null) && (hoaDon.equals(hd))) return false;

        danhSach.add(hd);
        return true;
    }

    public void xuat()
    {
        System.out.printf("%-15s | %-15s | %-25s | %15s | %20s | %15s\n", "Ma Hoa Don", "Ngay Hoa Don", "Ten Khach Hang"
            , "Ma Phong", "Don Gia", "Thoi Gian Thue");
        for (HoaDon hd : danhSach)
            System.out.println(hd.getInfo());
    }

    public int thongKeSoLuongHoaDonTheoGio()
    {
        int result = 0;
        for (HoaDon hd : danhSach)
            if (hd instanceof HoaDonGio) result++;
        return result;
    }

    public int thongKeSoLuongHoaDonTheoNgay()
    {
        int result = 0;
        for (HoaDon hd : danhSach)
            if (hd instanceof HoaDonNgay) result++;
        return result;
    }

    public double tinhTongThanhTien(int thang, int nam)
    {
        LocalDate date = LocalDate.of(nam, thang, 1);
        
        double result = 0.0;
        for (HoaDon hd : danhSach)
           if (hd.getNgayHoaDon().isAfter(date)) 
                result += hd.thanhTien();

        return result;
    }
}
