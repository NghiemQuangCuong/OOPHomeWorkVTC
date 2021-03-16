import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class GiaoDichVang extends GiaoDich
{
    private String loaiVang;

    public GiaoDichVang()
    {
        super();
        loaiVang = "null";
    }

    public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, String loaiVang)
    {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        if (!loaiVang.trim().equals(""))
            this.loaiVang = loaiVang;
        else
            this.loaiVang = "null";
    }

    @Override
    public double thanhTien()
    {
        return soLuong * donGia;
    }

    @Override
    public String getInfo()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale local = new Locale("vi", "vn");
        NumberFormat nf = NumberFormat.getInstance(local);
        return String.format("%-15s %15s %15s %10d %-15s", maGiaoDich, ngayGiaoDich.format(dtf), nf.format(donGia), soLuong, loaiVang);
    }

    @Override
    public String getLoai()
    {
        return loaiVang;
    }
}
