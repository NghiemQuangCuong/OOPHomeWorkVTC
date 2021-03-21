import java.text.DecimalFormat;

public class KhachHang 
{
    private String tenKhachHang;
    private double doanhSo;

    public KhachHang()
    {};
    
    public KhachHang(String tenKhachHang, double doanhSo)
    {
        this.tenKhachHang = tenKhachHang;
        this.doanhSo = doanhSo;
    }

    public String getTenKhachHang()
    {
        return tenKhachHang;
    }

    public double getDoanhSo()
    {
        return doanhSo;
    }

    public String getInfo()
    {
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        return String.format("%-25s %25s", tenKhachHang, df.format(doanhSo));
    }
}
