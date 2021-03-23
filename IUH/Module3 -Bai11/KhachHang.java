import java.text.DecimalFormat;

public class KhachHang
{
    private String id;
    private String hoTen;
    private String gaDen;
    private double giaTien;

    public KhachHang(String id, String hoTen, String gaDen, double giaTien)
    {
        this.id = (!id.trim().equals("")) ? id : "null";
        this.hoTen = (!hoTen.trim().equals("")) ? hoTen : "null";
        this.gaDen = (!hoTen.trim().equals("")) ? gaDen : "null";
        this.giaTien = (giaTien > 0.0) ? giaTien : 0.0;
    }

    public String getInfo()
    {
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        return String.format("%-20s %-25s %20s %20s", id, hoTen, gaDen, df.format(giaTien));
    }

    public String getID()
    {
        return id;
    }

    public String getHoTen()
    {
        return hoTen;
    }

    public String getGaDen()
    {
        return gaDen;
    }

    public double getGiaTien()
    {
        return giaTien;
    }

    public boolean equals(KhachHang kh)
    {
        if (id.equals(kh.getID()))
            return true;
        return false;
    }

    public void capNhat(String hoTen, String gaDen, double giaTien)
    {
        this.hoTen = (!hoTen.trim().equals("")) ? hoTen : this.hoTen;
        this.gaDen = (!hoTen.trim().equals("")) ? gaDen : this.gaDen;
        this.giaTien = (giaTien > 0.0) ? giaTien : this.giaTien;
    }
}