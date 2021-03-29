import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TheThuVien 
{
    private String maThe;
    private String tenChuThe;
    private String cmnd;
    private LocalDate ngayTao;
    
    public TheThuVien(String maThe, String tenChuThe, String cmnd)
    {
        this.maThe = (!maThe.trim().equals("")) ? maThe : "null";
        this.tenChuThe = (!tenChuThe.trim().equals("")) ? tenChuThe : "null";
        this.cmnd = (!cmnd.trim().equals("")) ? cmnd : "null";
        ngayTao = LocalDate.now();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof TheThuVien && ((TheThuVien)obj).getMaThe().equals(maThe))
            return true;
        return false;
    }

    @Override
    public int hashCode()
    {
        return maThe.hashCode();
    }

    @Override
    public String toString()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-12s %-25s %20s %20s", maThe, tenChuThe, cmnd, ngayTao.format(dtf));
    }

    public String toTextSave()
    {
        return maThe + "," + tenChuThe + "," + cmnd + "," + ngayTao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getMaThe() {
        return maThe;
    }

    public String getTenChuThe() {
        return tenChuThe;
    }

    public void setTenChuThe(String tenChuThe) {
        this.tenChuThe = (!tenChuThe.trim().equals("")) ? tenChuThe : this.tenChuThe;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = (!cmnd.trim().equals("")) ? cmnd : this.cmnd;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao)
    {
        this.ngayTao = ngayTao;
    }
}
