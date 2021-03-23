public class Diem
{
    private double x;
    private double y;

    public Diem(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double khoangCach(Diem diem)
    {
        return Math.sqrt( (x - diem.getX())*(x - diem.getX()) + (y - diem.getY())*(y - diem.getY()) ); 
    }
}
