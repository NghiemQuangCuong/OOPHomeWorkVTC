import java.text.NumberFormat;
import java.util.Locale;

public class CD
{
    private int maCD;
    private String tuaCD;
    private int soBaiHat;
    private double giaThanh;

    public CD()
    {
        maCD = 999999;
        tuaCD = "chua xac dinh";
        soBaiHat = 0;
        giaThanh = 0;
    }

    public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh)
    {
        if (maCD > 0)
            this.maCD = maCD;
        else
            this.maCD = 999999;

        if (!tuaCD.equals(""))
            this.tuaCD = tuaCD;
        else
            this.tuaCD = "chua xac dinh";

        if (soBaiHat > 0)
            this.soBaiHat = soBaiHat;
        else
            this.soBaiHat = 0;

        if (giaThanh > 0)
            this.giaThanh = giaThanh;
        else
            this.giaThanh = 0;
    }

    public void setMaCD(int maCD)
    {
        if (maCD > 0)
            this.maCD = maCD;
    }

    public void setTuaCD(String tuaCD)
    {
        if (!tuaCD.equals(""))
            this.tuaCD = tuaCD;
    }

    public void setSoBaiHat(int soBaiHat)
    {
        if (soBaiHat > 0)
            this.soBaiHat = soBaiHat;
    }

    public void setGiaThanh(double giaThanh)
    {
        if (giaThanh > 0)
            this.giaThanh = giaThanh;
    }

    public int getMaCD()
    {
        return maCD;
    }

    public String getTuaCD()
    {
        return tuaCD;
    }

    public int getSoBaiHat()
    {
        return soBaiHat;
    }

    public double getGiaThanh()
    {
        return giaThanh;
    }

    @Override
    public String toString()
    {
        Locale locale = new Locale("vi", "vn");
        NumberFormat nf = NumberFormat.getInstance(locale);
        return String.format("%-10d %-30s %15d %25sVND", maCD, tuaCD, soBaiHat, nf.format(giaThanh));
    }
}