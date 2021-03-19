public abstract class Xe
{
    protected String tenXe;
    protected String thuongHieu;
    protected String mauSac;
    protected double giaTien;

    protected Xe()
    {
        tenXe = "null";
        thuongHieu = "null";
        mauSac = "null";
        giaTien = 0.0;
    }

    protected Xe(String tenXe, String thuongHieu, String mauSac, double giaTien)
    {
        if (!tenXe.trim().equals(""))
            this.tenXe = tenXe;
        else
            this.tenXe = "null";

        if (!thuongHieu.trim().equals(""))
            this.thuongHieu = thuongHieu;
        else
            this.thuongHieu = "null";

        if (!mauSac.trim().equals(""))
            this.mauSac = mauSac;
        else
            this.mauSac = "null";

        if (giaTien > 0.0)  
            this.giaTien = giaTien;
        else
            this.giaTien = 0.0;
    }

    protected abstract double tienThue();
    protected abstract String getInfo();
}