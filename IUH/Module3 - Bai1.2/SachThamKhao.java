import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SachThamKhao extends Sach
{
    private double thue;

    public SachThamKhao()
    {
        super();
        this.thue = 0.0;
    }

    public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan
    , double thue)
    {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        
        if (thue > 0.0)
            this.thue = thue;
        else
            this.thue = 0.0;
    }

    @Override
    public double getThanhTien()
    {
        return soLuong * donGia + thue;
    }

    @Override
    public String getInfo()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale local = new Locale("vi", "vn");
        NumberFormat nf = NumberFormat.getInstance(local);

        return String.format("%-10s %-15s %-15s %-10d %-20s %-15s", maSach, ngayNhap.format(dtf), nf.format(donGia),
            soLuong, nhaXuatBan, nf.format(thue));
    }
}
