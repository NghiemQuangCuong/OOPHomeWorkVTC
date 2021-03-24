import java.time.LocalDate;
import java.util.Scanner;

public class MainP 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        QuanLyGiangVien ql = new QuanLyGiangVien();

        GiangVienCoHuu gv1 = new GiangVienCoHuu("AAA", LocalDate.of(1976, 4, 3),
             "A", "B", LocalDate.of(2015, 3, 7), 12000000.0, 1.2);
        GiangVienCoHuu gv2 = new GiangVienCoHuu("BBB", LocalDate.of(1976, 4, 3),
             "B", "B", LocalDate.of(2015, 3, 7), 13000000.0, 1.3);
        GiangVienThinhGiang gv3 = new GiangVienThinhGiang("CCC", LocalDate.of(1976, 4, 3),
             "B", "A", LocalDate.of(2015, 3, 7), "IUH");
        GiangVienThinhGiang gv4 = new GiangVienThinhGiang("DDD", LocalDate.of(1976, 4, 3),
             "C", "C", LocalDate.of(2015, 3, 7), "SGU");

        ql.themGiangVien(gv1);
        ql.themGiangVien(gv2);
        ql.themGiangVien(gv3);
        ql.themGiangVien(gv4);

        ql.nhapGioLam(sc);
        System.out.println("-------------------------------------------");
        ql.traCuuGiangVienTheoHocHam("B");
        System.out.println("-------------------------------------------");
        ql.traCuuGiangVienTheoHocVi("B");
        System.out.println("-------------------------------------------");
        ql.traCuuGiangVienTheoTen("DDD");
        System.out.println("-------------------------------------------");
    }    
}
