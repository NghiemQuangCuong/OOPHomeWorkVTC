public class Point2D implements Movable
{
    private double x;
    private double y;

    public Point2D(double x, double y)
    {
        this.x = x;
        this.y = y;
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
        return String.format("(%.2f, %.2f)", x, y);
    }
}
