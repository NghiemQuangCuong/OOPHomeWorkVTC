public class Rectangle implements Movable
{
    private double x;
    private double y;
    private double a;
    private double b;
    
    public Rectangle(double x, double y, double a, double b)
    {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void moveUp()
    {
        y++;
        b++;
    }

    @Override
    public void moveDown()
    {
        y--;
        b--;
    }

    @Override
    public void moveLeft()
    {
        x--;
        a--;
    }

    @Override
    public void moveRight()
    {
        x++;
        a++;
    }

    @Override
    public String toString()
    {
        return String.format("(%.2f, %.2f, %.2f, %.2f)", x, y, a, b);
    }
}
