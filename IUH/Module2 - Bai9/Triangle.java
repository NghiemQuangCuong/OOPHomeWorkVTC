public class Triangle extends Shape
{
    @Override
    protected void draw()
    {
        System.out.println("Triangle Drew!");
    }

    @Override
    protected void erase()
    {
        System.out.println("Triangle Erase!");
    }

    @Override
    protected void move(int x, int y)
    {
        System.out.println("Triangle moved to " + x + ", " + y);
    }
}
