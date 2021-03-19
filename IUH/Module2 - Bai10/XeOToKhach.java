import java.text.DecimalFormat;

public class XeOToKhach extends Xe
{
    private int soCho;

    public XeOToKhach()
    {
        super();
        soCho = 0;
    }

    public XeOToKhach(String tenXe, String thuongHieu, String mauSac, double giaTien, int soCho)
    {
        super(tenXe, thuongHieu, mauSac, giaTien);
        if (soCho > 0)
            this.soCho = soCho;
        else
            this.soCho = 0;
    }

    public double thueTTDB()
    {
        if (soCho < 5)
            return giaTien * 0.5;
        else
            return giaTien * 0.3;
    }

    public double thueVAT()
    {
        return giaTien * 0.1;
    }

    public double thueTruocBa()
    {
        return giaTien * 0.2;
    }

    @Override 
    public double tienThue()
    {
        return thueVAT() + thueTruocBa() + thueTTDB();
    }

    @Override
    public String getInfo()
    {
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        return String.format("%-25s %-25s %-10s %25s %12s %12s %12s %12s", tenXe, thuongHieu, mauSac, df.format(giaTien),
           df.format(thueVAT()), df.format(thueTruocBa()), df.format(thueTTDB()), df.format(tienThue()));
    }
}
