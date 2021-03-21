import java.util.Scanner;

public class MainP 
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[ ] args)
    {
        QuanLySinhVien qlsv = new QuanLySinhVien();

        SinhVien sv1 = new SinhVien("12345", "Lao Hac", 1997);
        SinhVien sv2 = new SinhVien("12346", "Cau Vang", 2002);
        SinhVien sv3 = new SinhVien("12347", "Ong Giao", 2000);
        SinhVien sv4 = new SinhVien("12348", "Thang mua cho 1", 2001);
        SinhVien sv5 = new SinhVien("12349", "Thang mua cho 2", 2001);
        SinhVien sv6 = new SinhVien("12345", "Em lao hac", 1997);

        qlsv.themSinhVien(sv1);
        qlsv.themSinhVien(sv2);
        qlsv.themSinhVien(sv3);
        qlsv.themSinhVien(sv4);
        qlsv.themSinhVien(sv5);
        qlsv.themSinhVien(sv6);

        qlsv.sortListWithAscendingName();
        qlsv.showList();
    }
}
