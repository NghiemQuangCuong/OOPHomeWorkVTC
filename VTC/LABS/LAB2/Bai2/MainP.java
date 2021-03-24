public class MainP 
{
    public static void main(String[] args) throws Exception
    {
        HinhChuNhat hcn = new HinhChuNhat(5.6, 2.7);
        HinhVuong hv = new HinhVuong(8.7);
        TamGiac tg = new TamGiac(5.3, 7.5, 4.8);
        TamGiacCan tgc = new TamGiacCan(7.6, 2);
        TamGiacDeu tgd = new TamGiacDeu(5.5);

        System.out.println(hcn);
        System.out.println(hv);
        System.out.println(tg);
        System.out.println(tgc);
        System.out.println(tgd);
    }
}
