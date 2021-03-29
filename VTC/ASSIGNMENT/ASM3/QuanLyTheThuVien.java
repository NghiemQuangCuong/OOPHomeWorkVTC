import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;

public class QuanLyTheThuVien 
{
    private static HashSet<TheThuVien> setThe;
    public static void init() throws IOException
    {
        setThe = new HashSet<>();
        File file = new File("DanhSachTheThuVien.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine())
        {
            String[] data = sc.nextLine().split(",");
            TheThuVien the = new TheThuVien(data[0], data[1], data[2]);
            the.setNgayTao(LocalDate.parse(data[3], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            themThe(the);
        }
        sc.close();
    }

    public static void save() throws IOException
    {
        File file = new File("DanhSachTheThuVien.txt");
        FileWriter fw = new FileWriter(file);

        for (TheThuVien the : setThe)
            fw.write(the.toTextSave() + "\n");
        fw.close();
    }

    public static boolean themThe(TheThuVien the)
    {
        return setThe.add(the);
    }

    public static boolean capNhatThe(TheThuVien the)
    {
        for (TheThuVien t : setThe)
            if (t.getMaThe().equals(the.getMaThe()))
            {
                t.setTenChuThe(the.getTenChuThe());
                t.setCmnd(the.getCmnd());
                return true;
            }
        
        return false;
    }

    public static TheThuVien getTheByMaThe(String maTheThuVien)
    {
        for (TheThuVien the : setThe)
            if (the.getMaThe().equals(maTheThuVien))
                return the;
        return null;
    }

    public static void xemDanhSachThe()
    {
        System.out.println("=======================================================");
        System.out.println("Danh sach the thu vien");
        System.out.println("=======================================================");
        System.out.printf("%-12s %-25s %20s %20s\n", "Ma The", "Ten Chu The", "CMND", "Ngay tao");
        for (TheThuVien the : setThe)
            System.out.println(the);
        System.out.println("=======================================================");
    }
}
