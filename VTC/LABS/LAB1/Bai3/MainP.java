public class MainP 
{
    public static void main(String[] args) 
    {
        Diem diem1 = new Diem(1, 4);
        Diem diem2 = new Diem(4, 1);
        HinhChuNhat hcn1 = null, hcn2 = null;
        
        try 
        {
            hcn1 = new HinhChuNhat(diem1, diem2);
            hcn2 = new HinhChuNhat(diem2, diem1);   
        } catch (Exception ex) 
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            hcn1.showInfo();
        }
        
    }    
}
