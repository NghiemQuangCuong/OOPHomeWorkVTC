import java.text.DecimalFormat;

public class MatHang
{
    private String maHang;
    private String tenHang;
    private String kieuDongGoi;
    private int soLuong;
    private double donGia;

    public MatHang(String maHang, String tenHang, String kieuDongGoi, int soLuong, double donGia)
    {
        this.maHang = (!maHang.trim().equals("")) ? maHang : "null";
        this.tenHang = (!tenHang.trim().equals("")) ? tenHang : "null";
        this.kieuDongGoi = (!kieuDongGoi.trim().equals("")) ? kieuDongGoi : "null";
        this.soLuong = (soLuong > 0) ? soLuong : 0;
        this.donGia = (donGia > 0.0) ? donGia : 0.0;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = (!tenHang.trim().equals("")) ? tenHang : this.tenHang;
    }

    public String getKieuDongGoi() {
        return kieuDongGoi;
    }

    public void setKieuDongGoi(String kieuDongGoi) {
        this.kieuDongGoi = (!kieuDongGoi.trim().equals("")) ? kieuDongGoi : this.kieuDongGoi;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = (soLuong > 0) ? soLuong : this.soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = (donGia > 0.0) ? donGia : this.donGia;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof MatHang && ((MatHang)obj).getMaHang().equals(maHang))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode()
    {
        return maHang.hashCode();
    }

    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        return String.format("%-15s %-25s %-15s %15d %20s", 
            maHang, tenHang, kieuDongGoi, soLuong, df.format(donGia));
    }
}