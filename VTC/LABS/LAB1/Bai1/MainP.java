public class MainP 
{
    public static void main(String[] args) 
    {
        Diem diem1 = new Diem(2.5, -5.6); 
        Diem diem2 = new Diem(6.2, -3.8);
        
        System.out.println( diem1.khoangCach(diem2) );
    }
}
