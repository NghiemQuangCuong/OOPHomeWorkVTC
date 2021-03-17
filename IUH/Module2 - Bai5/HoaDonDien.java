import java.time.LocalDate;

public abstract class HoaDonDien
{
    protected String maKhachHang;
    protected String hoTen;
    protected LocalDate ngayLapHoaDon;
    protected double soKWTieuThu;
    protected double donGia;

    public HoaDonDien()
    {
        maKhachHang = "null";
        hoTen = "null";
        ngayLapHoaDon = LocalDate.of(2000, 1, 1);
        soKWTieuThu = 0.0;
        donGia = 5000.0;
    }

    public HoaDonDien(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKWTieuThu, double donGia)
    {
        if (!maKhachHang.trim().equals(""))
            this.maKhachHang = maKhachHang;
        else
            this.maKhachHang = "null";

        if (!hoTen.trim().equals(""))
            this.hoTen = hoTen;
        else
            this.hoTen = "null";
        this.ngayLapHoaDon = ngayLapHoaDon;
        if (soKWTieuThu > 0.0)
            this.soKWTieuThu = soKWTieuThu;
        else
            this.soKWTieuThu = 0.0;
        if (donGia > 0.0)
            this.donGia = donGia;
        else
            this.donGia = 0.0;
    }

    public LocalDate getNgayLapHoaDon()
    {
        return ngayLapHoaDon;
    }

    protected abstract double thanhTien();

    protected abstract String getInfo();

}