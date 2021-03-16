import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class GiaoDichTienTe extends GiaoDich
{
    private double tiGia;
    private String loaiTienTe;

    public GiaoDichTienTe()
    {
        super();
        tiGia = 0.0;
        loaiTienTe = "null";
    }

    public GiaoDichTienTe(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, 
        int soLuong, double tiGia, String loaiTienTe)
    {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        if (tiGia > 0.0)
            this.tiGia = tiGia;
        else
            tiGia = 0.0;

        if (!loaiTienTe.trim().equals(""))
            this.loaiTienTe = loaiTienTe;
        else
            this.loaiTienTe = "null";
    }

    @Override
    public double thanhTien()
    {
        if (loaiTienTe.equals("USD") || loaiTienTe.equals("EURO"))
            return soLuong * donGia * tiGia;
        else if (loaiTienTe.equals("VND"))
            return soLuong * donGia;
        else
            return 0.0;
    }

    @Override
    public String getInfo()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale local = new Locale("vi", "vn");
        NumberFormat nf = NumberFormat.getInstance(local);
        return String.format("%-15s %15s %15s %10d %10.2f %15s", maGiaoDich, ngayGiaoDich.format(dtf), nf.format(donGia), soLuong, tiGia, loaiTienTe);
    }

    @Override
    public String getLoai()
    {
        return loaiTienTe;
    }
}
