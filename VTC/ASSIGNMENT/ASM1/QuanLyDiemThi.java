import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyDiemThi 
{
    private static ArrayList<DiemThi> listDiemThi = new ArrayList<DiemThi>();
    
    public static boolean themDiemThi(DiemThi diem)
    {
        if (listDiemThi.contains(diem))
            return false;
        else
        {
            listDiemThi.add(diem);
            return true;
        }
    }

    public static void showDiemThiTheoLop(Scanner sc)
    {
        System.out.println("============================== Diem thi theo lop ===============================");
        System.out.print("Nhap ma lop: ");
        String maLop = sc.nextLine();
        System.out.println("================================================================================");
        for (DiemThi diem : listDiemThi)
            if (diem.getMaLop().equals(maLop))
                System.out.println(diem);
        System.out.println("================================================================================");
    }

    public static void showDiemThiTheoMon(Scanner sc)
    {
        System.out.println("============================== Diem thi theo mon ===============================");
        System.out.print("Nhap mon thi: ");
        String monThi = sc.nextLine();
        System.out.println("================================================================================");
        for (DiemThi diem : listDiemThi)
            if (diem.getMonThi().equals(monThi))
                System.out.println(diem);
        System.out.println("================================================================================");
    }
}
