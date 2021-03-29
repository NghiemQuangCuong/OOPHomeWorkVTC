import java.util.Scanner;

public class MainP 
{
    private static Scanner sc = new Scanner(System.in);

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    public static void menuCapNhatMatHang() throws Exception
    {
        boolean isBack = false;
        while (!isBack)
        {
            clearScreen();
            System.out.println("====== Cap nhat thong tin mat hang ======");
            System.out.print("Nhap ma mat hang: ");
            String maHang = sc.nextLine();
            if (!DSMH.contains(maHang))
                throw new Exception("Loi: Ma mat hang khong ton tai");
            System.out.print("Sua ten mat hang: ");
            String tenHang = sc.nextLine();
            System.out.print("Sua kieu dong goi: ");
            String kieuDongGoi = sc.nextLine();
            System.out.print("Sua so luong: ");
            int soLuong = Integer.parseInt(sc.nextLine());
            System.out.println("Sua gia: ");
            double donGia = Double.parseDouble(sc.nextLine());

            System.out.print("Ban co muon cap nhat thong tin? (Y/N): ");
            String input1 = sc.nextLine();

            if (input1.equals("Y"))
            {
                if (DSMH.capNhatMatHang(maHang, tenHang, kieuDongGoi, soLuong, donGia))
                    System.out.println("Thong tin da duoc cap nhat!");
                else   
                    System.out.println("Khong tim thay ma mat hang");
            }

            System.out.print("Ban muon tiep tuc? (Y/N): ");
            String input2 = sc.nextLine();
            if (input2.equals("N"))
                isBack = true;
        }
    }

    public static void menuThemMatHang()
    {
        boolean isBack = false;
        while (!isBack)
        {
            clearScreen();
            System.out.println("========== Them moi mot mat hang ==========");
            System.out.print("Nhap ma mat hang: ");
            String maHang = sc.nextLine();
            System.out.print("Nhap ten mat hang: ");
            String tenHang = sc.nextLine();
            System.out.print("Nhap kieu dong goi: ");
            String kieuDongGoi = sc.nextLine();
            System.out.print("Nhap so luong: ");
            int soLuong = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap don gia: ");
            double donGia = Double.parseDouble(sc.nextLine());

            if (DSMH.themMoiMatHang(new MatHang(maHang, tenHang, kieuDongGoi, soLuong, donGia)))
                System.out.println("Them mat hang thanh cong!");
            else
                System.out.println("Them mat hang that bai, ma hang bi trung");

            System.out.print("Ban muon tiep tuc? (Y/N): ");
            String input = sc.nextLine();

            if (input.equals("N"))
                isBack = true;
        }
    }

    public static void menuMatHang() throws Exception
    {
        boolean isBack = false;
        while (!isBack)
        {
            clearScreen();
            System.out.println("============================================");
            System.out.println("Quan ly danh sach mat hang");
            System.out.println("1. Xem danh sach cac mat hang");
            System.out.println("2. Cap nhat thong tin mat hang");
            System.out.println("3. Them moi mot mat hang");
            System.out.println("0. Tro ve menu chinh");
            System.out.println("============================================");
            System.out.print("# Chon: ");
            String userInput = sc.nextLine();
            switch (userInput) 
            {
                case "0":
                    isBack = true;
                    break;
                case "1":
                    clearScreen();
                    DSMH.showDSMH();
                    System.out.println("Press Enter to continue");
                    sc.nextLine();
                    break;
                case "2":
                    menuCapNhatMatHang();
                    break;
                case "3":
                    menuThemMatHang();
                    break;
                default:
                    System.out.println("Unknown Command");
                    break;
            }
        }
    }

    public static void menuCapNhatKhachHang()
    {
        boolean isBack = false;
        while (!isBack)
        {
            System.out.println("======= Cap nhat khach hang =======");
            System.out.print("Nhap ma khach hang: ");
            String maKhachHang = sc.nextLine();
            System.out.print("Sua ten khach hang: ");
            String tenKhachHang = sc.nextLine();
            System.out.print("Sua so dien thoai: ");
            String soDienThoai = sc.nextLine();

            System.out.print("Ban co muon cap nhat thong tin? (Y/N): ");
            String input = sc.nextLine();
            if (input.equals("Y"))
            {
                if (DSKH.capNhatKhachHang(maKhachHang, tenKhachHang, soDienThoai))
                    System.out.println("Cap nhat khach hang thanh cong!");
                else
                    System.out.println("Khong tim thay ma khach hang");
            }
            
            System.out.print("Ban muon tiep tuc? (Y/N): ");
            if (sc.nextLine().equals("N"))
                isBack = true;
        }
    }

    public static void menuThemMoiKhachHang()
    {
        boolean isBack = false;
        while (!isBack)
        {
            System.out.println("========== Them moi khach hang ==========");
            System.out.print("Nhap ma khach hang: ");
            String maKhachHang = sc.nextLine();
            System.out.print("Nhap ten khach hang: ");
            String tenKhachHang = sc.nextLine();
            System.out.print("Nhap so dien thoai: ");
            String soDienThoai = sc.nextLine();

            KhachHang kh = new KhachHang(maKhachHang, tenKhachHang, soDienThoai);

            if (DSKH.themKhachHang(kh))
                System.out.println("Them khach hang thanh cong");
            else
                System.out.println("Khach hang da co trong danh sach");

            System.out.print("Ban muon tiep tuc? (Y/N): ");
            if (sc.nextLine().equals("N"))
                isBack = true;
        }
    }

    public static void menuKhachHang()
    {
        boolean isBack = false;
        while (!isBack)
        {
            clearScreen();
            System.out.println("============================================");
            System.out.println("Quan ly khach hang");
            System.out.println("1. Xem danh sach khach hang");
            System.out.println("2. Cap nhat thong tin khach hang");
            System.out.println("3. Them moi mot khach hang");
            System.out.println("0. Tro ve menu chinh");
            System.out.println("============================================");
            System.out.print("# Chon: ");
            String userInput = sc.nextLine();
            switch (userInput)
            {
                case "0":
                    isBack = true;
                    break;
                case "1":
                    clearScreen();
                    DSKH.showDSKH();
                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;
                case "2":
                    menuCapNhatKhachHang();
                    break;
                case "3":
                    menuThemMoiKhachHang();
                    break;
                default:
                    System.out.println("Unknown Command");
                    break;
            }
        }
    }

    public static void menuHoaDon() throws Exception
    {
        boolean isBack = false;
        while (!isBack)
        {
            System.out.println("============================================");
            System.out.println("Quan ly hoa don");
            System.out.println("1. Tao moi hoa don");
            System.out.println("2. Hien thi hoa don theo ma nhan vien thanh toan");
            System.out.println("3. Hien thi hoa don theo ngay tao");
            System.out.println("0. Tro ve menu chinh");
            System.out.println("============================================");
            System.out.print("#Chon: ");
            String userInput = sc.nextLine();
            switch (userInput)
            {
                case "0":
                    isBack = true;
                    break;
                case "1":
                    DSHD.taoMoiHoaDon(sc);
                    break;
                case "2":
                    DSHD.showHoaDonTheoMaNhanVien(sc);
                    break;
                case "3":
                    DSHD.showHoaDonTheoNgay(sc);
                    break;
                default:
                    System.out.println("Unknown Command");
                    break;
            }
        }
    }

    public static void mainMenu() throws Exception
    {
        boolean isBack = false;
        while (!isBack)
        {
            clearScreen();
            System.out.println("--- Chao mung den voi cua hang ---");
            System.out.println("============================================");
            System.out.println("1. Quan ly danh sach mat hang");
            System.out.println("2. Quan ly khach hang");
            System.out.println("3. Quan ly hoa don");
            System.out.println("0. Thoat");
            System.out.println("============================================");
            System.out.print("# Chon: ");
            String userInput = sc.nextLine();
            switch (userInput)
            {
                case "0":
                    isBack = true;
                    break;
                case "1":
                    menuMatHang();
                    break;
                case "2":
                    menuKhachHang();
                    break;
                case "3":
                    menuHoaDon();
                    break;
                default:
                    System.out.println("Unknown Command");
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
            e.printStackTrace();
        }
        
    }   
}
