public class Point
{
    private float x;
    private float y;
    private String name;

    public Point()
    {
        x = 0.0f;
        y = 0.0f;
        name = "NULL";
    }

    public Point(float x, float y, String name)
    {
        this.x = x;
        this.y = y;
        if (!name.equals(""))
            this.name = name;
        else
            this.name = "NULL";
    }

    public void setX(float x)
    {
        this.x = x;
    }

    public void setY(float y)
    {
        this.y = y;
    }

    public void setName(String name)
    {
        if (!name.equals(""))
            this.name = name;
        else
            this.name = "NULL";
    }

    public float getX()
    {
        return x;
    }

    public float getY()
    {
        return y;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return name + "(" + x + "," + y + ")";
    }
}