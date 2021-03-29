import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainP 
{
    private static Scanner sc = new Scanner(System.in);

    public static void clearScreen() 
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    public static void menuCapNhatSinhVien()
    {
        boolean isBack = false;
        while (!isBack)
        {
            clearScreen();
            System.out.println("===== Cap nhat thong tin sinh vien =====");
            System.out.print("Nhap ma sinh vien: ");
            String maSV = sc.nextLine();
            System.out.print("Sua ten sinh vien: ");
            String tenSV = sc.nextLine();
            System.out.print("Sua dia chi: ");
            String diaChiSV = sc.nextLine();
            System.out.print("Sua ngay sinh: ");
            String ngaySinhSV = sc.nextLine();
            System.out.println("Danh sach ma lop hien tai: " + QuanLyLop.getMaLopText());
            System.out.print("Sua ma lop (Can co mat trong ds lop hien tai): ");
            String maLopSV = sc.nextLine();

            System.out.print("Ban co muon cap nhat thong tin? (Y/N): ");
            String cont = sc.nextLine();

            boolean success = true;
            if (cont.equals("Y"))
            {
                LocalDate ngay = LocalDate.parse(ngaySinhSV, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                LopHoc lop = QuanLyLop.getLopHocByID(maLopSV);
                if (lop == null)
                {
                    success = false;
                }
                else
                {
                    if (QuanLySinhVien.capNhatSinhVien(maSV, tenSV, diaChiSV, ngay, maLopSV))
                    {
                        System.out.println("Thong tin da duoc cap nhat!");
                    }
                    else
                        success = false;
                }

                if (!success)
                    System.out.println("Loi khong tim thay ma sinh vien hoac ma lop hoc");
            }

            System.out.println("Ban muon tiep tuc? (Y/N): ");
            String conti = sc.nextLine();
            if (conti.equals("N"))
                isBack = true;
        }
    }

    public static void menuThemSinhVien()
    {
        boolean isBack = false;
        while (!isBack)
        {
            System.out.println("======= Them moi mot sinh vien =======");
            System.out.print("Nhap ma sinh vien: ");
            String maSV = sc.nextLine();
            System.out.print("Nhap ten sinh vien: ");
            String tenSV = sc.nextLine();
            System.out.print("Nhap dia chi: ");
            String diaChiSV = sc.nextLine();
            System.out.print("Nhap ngay sinh: ");
            String ngaySinhSV = sc.nextLine();
            System.out.println("Danh sach ma lop hien tai: " + QuanLyLop.getMaLopText());
            System.out.print("Nhap ma lop (can nhap ma lop co trong danh sach): ");
            String maLopSV = sc.nextLine();

            boolean success = true;
            if (QuanLyLop.getLopHocByID(maLopSV) == null)
            {
                success = false;
            }
            else
            {
                SinhVien sv = new SinhVien(maSV, tenSV, diaChiSV, LocalDate.parse(ngaySinhSV, DateTimeFormatter.ofPattern("dd/MM/yyyy")), maLopSV);
                if (QuanLySinhVien.themSinhVien(sv))
                    System.out.println("Them hoc vien thanh cong");
                else
                    success = false;
            }

            if (!success)
                System.out.println("Them sinh vien that bai, sinh vien da co san hoac lop hoc khong hop le");
            
            System.out.println("Ban muon tiep tuc? (Y/N): ");
            String input = sc.nextLine();

            if (input.equals("N"))
                isBack = true;
        }
    }

    public static void menuSinhVien()
    {
        boolean isBack = false;
        while (!isBack)
        {
            clearScreen();
            System.out.println("=========================================");
            System.out.println("Quan ly danh sach sinh vien");
            System.out.println("1. Xem danh sach sinh vien");
            System.out.println("2. Cap nhat thong tin sinh vien");
            System.out.println("3. Them moi mot sinh vien");
            System.out.println("0. Tro ve menu chinh");
            String userInput = sc.nextLine();
            switch (userInput) 
            {
                case "0":
                    isBack = true;
                    break;
                case "1":
                    clearScreen();
                    QuanLySinhVien.showDanhSachSinhVien();
                    break;
                case "2":
                    menuCapNhatSinhVien();
                    break;
                case "3":
                    menuThemSinhVien();
                    break;
                default:
                    System.out.println("Unknown command!");
                    break;
            }
        }
    }
    
    public static void menuCapNhatLop()
    {
        boolean isBack = false;
        while (!isBack)
        {
            System.out.println("======== Cap nhat thong tin lop hoc =========");
            System.out.print("Nhap ma lop: ");
            String maLop = sc.nextLine();
            System.out.print("Sua mo ta lop hoc: ");
            String moTa = sc.nextLine();
            System.out.println("Sua giang vien: ");
            String giangVien = sc.nextLine();
            System.out.print("Sua thoi gian bat dau hoc (hh:mm): ");
            LocalTime thoiGianBatDauHoc = LocalTime.parse(sc.nextLine());
            System.out.print("Sua thoi gian ket thuc (hh:mm): ");
            LocalTime thoiGianKetThuc = LocalTime.parse(sc.nextLine());
            System.out.println("Sua ngay hoc (1 = 2 - 4 - 6, else = 3 - 5 - 7): ");
            NgayHoc ngayHoc = (sc.nextLine().equals("1")) ? NgayHoc.HAI_TU_SAU : NgayHoc.BA_NAM_BAY;

            Pair<LocalTime, LocalTime> gioHoc = new Pair<>(thoiGianBatDauHoc, thoiGianKetThuc);

            System.out.print("Ban co muon cap nhat thong tin? (Y/N) ");
            String input = sc.nextLine();

            if (input.equals("Y"))
            {
                if (QuanLyLop.capNhatLopHoc(maLop, moTa, giangVien, gioHoc, ngayHoc))
                {
                    System.out.println("Da cap nhap thanh cong!");
                }
                else
                    System.out.println("Cap nhap that bai do khong tim thay lop");
            }

            System.out.print("Ban muon tiep tuc? (Y/N): ");
            String conti = sc.nextLine();

            if (conti.equals("N"))
                isBack = true;
        }
    }

    public static void menuThemLop()
    {
        boolean isBack = false;
        while (!isBack)
        {
            System.out.println("========== Them moi mot lop ==========");
            System.out.print("Nhap ma lop: ");
            String maLop = sc.nextLine();
            System.out.print("Nhap mo ta lop: ");
            String moTa = sc.nextLine();
            System.out.print("Nhap giang vien: ");
            String giangVien = sc.nextLine();
            System.out.print("Nhap thoi gian bat dau (hh:mm): ");
            LocalTime tgbd = LocalTime.parse(sc.nextLine());
            System.out.print("Nhap thoi gian ket thuc (hh:mm): ");
            LocalTime tgkt = LocalTime.parse(sc.nextLine());
            System.out.print("Nhap ngay hoc (1 = 2 - 4 - 6, else = 3 - 5 - 7): ");
            NgayHoc ngayHoc = (sc.nextLine().equals("1")) ? NgayHoc.HAI_TU_SAU : NgayHoc.BA_NAM_BAY;

            Pair<LocalTime, LocalTime> thoiGianHoc = new Pair<>(tgbd, tgkt);
            if (QuanLyLop.themLop(new LopHoc(maLop, moTa, giangVien, thoiGianHoc, ngayHoc)))
            {
                System.out.println("Them lop hoc thanh cong");
            }
            else
            {
                System.out.println("Them lop hoc that bai do trung ma lop");
            }

            System.out.println("Ban muon tiep tuc? (Y/N): ");
            String input = sc.nextLine();
            if (input.equals("N"))
                isBack = true;
        }
    }

    public static void menuLopHoc()
    {
        boolean isBack = false;
        while (!isBack)
        {
            System.out.println("=========================================");
            System.out.println("Quan ly lop");
            System.out.println("1. Xem danh sach lop");
            System.out.println("2. Cap nhat thong tin lop");
            System.out.println("3. Them mot lop moi");
            System.out.println("0. Tro ve menu chinh");
            System.out.println("=========================================");
            System.out.print("#Chon: ");
            String userInput = sc.nextLine();
            switch (userInput) 
            {
                case "0":
                    isBack = true;
                    break;
                case "1":
                    QuanLyLop.showDanhSachLopHoc();
                    break;
                case "2":
                    menuCapNhatLop();
                    break;
                case "3":
                    menuThemLop();
                    break;
                default:
                    break;
            }
        }
    }

    public static void menuNhapDiemThi()
    {
        boolean isBack = false;
        while (!isBack)
        {
            System.out.println("========== Nhap diem thi ==========");
            System.out.print("Nhap ma sinh vien: ");
            String maSV = sc.nextLine();
            System.out.print("Nhap mon thi: ");
            String monThi = sc.nextLine();
            System.out.print("Nhap diem (1-20): ");
            int diemThi = Integer.parseInt(sc.nextLine());

            if (QuanLySinhVien.getSinhVienByID(maSV) == null)
            {
                System.out.println("Khong tim thay ma sinh vien");
            }
            else
            {
                if (QuanLyDiemThi.themDiemThi(new DiemThi(maSV, monThi, diemThi)))
                {
                    System.out.println("Them diem thanh cong");
                }
                else
                {
                    System.out.println("Sinh vien da co diem");
                }
            }

            System.out.print("Ban muon tiep tuc? (Y/N): ");
            String input = sc.nextLine();

            if (input.equals("N"))
                isBack = true;
        }
    }

    public static void menuDiemThi()
    {
        boolean isBack = false;
        while (!isBack)
        {
            System.out.println("=========================================");
            System.out.println("Quan ly diem thi");
            System.out.println("1. Nhap diem thi");
            System.out.println("2. Hien thi diem thi theo lop");
            System.out.println("3. Hien thi diem thi theo mon");
            System.out.println("0. Tro ve menu chinh");
            String userInput = sc.nextLine();
            switch (userInput) 
            {
                case "0":
                    isBack = true;
                    break;
                case "1":
                    menuNhapDiemThi();
                    break;
                case "2":
                    QuanLyDiemThi.showDiemThiTheoLop(sc);
                    break;
                case "3":
                    QuanLyDiemThi.showDiemThiTheoMon(sc);
                    break;
                default:
                    break;
            }
        }
    }

    public static void mainMenu()
    {
        boolean isBack = false;
        while (!isBack)
        {
            clearScreen();
            System.out.println("--- Chao Mung Den Voi VTC Academy ---");
            System.out.println("=========================================");
            System.out.println("1. Quan ly danh sach sinh vien");
            System.out.println("2. Quan ly lop hoc");
            System.out.println("3. Quan ly diem thi");
            System.out.println("0. Thoat");
            System.out.println("=========================================");
            System.out.print("#Chon: ");
            String userInput = sc.nextLine();
            switch (userInput) 
            {
                case "0":
                    isBack = true;
                    break;
                case "1":
                    menuSinhVien();
                    break;
                case "2":
                    menuLopHoc();
                    break;
                case "3":
                    menuDiemThi();
                    break;
                default:
                    System.out.println("Unknown Command!");
                    break;
            }
        }
    }

    public static void main(String[] args)
    {
        mainMenu();
    }
}
