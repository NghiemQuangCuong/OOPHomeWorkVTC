import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class GiaoDichDat extends GiaoDich
{
    private String loaiDat;

    public GiaoDichDat()
    {
        super();
        loaiDat = "null";
    }

    public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich,
    String loaiDat)
    {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        if (!loaiDat.trim().equals(""))
            this.loaiDat = loaiDat;
        else
            this.loaiDat = "null";
    }

    @Override 
    public double thanhTien()
    {
        if (loaiDat.equals("B") || loaiDat.equals("C"))
            return dienTich * donGia;
        else if (loaiDat.equals("A"))
            return dienTich * donGia * 1.5;
        else
            return 0.0;
    }

    @Override
    public String getInfo()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale local = new Locale("vi", "vn");
        NumberFormat nf = NumberFormat.getInstance(local);
        return String.format("%-10s %-15s %20s VND %15.1f m2 %15s", maGiaoDich, ngayGiaoDich.format(dtf), nf.format(donGia), dienTich,
            loaiDat);
    }

    @Override
    public String getLoai()
    {
        return loaiDat;
    }
}
