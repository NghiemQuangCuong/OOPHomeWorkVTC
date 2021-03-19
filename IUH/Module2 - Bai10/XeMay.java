import java.text.DecimalFormat;

public class XeMay extends Xe
{
    public XeMay()
    {
        super();
    }

    public XeMay(String tenXe, String thuongHieu, String mauSac, double giaTien)
    {
        super(tenXe, thuongHieu, mauSac, giaTien);
    }

    public double thueVAT()
    {
        return giaTien * 0.1;
    }

    public double thueTruocBa()
    {
        return giaTien * 0.05;
    }

    @Override 
    public double tienThue()
    {
        return thueVAT() + thueTruocBa();
    }

    @Override
    public String getInfo()
    {
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        return String.format("%-25s %-25s %-10s %25s %12s %12s %12s", tenXe, thuongHieu, mauSac, df.format(giaTien),
           df.format(thueVAT()), df.format(thueTruocBa()), df.format(tienThue()));
    }
}
