import java.text.DecimalFormat;

public class Circle {
    private Point center;
    private double radius;
    
    public Circle()
    {
        center = new Point();
        radius = 0.0;
    }

    public Circle(Point center, double radius)
    {
        this.center = center;
        this.radius = radius;
    }

    public void setCenter(Point center)
    {
        this.center = center;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public Point getCenter()
    {
        return center;
    }

    public double getRadius()
    {
        return radius;  
    }

    public double perimeter()
    {
        return radius * 2.0 * Math.PI;
    }

    public double area()
    {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#.000");
        return "Hinh tron co tam " + center.toString() + " voi ban kinh " + radius
            + " co dien tich va chu vi lan luot la " + df.format(area()) + " va " +
             df.format(perimeter());
    }
}
