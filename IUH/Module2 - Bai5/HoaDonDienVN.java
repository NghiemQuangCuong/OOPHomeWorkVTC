import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HoaDonDienVN extends HoaDonDien
{
    private String doiTuong;
    private double dinhMuc;

    public HoaDonDienVN()
    {
        super();
        doiTuong = "null";
        dinhMuc = 0.0;
    }

    public HoaDonDienVN(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, 
        double soKWTieuThu, double donGia, String doiTuong, double dinhMuc)
    {
        super(maKhachHang, hoTen, ngayLapHoaDon, soKWTieuThu, donGia);
        if (!doiTuong.trim().equals(""))
            this.doiTuong = doiTuong;
        else
            this.doiTuong = "null";
        if (dinhMuc > 0.0)
            this.dinhMuc = dinhMuc;
        else
            this.dinhMuc = 0.0;
    }

    @Override
    public double thanhTien()
    {
        if (soKWTieuThu < dinhMuc)
            return soKWTieuThu * donGia;
        else
            return soKWTieuThu * donGia + (soKWTieuThu - dinhMuc)*donGia*2.5;
    }

    public String getInfo()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,###.000");
        return String.format("%-10s %-25s %15s %15.1f %10s %15s %15.1f", maKhachHang, hoTen, ngayLapHoaDon.format(dtf), 
            soKWTieuThu, df.format(donGia), doiTuong, dinhMuc);
    }
    
}
