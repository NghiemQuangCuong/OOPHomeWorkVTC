public class KhachHang 
{
    private static int count = 0;
    private String maKhachHang;
    private String tenKhachHang;
    private String soDienThoai;
    private int diemThuong;

    public KhachHang()
    {
        maKhachHang = "KH00";
        tenKhachHang = "no name";
        soDienThoai = "";
        diemThuong = 0;
    }

    public KhachHang(String maKhachHang, String tenKhachHang, String soDienThoai)
    {
        this.maKhachHang = (!maKhachHang.trim().equals("")) ? maKhachHang : "null";
        this.tenKhachHang = (!tenKhachHang.trim().equals("")) ? tenKhachHang : "null";
        this.soDienThoai = (!soDienThoai.trim().equals("")) ? soDienThoai : "null";
        this.diemThuong = 0;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof KhachHang && !((KhachHang)obj).getMaKhachHang().equals("KH00") && ((KhachHang)obj).getMaKhachHang().equals(maKhachHang))
            return true;
        return false;
    }

    @Override
    public int hashCode()
    {
        if (!maKhachHang.equals("KH00"))
            return maKhachHang.hashCode();
        
        count++;
        return count;
    }

    @Override
    public String toString()
    {
        return String.format("%-15s %-25s %-20s %15d", maKhachHang, tenKhachHang, soDienThoai, diemThuong);
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = (!tenKhachHang.trim().equals("")) ? tenKhachHang : this.tenKhachHang;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = (!soDienThoai.trim().equals("")) ? soDienThoai : this.soDienThoai;
    }

    public int getDiemThuong() {
        return diemThuong;
    }

    public void setDiemThuong(int diemThuong) 
    {
        this.diemThuong = diemThuong;
    }

    
}
