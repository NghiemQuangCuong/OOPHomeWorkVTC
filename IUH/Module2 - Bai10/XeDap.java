import java.text.DecimalFormat;

public class XeDap extends Xe
{
    public XeDap()
    {
        super();
    }

    public XeDap(String tenXe, String thuongHieu, String mauSac, double giaTien)
    {
        super(tenXe, thuongHieu, mauSac, giaTien);
    }

    @Override 
    public double tienThue()
    {
        return 0.0;
    }

    @Override
    public String getInfo()
    {
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        return String.format("%-25s %-25s %-10s %25s", tenXe, thuongHieu, mauSac, df.format(giaTien));
    }
}
