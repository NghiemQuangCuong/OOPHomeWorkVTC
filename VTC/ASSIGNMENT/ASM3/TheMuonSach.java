import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TheMuonSach 
{
    private String maThe;
    private String maTheThuVien;
    private String tenSachMuon;
    private String maSach;
    private LocalDate ngayMuon;
    private LocalTime gioTao;
    private LocalTime gioTra;
    
    public TheMuonSach(String maThe, String maTheThuVien, String tenSachMuon, String maSach)
    {
        this.maThe = (!maThe.trim().equals("")) ? maThe : "null";
        this.maTheThuVien = (!maTheThuVien.trim().equals("")) ? maTheThuVien : "null";
        this.tenSachMuon = (!tenSachMuon.trim().equals("")) ? tenSachMuon : "null";
        this.maSach = (!maSach.trim().equals("")) ? maSach : "null";
        ngayMuon = LocalDate.now();
        gioTao = LocalTime.now();
    }

    public String toSaveText()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        return maThe + "," + maTheThuVien + "," + gioTao.format(dtf) + "," + 
             ((gioTra != null) ? gioTra.format(dtf) : "null") + "," + tenSachMuon + ","
             + maSach;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof TheMuonSach && ((TheMuonSach)obj).getMaThe().equals(maThe))
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
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        return String.format("%-12s %-12s %15s %15s %25s", maThe, maTheThuVien, gioTao.format(dtf),
            (gioTra != null) ? gioTra.format(dtf) : "Chua Tra", tenSachMuon);
    }

    public void traSach()
    {
        gioTra = LocalTime.now();
    }


    public String getMaThe() 
    {
        return maThe;
    }

    public String getMaTheThuVien() 
    {
        return maTheThuVien;
    }

    public String getTenSachMuon() {
        return tenSachMuon;
    }

    public String getMaSach() {
        return maSach;
    }

    public LocalDate getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(LocalDate ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public LocalTime getGioTao() {
        return gioTao;
    }

    public void setGioTao(LocalTime gioTao) {
        this.gioTao = gioTao;
    }

    public LocalTime getGioTra() {
        return gioTra;
    }

    public void setGioTra(LocalTime gioTra) {
        this.gioTra = gioTra;
    }
}
