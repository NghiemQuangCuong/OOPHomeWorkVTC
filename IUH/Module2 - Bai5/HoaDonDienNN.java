import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HoaDonDienNN extends HoaDonDien
{
    private String quocTich;

    public HoaDonDienNN()
    {
        super();
        quocTich = "null";
    }

    public HoaDonDienNN(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, 
    double soKWTieuThu, double donGia, String quocTich)
    {
        super(maKhachHang, hoTen, ngayLapHoaDon, soKWTieuThu, donGia);
        if (!quocTich.trim().equals(""))
            this.quocTich = quocTich;
        else
            this.quocTich = quocTich;
    }

    @Override
    public double thanhTien()
    {
            return soKWTieuThu * donGia;
    }

    public String getInfo()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,###.000");
        return String.format("%-10s %-25s %15s %15.1f %10s %25s", maKhachHang, hoTen, ngayLapHoaDon.format(dtf), 
            soKWTieuThu, df.format(donGia), quocTich);
    }
}
