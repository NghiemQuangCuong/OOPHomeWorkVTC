public class Point
{
    private float x;
    private float y;
    private String name;

    public float getX()
    {
        return x;
    }

    public void setX(float x)
    {
        this.x = x;
    }

    public float getY()
    {
        return y;
    }

    public void setY(float y)
    {
        this.y = y;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Point()
    {
        x = 0f;
        y = 0f;
        name = "";
    }

    public Point(float x, float y, String name)
    {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public String toString()
    {
        return name + "("  + String.valueOf(x) + ", " + String.valueOf(y) + ")";
    }  
}