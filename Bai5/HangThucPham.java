import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham
{
    private String maHang;
    private String tenHang;
    private float donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    public String getMaHang()
    {
        return maHang;
    }

    public String getTenHang()
    {
        return tenHang;
    }

    public float getDonGia()
    {
        return donGia;
    }

    public String getNgaySanXuat()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ngaySanXuat.format(dtf);
        return ngaySanXuat.toString();
    }
    public String getNgayHetHan()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ngayHetHan.format(dtf);
        return ngayHetHan.toString();
    }

    public void setTenHang(String tenHang)
    {
        if (!tenHang.equals(""))
            this.tenHang = tenHang;
        else
            this.tenHang = "xxx";
    }

    public void setDonGia(float donGia)
    {
        if (donGia >= 0f)
            this.donGia = donGia;
        else
            this.donGia = 0f;
    }

    public void setNgaySanXuat(LocalDate ngay)
    {
        if (ngay.isBefore(LocalDate.now()))
            ngaySanXuat = ngay;
        else    
            ngaySanXuat = LocalDate.now();
    }

    public void setNgayHetHan(LocalDate ngay)
    {
        if (ngay.isAfter(ngaySanXuat))
            ngayHetHan = ngay;
        else    
            ngayHetHan = ngaySanXuat;
    }

    public HangThucPham(String maHang, String tenHang, float donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception
    {
        if (!maHang.equals(""))
            this.maHang = maHang;
        else
            throw new Exception("Loi: Ma Hang Rong");

        if (!tenHang.equals(""))
            this.tenHang = tenHang;
        else
            this.tenHang = "xxx";

        if (donGia >= 0f)
            this.donGia = donGia;
        else
            this.donGia = 0f;

        if (ngaySanXuat.isBefore(LocalDate.now()))
            this.ngaySanXuat = ngaySanXuat;
        else  
            this.ngaySanXuat = LocalDate.now();

        if (ngayHetHan.isAfter(ngaySanXuat))
            this.ngayHetHan = ngayHetHan;
        else
            this.ngayHetHan = ngaySanXuat;
    }

    public boolean hetHan()
    {
        if (ngayHetHan.isBefore(LocalDate.now()))
            return true;
        else
            return false;
    }

    @Override
    public String toString()
    {
        String ghiChu;
        if (hetHan())
            ghiChu = "Hang Het Han";
        else    
            ghiChu = "";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,###,##0.00");

        return String.format("%-10s %-20s %20sVND %-15s %-15s %-20s", maHang, tenHang, df.format(donGia), ngaySanXuat.format(dtf), 
            ngayHetHan.format(dtf), ghiChu);
    }
}