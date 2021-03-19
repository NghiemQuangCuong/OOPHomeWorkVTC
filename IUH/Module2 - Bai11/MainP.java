public class MainP 
{
    public static void main(String[] args)   
    {
        QuanLy ql = new QuanLy();

        SinhVien sv1 = new SinhVienCaoDang("12345", "Tran Van A", "0979223134", "Nam", "...");
        SinhVien sv2 = new SinhVienTrungCap("512361", "B", "047185934", "Nu", "...");
        SinhVien sv3 = new SinhVienDaiHoc("123466", "C", "123145354235", "Nam", "...");
        SinhVien sv4 = new SinhVienLienKet("34513", "D", "4235614", "Nu", "US");

        ql.themSinhVien(sv1);
        ql.themSinhVien(sv2);
        ql.themSinhVien(sv3);
        ql.themSinhVien(sv4);

        ql.xuatDSSV();
    }
}
