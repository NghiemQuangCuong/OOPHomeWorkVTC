public class Polygon extends Shape
{
    @Override
    protected void draw()
    {
        System.out.println("Polygon Drew!");
    }

    @Override
    protected void erase()
    {
        System.out.println("Polygon Erase!");
    }

    @Override
    protected void move(int x, int y)
    {
        System.out.println("Polygon moved to " + x + ", " + y);
    }
}
