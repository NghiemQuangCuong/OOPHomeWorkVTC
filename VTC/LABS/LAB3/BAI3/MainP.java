public class MainP 
{
    public static void main(String[] args)
    {
        Point2D point = new Point2D(1, 1);
        Rectangle rect = new Rectangle(2, 2, 4, -4);
        Circle cirl = new Circle(0, 0, 5);

        point.moveUp();
        rect.moveLeft();
        cirl.moveRight();

        System.out.println(point);
        System.out.println(rect);
        System.out.println(cirl);
    }    
}
