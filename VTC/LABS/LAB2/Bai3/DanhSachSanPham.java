import java.util.ArrayList;

public class DanhSachSanPham 
{
    private ArrayList<SanPham> listSanPham;

    public DanhSachSanPham()
    {
        listSanPham = new ArrayList<>();
    }

    public boolean themSanPham(SanPham sp)
    {
        listSanPham.add(sp);
        return true;
    }

    public boolean xoaSanPham(SanPham sp)
    {
        return listSanPham.remove(sp);
    }

    public boolean xoaSanPham(String maSP)
    {
        for (SanPham sp : listSanPham)
            if (sp.getMaSP().equals(maSP))
            {
                listSanPham.remove(sp);
                return true;
            }

        return false;
    }

    public boolean capNhapSanPham(String maSP, String tenSP, String moTa, double giaBan)
    {
        for (SanPham sp : listSanPham)
            if (sp.getMaSP().equals(maSP))
            {
                sp.setTenSP(tenSP);
                sp.setMoTa(moTa);
                sp.setGiaBan(giaBan);
                return true;
            }

        return false;
    }

    public ArrayList<SanPham> timKiem(String tuKhoa)
    {
        ArrayList<SanPham> result = new ArrayList<>();
        for (SanPham sp : listSanPham)
        {
            if (sp.getMaSP().contains(tuKhoa) || sp.getTenSP().contains(tuKhoa) || sp.getMoTa().contains(tuKhoa))
                result.add(sp);
        }

        return result;
    }

    public ArrayList<SanPham> timKiem(double tuGia, double denGia)
    {
        ArrayList<SanPham> result = new ArrayList<>();
        for (SanPham sp : listSanPham)
        {
            if (sp.getGiaBan() >= tuGia && sp.getGiaBan() <= denGia)
                result.add(sp);
        }

        return result;
    }

    public void sapXep()
    {
        listSanPham.sort((s1, s2) ->
        {
            if (s1.getGiaBan() > s2.getGiaBan())
                return -1;
            else if (s1.getGiaBan() < s2.getGiaBan())
                return 1;
            else
                return 0;
        });
    }

    public void hienThi()
    {
        System.out.println("Danh sach cac san pham: ");
        for (SanPham sp : listSanPham)
            System.out.println(sp);
    }
    
}
