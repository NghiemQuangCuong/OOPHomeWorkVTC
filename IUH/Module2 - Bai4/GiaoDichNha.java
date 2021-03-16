import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class GiaoDichNha extends GiaoDich
{
    private String loaiNha;
    private String diaChi;

    public GiaoDichNha()
    {
        super();
        loaiNha = "null";
        diaChi = "null";
    }

    public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich,
         String loaiNha, String diaChi)
    {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        if (!loaiNha.trim().equals(""))
            this.loaiNha = loaiNha;
        else
            this.loaiNha = "null";

        if (!diaChi.trim().equals(""))
            this.diaChi = diaChi;
        else
            this.diaChi = "null";
    }

    @Override 
    public double thanhTien()
    {
        if (loaiNha.equals("Cao Cap"))
            return dienTich * donGia;
        else if (loaiNha.equals("Thuong"))
            return dienTich * donGia * 0.9;
        else
            return 0.0;
    }

    @Override
    public String getInfo()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale local = new Locale("vi", "vn");
        NumberFormat nf = NumberFormat.getInstance(local);
        return String.format("%-10s %-15s %20s VND %15.1f m2 %15s %30s", maGiaoDich, ngayGiaoDich.format(dtf), nf.format(donGia), dienTich,
            loaiNha, diaChi);
    }

    @Override
    public String getLoai()
    {
        return loaiNha;
    }
}