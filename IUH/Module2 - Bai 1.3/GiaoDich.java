import java.time.LocalDate;

public class GiaoDich
{
    protected String maGiaoDich;
    protected LocalDate ngayGiaoDich;
    protected double donGia;
    protected int soLuong;

    public GiaoDich()
    {
        maGiaoDich = "null";
        ngayGiaoDich = LocalDate.of(2000, 1, 1);
        donGia = 0.0;
        soLuong = 0;
    }

    public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong)
    {
        if (!maGiaoDich.trim().equals(""))
            this.maGiaoDich = maGiaoDich;

        this.ngayGiaoDich = ngayGiaoDich;

        if (donGia > 0.0)
            this.donGia = donGia;
        else
            this.donGia = 0.0;

        if (soLuong > 0)
            this.soLuong = soLuong;
        else
            this.soLuong = 0;
    }

    public double thanhTien()
    {
        return 0.0;
    }

    public String getInfo()
    {
        return "";
    }

    public String getLoai()
    {
        return "";
    }

    public int getSoLuong()
    {
        return soLuong;
    }
}