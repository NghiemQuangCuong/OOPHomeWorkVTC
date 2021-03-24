public class Circle implements Movable
{
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r)
    {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void moveUp()
    {
        y++;
    }

    @Override
    public void moveDown()
    {
        y--;
    }

    @Override
    public void moveLeft()
    {
        x--;
    }

    @Override
    public void moveRight()
    {
        x++;
    }

    @Override
    public String toString()
    {
        return String.format("(%.2f, %.2f) R = %.2f", x, y, r);
    }
}
