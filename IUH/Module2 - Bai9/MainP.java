public class MainP 
{
    public static void main(String[] args)
    {
        Drawing dr = new Drawing();
        dr.drawShape(new Circle());
        dr.drawShape(new Quad());
        dr.drawShape(new Triangle());
        dr.drawShape(new Polygon());
        dr.drawShape(new Rectangle());
    }
}
