import java.time.LocalDate;

public class Sach
{
    protected String maSach;
    protected LocalDate ngayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;

    public Sach()
    {
        this.maSach = "null";
        this.ngayNhap = LocalDate.of(2000,1,1);
        this.donGia = 0.0;
        this.soLuong = 0;
        this.nhaXuatBan = "null";
    }

    public Sach(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan)
    {
        if (!maSach.trim().equals(""))
            this.maSach = maSach;
        else
            this.maSach = "null";

        this.ngayNhap = ngayNhap;

        if (donGia > 0.0)
            this.donGia = donGia;
        else
            this.donGia = 0.0;
        
        if (soLuong > 0)
            this.soLuong = soLuong;
        else
            this.soLuong = 0;

        if (!nhaXuatBan.trim().equals(""))
            this.nhaXuatBan = nhaXuatBan;
        else
            this.nhaXuatBan = "null";
    }

    public double getDonGia()
    {
        return donGia;
    }

    public String getNhaXuatBan()
    {
        return nhaXuatBan;
    }

    public double getThanhTien()
    {
        return 0.0;
    }

    public String getInfo()
    {
        return "SachClassInfo";
    }
}