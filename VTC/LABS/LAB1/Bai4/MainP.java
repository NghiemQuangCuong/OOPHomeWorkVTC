public class MainP 
{
    public static void main(String[] args) 
    {
        try 
        {
            PhanSo ps1 = new PhanSo(20, 80);
            PhanSo ps2 = new PhanSo(30, 150);

            System.out.println(ps1);
            System.out.println(ps2);

            System.out.println(ps1.cong(ps2));
            System.out.println(ps1.tru(ps2));
            System.out.println(ps1.nhan(ps2));
            System.out.println(ps1.chia(ps2));

            System.out.println(ps1.compareTo(ps2));
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        
    }
}
