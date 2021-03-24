import java.time.LocalDate;

public abstract class SanPham
{
    protected String maSP;
    protected String tenSP;
    protected String moTa;
    protected LocalDate ngaySX;
    protected double giaBan;

    public SanPham(String maSP, String tenSP, String moTa, LocalDate ngaySX, double giaBan)
    {
        this.maSP = (!maSP.trim().equals("")) ? maSP : "null";
        this.tenSP = (!tenSP.trim().equals("")) ? tenSP : "null";
        this.moTa = (!moTa.trim().equals("")) ? moTa : "null";
        this.ngaySX = ngaySX;
        this.giaBan = (giaBan > 0.0) ? giaBan : 0.0;
    }

    public String getMaSP()
    {
        return maSP;
    }

    public String getTenSP()
    {
        return tenSP;
    }

    public String getMoTa()
    {
        return moTa;
    }

    public double getGiaBan()
    {
        return giaBan;
    }

    public void setTenSP(String tenSP)
    {
        this.tenSP = (!tenSP.trim().equals("")) ? tenSP : this.tenSP;
    }

    public void setMoTa(String moTa)
    {
        this.moTa = (!moTa.trim().equals("")) ? moTa : this.moTa;
    }

    public void setGiaBan(double giaBan)
    {
        this.giaBan = (giaBan > 0.0) ? giaBan : this.giaBan;
    }

    @Override
    public abstract String toString();
}