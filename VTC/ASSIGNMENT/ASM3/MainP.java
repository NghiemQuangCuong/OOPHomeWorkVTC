import java.io.IOException;
import java.util.Scanner;

public class MainP 
{
    private static Scanner sc = new Scanner(System.in);

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    

    private static void menuCapNhatSach()
    {
        boolean isBack = false;
        while (!isBack)
        {
            clearScreen();
            System.out.println("===== Cap nhat thong tin sach =====");
            System.out.print("Nhap ma sach: ");
            String maSach = sc.nextLine();
            System.out.print("Sua ten sach: ");
            String tenSach = sc.nextLine();
            System.out.print("Sua ten tac gia: ");
            String tenTacGia = sc.nextLine();
            System.out.print("Sua so luong: ");
            int soLuong = Integer.parseInt(sc.nextLine());
            System.out.print("Sua danh muc: ");
            String danhMuc = sc.nextLine();

            System.out.print("Ban co muon cap nhat thong tin? (Y/N)");
            String input = sc.nextLine();
            if (input.equals("Y"))
            {
                Sach sach = new Sach(maSach, tenSach, tenTacGia, soLuong, danhMuc);
                if (QuanLySach.capNhatSach(sach))
                    System.out.println("Thong tin da duoc cap nhat!");
                else
                    System.out.println("Khong tim thay ma sach");
            }
            
            System.out.print("Ban muon tiep tuc? (Y/N): ");
            if (sc.nextLine().equals("N"))
                isBack = true;
        }
    }

    private static void menuThemSach()
    {
        boolean isBack = false;
        while (!isBack)
        {
            clearScreen();
            System.out.println("========== Them moi mot quyen sach ==========");
            System.out.print("Nhap ma sach: ");
            String maSach = sc.nextLine();
            System.out.print("Nhap ten sach: ");
            String tenSach = sc.nextLine();
            System.out.print("Nhap ten tac gia: ");
            String tenTacGia = sc.nextLine();
            System.out.print("Nhap so luong: ");
            int soLuong = Integer.parseInt(sc.nextLine());
            System.out.print("Nhap danh muc: ");
            String danhMuc = sc.nextLine();

            Sach sach = new Sach(maSach, tenSach, tenTacGia, soLuong, danhMuc);
            if (QuanLySach.themSach(sach))
                System.out.println("Them sach thanh cong");
            else
                System.out.println("Trung ma sach");

            System.out.print("Ban muon tiep tuc? (Y/N): ");
            if (sc.nextLine().equals("N"))
                isBack = true;
        }
    }

    private static void menuQuanLySach()
    {
        boolean isBack = false;
        while (!isBack)
        {
            clearScreen();
            System.out.println("================================================");
            System.out.println("Quan ly sach");
            System.out.println("1. Xem danh sach sach");
            System.out.println("2. Cap nhat thong tin sach");
            System.out.println("3. Them moi mot quyen sach");
            System.out.println("0. Tro ve menu chinh");
            System.out.println("================================================");
            System.out.print("# Chon: ");
            String userInput = sc.nextLine();
            switch (userInput) 
            {
                case "0":
                    isBack = true;
                    break;
                case "1":
                    clearScreen();
                    QuanLySach.xemDanhSach();
                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;
                case "2":
                    menuCapNhatSach();
                    break;
                case "3":
                    menuThemSach();
                    break;
                default:
                    System.out.println("Unknown Command");
                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;
            }
        }
    }

    private static void menuCapNhatTheThuVien()
    {
        boolean isBack = false;
        while (!isBack)
        {
            clearScreen();
            System.out.println("======= Cap nhat thong tin the =======");
            System.out.print("Nhap ma the: ");
            String maThe = sc.nextLine();
            System.out.print("Sua ten chu the");
            String tenChuThe = sc.nextLine();
            System.out.print("Sua so CMND: ");
            String cmnd = sc.nextLine();

            System.out.print("Ban co muon cap nhat thong tin? (Y/N): ");
            if (sc.nextLine().equals("Y"))
            {
                TheThuVien the = new TheThuVien(maThe, tenChuThe, cmnd);
                if (QuanLyTheThuVien.capNhatThe(the))
                    System.out.println("Thong tin da duoc cap nhat");
                else
                    System.out.println("Khong tim thay ma the");
            }

            System.out.print("Ban muon tiep tuc? (Y/N): ");
            if (sc.nextLine().equals("N"))
                isBack = true;
        }
    }

    private static void menuThemTheThuVien()
    {
        boolean isBack = false;
        while (!isBack)
        {
            clearScreen();
            System.out.println("============ Them moi mot the thu vien ============");
            System.out.print("Nhap ma the: ");
            String maThe = sc.nextLine();
            System.out.print("Nhap ten chu the: ");
            String tenChuThe = sc.nextLine();
            System.out.print("Nhap so CMND: ");
            String cmnd = sc.nextLine();

            TheThuVien the = new TheThuVien(maThe, tenChuThe, cmnd);
            if (QuanLyTheThuVien.themThe(the))
                System.out.println("Them the thanh cong");
            else
                System.out.println("Trung ma the");

            System.out.print("Ban muon tiep tuc? (Y/N): ");
            if (sc.nextLine().equals("N"))
                isBack = true;
        }
    }

    private static void menuQuanLyTheThuVien()
    {
        boolean isBack = false;
        while (!isBack)
        {
            clearScreen();
            System.out.println("================================================");
            System.out.println("Quan ly the thu vien");
            System.out.println("1. Xem danh sach the thu vien");
            System.out.println("2. Cap nhat thong tin the");
            System.out.println("3. Them moi mot the");
            System.out.println("0. Tro ve menu chinh");
            String userInput = sc.nextLine();
            switch (userInput) 
            {
                case "0":
                    isBack = true;
                    break;
                case "1":
                    clearScreen();
                    QuanLyTheThuVien.xemDanhSachThe();
                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;
                case "2":
                    menuCapNhatTheThuVien();
                    break;
                case "3":
                    menuThemTheThuVien();
                    break;
                default:
                    System.out.println("Unknown Command");
                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;
            }
        }
    }

    private static void menuTaoMoiTheMuonSach()
    {
        boolean isBack = false;
        while (!isBack)
        {
            clearScreen();
            System.out.println("========== Tao moi the muon sach trong ngay ==========");
            System.out.print("Nhap ma the: ");
            String maThe = sc.nextLine();
            System.out.print("Nhap ma the thu vien: ");
            String maTheThuVien = sc.nextLine();
            System.out.print("Nhap ten sach muon: ");
            String tenSachMuon = sc.nextLine();
            System.out.print("Nhap ma sach: ");
            String maSach = sc.nextLine();

            if (QuanLyTheThuVien.getTheByMaThe(maTheThuVien) == null)
            {
                System.out.println("Khong tim thay ma the thu vien");
            }
            else if (QuanLySach.getSachByMaSach(maSach) == null)
            {
                System.out.println("Khong tim thay ma sach");
            }
            else   
            {
                if (QuanLyTheMuonSach.taoTheMuon(maThe, maTheThuVien, tenSachMuon, maSach))
                {
                    System.out.println("Tao the muon thanh cong");
                }
                else
                {
                    if (QuanLyTheMuonSach.getTheConLai() == 0)
                        System.out.println("Da het the xuat ra trong ngay");
                    else
                        System.out.println("Trung ma the muon");
                }
            }

            System.out.print("Ban muon tiep tuc? (Y/N): ");
            if (sc.nextLine().equals("N"))
                isBack = true;
        }
    }

    private static void menuQuanLyTheMuonSach()
    {
        boolean isBack = false;
        while (!isBack)
        {
            clearScreen();
            System.out.println("===================================================");
            System.out.println("Quan ly the muon sach");
            System.out.println("1. Tao moi the muon sach");
            System.out.println("2. Tra sach");
            System.out.println("3. Hien thi the muon sach theo ngay muon");
            System.out.println("4. Hien thi the theo nguoi muon");
            System.out.println("0. Tro ve menu chinh");
            String userInput = sc.nextLine();
            switch (userInput)
            {
                case "0":
                    isBack = true;
                    break;
                case "1":
                    menuTaoMoiTheMuonSach();
                    break;
                case "2":
                    clearScreen();
                    QuanLyTheMuonSach.traSach(sc);
                    break;
                case "3":
                    clearScreen();
                    QuanLyTheMuonSach.hienThiTheoNgayMuon(sc);
                    break;
                case "4":
                    clearScreen();
                    QuanLyTheMuonSach.hienThiTheoNguoiMuon(sc);
                    break;
                default:
                    System.out.println("Unknown Command");
                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;
            }
        }
    }

    private static void mainMenu() throws IOException
    {
        boolean isBack = false;
        QuanLySach.init();
        QuanLyTheThuVien.init();
        QuanLyTheMuonSach.init();
        while (!isBack)
        {
            clearScreen();
            System.out.println("========== Chao mung den voi thu vien ==========");
            System.out.println("================================================");
            System.out.println("1. Quan ly sach");
            System.out.println("2. Quan ly the thu vien");
            System.out.println("3. Quan ly the muon sach");
            System.out.println("0. Luu va thoat");
            System.out.println("================================================");
            System.out.print("# Chon: ");
            String userInput = sc.nextLine();
            switch (userInput) 
            {
                case "0":
                    QuanLySach.save();
                    QuanLyTheThuVien.save();
                    QuanLyTheMuonSach.save();
                    isBack = true;
                    break;
                case "1":
                    menuQuanLySach();
                    break;
                case "2":
                    menuQuanLyTheThuVien();
                    break;
                case "3":
                    menuQuanLyTheMuonSach();
                    break;
                default:
                    System.out.println("Unknown Command");
                    System.out.println("Press Enter to continue");
                    sc.nextLine();
                    break;
            }
        }
    }

    public static void main(String[] args) 
    {
        try 
        {
            mainMenu();    
        } catch (Exception e) 
        {
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
        }
       
    }
    
}
