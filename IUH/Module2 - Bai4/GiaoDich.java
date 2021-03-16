import java.time.LocalDate;

public abstract class GiaoDich
{
    protected String maGiaoDich;
    protected LocalDate ngayGiaoDich;
    protected double donGia;
    protected double dienTich;

    public GiaoDich()
    {
        maGiaoDich = "null";
        ngayGiaoDich = LocalDate.of(2000, 1, 1);
        donGia = 0.0;
        dienTich = 0.0;
    }

    public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich)
    {
        if (!maGiaoDich.trim().equals(""))
            this.maGiaoDich = maGiaoDich;
        else
            this.maGiaoDich = "null";

        this.ngayGiaoDich = ngayGiaoDich;
    
        if (donGia > 0.0)
            this.donGia = donGia;
        else
            this.donGia = 0.0;

        if (dienTich > 0.0)
            this.dienTich = dienTich;
        else
            this.dienTich = 0.0;
    }

    protected abstract double thanhTien();

    protected abstract String getInfo();

    protected abstract String getLoai();
}