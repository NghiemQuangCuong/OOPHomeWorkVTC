public class Rectangle extends Quad
{
    @Override
    protected void draw()
    {
        System.out.println("Rectangle Drew!");
    }

    @Override
    protected void erase()
    {
        System.out.println("Rectangle Erase!");
    }

    @Override
    protected void move(int x, int y)
    {
        System.out.println("Rectangle moved to " + x + ", " + y);
    }
}
