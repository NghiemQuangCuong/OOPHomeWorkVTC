public class MainP
{
    public static void main(String[] args)
    {
        QuanLyHocVien qlhv = new QuanLyHocVien();

        qlhv.themHocVien();
        qlhv.themHocVien();
        qlhv.themHocVien();
        qlhv.themHocVien();
        qlhv.themHocVien();

        try
        {
            qlhv.nhapDiem();
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        qlhv.hienThiDanhSachHocVien();
        System.out.println("----------------------");
        qlhv.sortHocVien();
        qlhv.hienThiDanhSachHocVien();
        System.out.println("-------------------------");
        qlhv.showDSHVHocBong();
        
    }
}
