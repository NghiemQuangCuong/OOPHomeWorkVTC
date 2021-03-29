import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SinhVien
{
    private String id;
    private String hoTen;
    private String diaChi;
    private LocalDate ngaySinh;
    private String maLop;
    
    public SinhVien(String id, String hoTen, String diaChi, LocalDate ngaySinh, String maLop) 
    {
        this.id = (!id.trim().equals("")) ? id : "null";
        this.hoTen = (!hoTen.trim().equals("")) ? hoTen : "null";
        this.diaChi = (!diaChi.trim().equals("")) ? diaChi : "null";
        this.ngaySinh = ngaySinh;
        this.maLop = (!maLop.trim().equals("")) ? maLop : "null";
    }

    @Override
    public String toString()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-18s %-25s %-25s %18s %15s", id, hoTen, diaChi, ngaySinh.format(dtf), 
            maLop);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof SinhVien && ((SinhVien)obj).getId().equals(id))
            return true;
        else
            return false;
    }

    public String getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = (!hoTen.trim().equals("")) ? hoTen : this.hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = (!diaChi.trim().equals("")) ? diaChi : this.diaChi;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = (!maLop.trim().equals("")) ? maLop : this.maLop;
    }

    
}