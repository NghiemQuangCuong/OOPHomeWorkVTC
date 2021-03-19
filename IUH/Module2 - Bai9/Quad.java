public class Quad extends Shape
{
    @Override
    protected void draw()
    {
        System.out.println("Quad Drew!");
    }

    @Override
    protected void erase()
    {
        System.out.println("Quad Erase!");
    }

    @Override
    protected void move(int x, int y)
    {
        System.out.println("Quad moved to " + x + ", " + y);
    }
}
