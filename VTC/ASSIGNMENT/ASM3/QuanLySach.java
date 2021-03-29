import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class QuanLySach 
{
    private static HashSet<Sach> setSach;

    public static void init() throws IOException
    {
        setSach = new HashSet<>();
        File file = new File("DanhSachSach.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine())
        {
            String[] data = sc.nextLine().split(",");
            Sach sach = new Sach(data[0], data[1], data[2], Integer.parseInt(data[3]), data[4]);
            themSach(sach);
        }
        sc.close();
    }
    
    public static void save() throws IOException
    {
        File file = new File("DanhSachSach.txt");
        FileWriter fw = new FileWriter(file);
        for (Sach sach : setSach)
            fw.write(sach.toTextSave() + "\n");
        fw.close();
    }

    public static boolean themSach(Sach sach)
    {
        return setSach.add(sach);
    }

    public static boolean capNhatSach(Sach sach)
    {
        for (Sach s : setSach)
            if (s.getMaSach().equals(sach.getMaSach()))
            {
                s.setDanhMuc(sach.getDanhMuc());
                s.setSoLuong(sach.getSoLuong());
                s.setTenSach(sach.getTenSach());
                s.setTenTacGia(sach.getTenTacGia());
                return true;
            }

        return false;
    }

    public static Sach getSachByMaSach(String maSach)
    {
        for (Sach sach : setSach)
            if (sach.getMaSach().equals(maSach))
                return sach;
        return null;
    }

    public static void xemDanhSach()
    {
        System.out.println("=================================================");
        System.out.println("Danh sach sach: ");
        System.out.println("=================================================");
        System.out.printf("%-15s %-25s %-25s %10s %20s\n", "Ma Sach", "Ten Sach", "Ten Tac Gia",
            "So Luong", "Danh Muc");
        System.out.println("=================================================");
        for (Sach sach : setSach)
            System.out.println(sach);
        System.out.println("=================================================");
    }
}
