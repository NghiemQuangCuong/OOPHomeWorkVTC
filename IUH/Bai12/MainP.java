import java.time.LocalDate;
import java.util.Scanner;

public class MainP 
{
    private static Scanner sc = new Scanner(System.in);
    private static QuanLy quanLy = new QuanLy();

    private static void clearScreen() 
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    private static void menuKhoaHoc()
    {
        boolean isBack = false;
        while (!isBack)
        {
            clearScreen();
            System.out.println("0. Tro ve chuong trinh chinh");
            System.out.println("1. Them Khoa Hoc");
            System.out.println("2. Tim Khoa Hoc theo ten");
            System.out.println("3. In Khoa Hoc chua ket thuc");
            System.out.println("4. In Khoa hoc chua bat dau");
            String userInput = sc.nextLine();
            switch (userInput)
            {
                case "0":
                    isBack = true;
                    break;
                case "1":
                {
                    clearScreen();
                    KhoaHoc kh = KhoaHoc.createByInput();
                    quanLy.addKhoaHoc(kh);
                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;
                }
                    
                case "2":
                {
                    clearScreen();
                    System.out.println("Nhap ten khoa hoc: ");
                    String tenKhoaHoc = sc.nextLine();
                    KhoaHoc kh = quanLy.getKhoaHocByName(tenKhoaHoc);
                    if (kh == null)
                    {
                        System.out.println("Khong tim thay khoa hoc");
                    }
                    else
                    {
                        System.out.println("Chi Tiet Khoa Hoc: ");
                        System.out.println(kh.chiTietKhoaHoc());
                        System.out.println("Danh sach hoc vien: ");
                        kh.inDanhSachHocVien();
                    }
                    System.out.println("nhan enter de quay lai");
                    sc.nextLine();
                    break;
                }
                case "3":
                {
                    clearScreen();
                    System.out.println("Khoa hoc chua ket thuc: ");
                    quanLy.printKhoaHocChuaKetThuc();
                    System.out.println("nhan enter de quay lai");
                    sc.nextLine();
                    break;
                }
                case "4":
                {
                    clearScreen();
                    System.out.println("Khoa hoc chua bat dau: ");
                    quanLy.printKhoaHocChuaBatDau();
                    System.out.println("nhan enter de quay lai");
                    sc.nextLine();
                    break;
                }
                default:
                    clearScreen();
                    System.out.println("Unknown Command");
                    System.out.println("nhan enter de quay lai");
                    sc.nextLine();
                    break;
            }
        }
    }

    private static void menuHocVien()
    {
        boolean isBack = false;
        while (!isBack)
        {
            clearScreen();
            System.out.println("0. Tro ve chuong trinh chinh");
            System.out.println("1. Them Hoc Vien vao Khoa hoc");
            System.out.println("2. Tim Hoc vien theo so dien thoai");
            String userInput = sc.nextLine();
            switch (userInput)
            {
                case "0":
                    isBack = true;
                    break;
                case "1":
                {
                    clearScreen();
                    System.out.println("Nhap ten khoa hoc: ");
                    String tenKhoaHoc = sc.nextLine();
                    KhoaHoc kh = quanLy.getKhoaHocByName(tenKhoaHoc);
                    if (kh == null)
                    {
                        System.out.println("Khong tim thay Khoa hoc de them vao");
                    }
                    else
                    {
                        HocVien hv = HocVien.createByInput();
                        quanLy.addHocVienToKhoaHoc(hv, kh);
                    }
                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;
                }
                case "2":
                {
                    clearScreen();
                    System.out.println("Nhap ten so dien thoai: ");
                    String soDienThoai = sc.nextLine();
                    HocVien hv = quanLy.getHocVienByPhone(soDienThoai);
                    if (hv == null)
                    {
                        System.out.println("Khong tim thay hoc vien");
                    }
                    else
                    {
                        System.out.println("Chi Tiet Hoc Vien: ");
                        System.out.println(hv.chiTietHocVien());
                        System.out.println("Danh sach Khoa hoc hoc vien da tham gia: ");
                        hv.inDSKhoaHoc();
                    }
                    System.out.println("nhan enter de quay lai");
                    sc.nextLine();
                    break;
                }
                default:
                    System.out.println("Unknown Command");
                    System.out.println("nhan enter de quay lai");
                    sc.nextLine();
                    break;
            }
        }
    }

    private static void mainMenu()
    {
        boolean isStop = false;
        while (!isStop)
        {
            clearScreen();
            System.out.println("================Chuong Trinh Quan Ly Trung Tam Dao Tao================");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("0. Thoat Chuong Trinh");
            System.out.println("1. Khoa Hoc");
            System.out.println("2. Hoc Vien");
            String userInput = sc.nextLine();
            switch (userInput)
            {
                case "0":
                    isStop = true;
                    break;
                case "1":
                    menuKhoaHoc();
                    break;
                case "2":
                    menuHocVien();
                    break;
                default:
                    System.out.println("Unknown Command");
                    break;
            }
        }
    }

    public static void main(String[] args)
    {
        mainMenu();

        // QuanLy ql = new QuanLy();

        // KhoaHoc kh1 = new KhoaHoc("DATASTRUCTURE", LocalDate.of(2021, 4, 1), 60);
        // KhoaHoc kh2 = new KhoaHoc("OOP", LocalDate.of(2021, 1, 1), 30);
        // KhoaHoc kh3 = new KhoaHoc("NETWORK_PROGRAMMING", LocalDate.of(2021, 3, 2), 15);
        // KhoaHoc kh4 = new KhoaHoc("GAME_ENGINE", LocalDate.of(2020, 11, 23), 120);

        // HocVien hv1 = new HocVien("Nghiem Quang Cuong", "319 Doan Van Bo", "0352893327");
        // HocVien hv2 = new HocVien("Ly Toan Hanh", "244 Truong Chinh", "0976879431");
        // HocVien hv3 = new HocVien("Truong Quoc Khanh", "144 Au Co", "0987665543");
        // HocVien hv4 = new HocVien("Dang Ngoc Khoa", "109 Nguyen Hue", "0352889765");

    }
}
