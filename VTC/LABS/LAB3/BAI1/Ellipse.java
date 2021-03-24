public class Ellipse extends Hinh
{
    private double bkTrucLon;
    private double bkTrucNho;
    private final double PI = 3.1416;

    public Ellipse(String ten, double a, double b)
    {
        super(ten);
        if (a < 0 || b < 0)
        {
            bkTrucLon = 0.0;
            bkTrucNho = 0.0;
        }
        
        if (a > b)
        {
            bkTrucLon = a;
            bkTrucNho = b;
        }
        else
        {
            bkTrucLon = b;
            bkTrucNho = a;
        }
    }

    @Override
    public double tinhDienTich()
    {
        return PI * bkTrucLon * bkTrucNho;
    }

    @Override
    public double tinhChuVi()
    {
        return 2.0 * PI * Math.sqrt( (bkTrucLon*bkTrucLon + bkTrucNho*bkTrucNho)/2.0 );
    }

    public double getBkTrucLon() 
    {
        return bkTrucLon;
    }

    public void setBkTrucLon(double bkTrucLon) 
    {
        this.bkTrucLon = (bkTrucLon > 0) ? bkTrucLon : 0.0;
    }

    public double getBkTrucNho() 
    {
        return bkTrucNho;
    }

    public void setBkTrucNho(double bkTrucNho) 
    {
        this.bkTrucNho = (bkTrucNho > 0) ? bkTrucNho : 0.0;
    }

    @Override
    public String toString()
    {
        return String.format("Hinh Ellipse %s\nDien Tich: %.4f\nChu vi: %.4f\n", getTen(),tinhDienTich(), tinhChuVi()); 
    }
}