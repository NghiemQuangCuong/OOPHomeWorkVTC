import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SachGiaoKhoa extends Sach 
{
    private String tinhTrang;

    public SachGiaoKhoa()
    {
        super();
        this.tinhTrang = "unknown";
    }

    public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan
    , String tinhTrang)
    {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        if (tinhTrang.equals("MOI") || tinhTrang.equals("CU"))
            this.tinhTrang = tinhTrang;
        else
            this.tinhTrang = "unknown";
    }

    @Override
    public double getThanhTien()
    {
        if (tinhTrang.equals("MOI"))
            return soLuong * donGia;
        else if (tinhTrang.equals("CU"))
            return soLuong * donGia * 0.5;
        else
            return 0.0;
    }

    @Override
    public String getInfo()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale local = new Locale("vi", "vn");
        NumberFormat nf = NumberFormat.getInstance(local);

        return String.format("%-10s %-15s %-15s %-10d %-20s %-10s", maSach, ngayNhap.format(dtf), nf.format(donGia),
            soLuong, nhaXuatBan, tinhTrang);
    }
}
