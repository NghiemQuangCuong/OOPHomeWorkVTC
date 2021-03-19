import java.time.LocalDate;

public abstract class HoaDon
{
    protected String maHoaDon;
    protected LocalDate ngayHoaDon;
    protected String tenKhachHang;
    protected String maPhong;
    protected double donGia;

    public HoaDon()
    {
        maHoaDon = "null";
        ngayHoaDon = LocalDate.of(2000, 1, 1);
        tenKhachHang = "null";
        maPhong = "null";
        donGia = 0.0;
    }

    public HoaDon(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia) 
    {
        if (!maHoaDon.trim().equals(""))
            this.maHoaDon = maHoaDon;
        else 
            this.maHoaDon = "null";

        this.ngayHoaDon = ngayHoaDon;

        if (!tenKhachHang.trim().equals(""))
            this.tenKhachHang = tenKhachHang;
        else
            this.tenKhachHang = "null";

        if (!maPhong.trim().equals(""))
            this.maPhong = maPhong;
        else
            this.maPhong = maPhong;

        if (donGia > 0.0)
            this.donGia = donGia;
        else
            this.donGia = 0.0;
    }

    public String getMaHoaDon()
    {
        return maHoaDon;
    }

    public LocalDate getNgayHoaDon()
    {
        return ngayHoaDon;
    }

    public abstract boolean equals(HoaDon obj);
    public abstract double thanhTien();
    public abstract String getInfo();

}