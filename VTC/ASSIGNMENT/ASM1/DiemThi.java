public class DiemThi 
{
    private String maLop;
    private String tenSinhVien;
    private String danhGia;

    private String maSinhVien;
    private String monThi;
    private int diemThi;

    public DiemThi(String maSinhVien, String monThi, int diemThi)
    {
        this.maSinhVien = maSinhVien;
        this.monThi = monThi;
        this.diemThi = diemThi;

        SinhVien sv = QuanLySinhVien.getSinhVienByID(maSinhVien);
        this.maLop = sv.getMaLop();
        this.tenSinhVien = sv.getHoTen();
        if (diemThi >= 10)
            danhGia = "Do";
        else
            danhGia = "Truot";
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof DiemThi && ((DiemThi)obj).getMaSinhVien().equals(maSinhVien))
            return true;
        else
            return false;
    }

    @Override
    public String toString()
    {
        return String.format("%-15s %-25s %-15s %12d %15s", maLop, tenSinhVien, monThi,
            diemThi, danhGia);
    }

    public String getMaSinhVien()
    {
        return maSinhVien;
    }

    public String getMaLop()
    {
        return maLop;
    }

    public String getMonThi()
    {
        return monThi;
    }


}
