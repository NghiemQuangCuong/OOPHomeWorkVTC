public class NhanVien
{
    private int maNhanVien;
    private String tenNhanVien;
    private String diaChi;
    private String soDienThoai;

    public NhanVien()
    {
    }

    public NhanVien(int maNhanVien, String tenNhanVien, String diaChi, String soDienThoai)
    {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public String getTenNhanVien()
    {
        return tenNhanVien;
    }

    public String getDiaChi()
    {
        return diaChi;
    }

    public String getSoDienThoai()
    {
        return soDienThoai;
    }

    public int getMaNhanVien()
    {
        return maNhanVien;
    }

    public String getInfo()
    {
        return String.format("%-15d %-25s %-20s %20s", maNhanVien, tenNhanVien, diaChi, soDienThoai);
    }
}