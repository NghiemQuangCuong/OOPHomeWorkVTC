public class Circle extends Shape
{
    @Override
    protected void draw()
    {
        System.out.println("Circle Drew!");
    }

    @Override
    protected void erase()
    {
        System.out.println("Circle Erase!");
    }

    @Override
    protected void move(int x, int y)
    {
        System.out.println("Circle moved to " + x + ", " + y);
    }
}
