import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;

public class QuanLyTheMuonSach 
{
    private static HashSet<TheMuonSach> setTheMuon;
    private static int theConLai;

    public static void init()
    {
        setTheMuon = new HashSet<>();
        File file = new File("TheDuocPhatHanh.txt");
        Scanner sc = null;
        try 
        {
            sc = new Scanner(file);    
        } catch (Exception e) 
        {
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();     
        }
        
        int numCreated = Integer.parseInt(sc.nextLine());
        LocalDate date = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        if (date.equals(LocalDate.now()))
        {
            setTheMuon = new HashSet<>();
            theConLai = 100;
            sc.close();
            FileWriter fw = null;
            try 
            {
                fw = new FileWriter(file);
                fw.write("0\n" + date.plusDays(1).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                fw.close();
            } catch (Exception e) 
            {
                System.out.println("Message: " + e.getMessage());
                e.printStackTrace();  
            }
            
        }
        else
        {
            theConLai = 100 - numCreated;
            while (sc.hasNextLine())
            {
                String[] data = sc.nextLine().split(",");
                TheMuonSach the = new TheMuonSach(data[0], data[1], data[4], data[5]);
                the.setGioTao(LocalTime.parse(data[2], DateTimeFormatter.ofPattern("HH:mm")));
                if (!data[3].equals("null"))
                    the.setGioTra(LocalTime.parse(data[3], DateTimeFormatter.ofPattern("HH:mm")));
                setTheMuon.add(the);
            }
        }
    }

    public static void save() throws IOException
    {
        File file = new File("TheDuocPhatHanh.txt");
        FileWriter fw = new FileWriter(file);
        fw.write(100 - theConLai + "\n");
        fw.write(LocalDate.now().plusDays(1).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n");
        for (TheMuonSach the : setTheMuon)
            fw.write(the.toSaveText() + "\n");
        fw.close();
    }

    public static boolean taoTheMuon(String maThe, String maTheThuVien, String tenSachMuon, String maSach)
    {
        if (theConLai > 0)
        {
            TheMuonSach the = new TheMuonSach(maThe, maTheThuVien, tenSachMuon, maSach);
            if (setTheMuon.add(the))
            {
                theConLai--;
                return true;
            }
            else
                return false;
        }
        else   
        {
            return false;
        }
    }

    public static int getTheConLai()
    {
        return theConLai;
    }

    public static void traSach(Scanner sc)
    {
        System.out.println("======================= Tra sach =======================");
        System.out.print("Nhap ma the muon: ");
        String maTheMuon = sc.nextLine();
        System.out.println("========================================================");
        for (TheMuonSach the : setTheMuon)
            if (the.getMaThe().equals(maTheMuon))
            {
                System.out.println("Ma the thu vien: " + the.getMaTheThuVien());
                TheThuVien theTV = QuanLyTheThuVien.getTheByMaThe(the.getMaTheThuVien());
                System.out.println("Ten chu the: " + theTV.getTenChuThe());
                System.out.println("Ten sach muon: " + the.getTenSachMuon());
                System.out.print("Ban muon tra sach? (Y/N): ");
                String userInput = sc.nextLine();
                if (userInput.equals("Y"))
                {
                    the.traSach();
                    System.out.println("Tra sach thanh cong");
                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    return;
                }
                return;
            }
        System.out.println("Khong tim thay ma the muon");
        System.out.println("Tra sach thanh cong");
        System.out.println("Nhan enter de ket thuc");
        sc.nextLine();
    }

    public static void hienThiTheoNgayMuon(Scanner sc)
    {
        System.out.println("====================== The muon sach trong ngay ========================");
        System.out.print("Nhap ngay (dd/mm/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("========================================================================");
        System.out.printf("%-12s %-12s %15s %15s %25s\n", "Ma the", "Ma the thu vien", "Gio tao", "Gio tra", "Ten sach");
        System.out.println("========================================================================");
        for (TheMuonSach the : setTheMuon)
            if (the.getNgayMuon().equals(date))
                System.out.println(the);
        System.out.println("========================================================================");
        System.out.println("Nhap enter de ket thuc");
        sc.nextLine();
    }

    public static void hienThiTheoNguoiMuon(Scanner sc)
    {
        System.out.println("========================================================================");
        System.out.print("Nhap ma the thu vien: ");
        String maTheThuVien = sc.nextLine();
        TheThuVien the = QuanLyTheThuVien.getTheByMaThe(maTheThuVien);
        if (the == null)
        {
            System.out.println("Khong tim thay ma the");
            System.out.println("Nhan enter de ket thuc");
            sc.nextLine();
            return;
        }
        else
        {
            System.out.println("Ten nguoi muon: " + the.getTenChuThe());
            System.out.println("========================================================================");
            System.out.printf("%-15s %-15s %25s\n", "Gio muon", "Gio tra", "Ten sach");
            System.out.println("========================================================================");
            for (TheMuonSach theMuon : setTheMuon)
                if (theMuon.getMaTheThuVien().equals(maTheThuVien))
                {
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
                    System.out.printf("%-15s %-15s %25s\n", theMuon.getGioTao().format(dtf), 
                        ((theMuon.getGioTra() != null) ? theMuon.getGioTra().format(dtf) : "chua tra"),
                        theMuon.getTenSachMuon());
                }
            System.out.println("========================================================================");
        }

        System.out.println("Nhan enter de ket thuc");
        sc.nextLine();
    }
}
