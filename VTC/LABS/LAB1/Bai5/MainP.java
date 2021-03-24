public class MainP 
{
    public static void main(String[] args)
    {
        QuanLyPhanSo qlps = new QuanLyPhanSo();
        PhanSo ps = null;
        try 
        {
            qlps.themPhanSo(new PhanSo(10, 50));
            qlps.themPhanSo(new PhanSo(30, 90));
            qlps.themPhanSo(new PhanSo(4, 17));
            qlps.themPhanSo(new PhanSo(3, 22));
            qlps.themPhanSo(new PhanSo(19, 7));
            ps = new PhanSo(1, 5);
        } catch (Exception e) 
        {
            System.out.println(e.getMessage()); 
        }
        
        System.out.println(qlps.tinhTong());
        System.out.println("-------------------------");
        qlps.showInfo();
        System.out.println("-------------------------");
        qlps.xoaPhanSo(ps);
        qlps.showInfo();
        System.out.println("-------------------------");
        qlps.sapXep();
        qlps.showInfo();
    }
    
}
