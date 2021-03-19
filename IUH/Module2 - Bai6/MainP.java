import java.util.Scanner;

public class MainP 
{
    public static Scanner sc = new Scanner(System.in);
    private static DanhSachHoaDon listHoaDon = new DanhSachHoaDon(999);

    public static void clearScreen() 
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    public static void mainMenu() throws Exception
    {
        boolean isStop = false;
        while (!isStop)
        {
            clearScreen();
            System.out.println("====================Quan Ly Hoa Don Thue Phong====================");
            System.out.println("------------------------------------------------------------------");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("1. Them Hoa Don Theo Gio");
            System.out.println("2. Them Hoa Don Theo Ngay");
            System.out.println("3. Xuat Toan Bo Hoa Don");
            System.out.println("4. Xuat so luong hoa don theo gio");
            System.out.println("5. Xuat so luong hoa don theo ngay");
            System.out.println("6. Tinh tong thanh tien tu nam, thang nhat dinh");
            String userInput = sc.nextLine();
            switch (userInput)
            {
                case "0":
                    isStop = true;
                    break;
                case "1":
                    HoaDonGio hdG = HoaDonGio.createByInput();
                    listHoaDon.them(hdG);
                    System.out.println("------------------------");
                    System.out.println("Da them thanh cong!");
                    Thread.sleep(1000);
                    break;
                case "2":
                    HoaDonNgay hdN = HoaDonNgay.createByInput();
                    listHoaDon.them(hdN);
                    System.out.println("------------------------");
                    System.out.println("Da them thanh cong!");
                    Thread.sleep(1000);
                    break;
                case "3":
                    listHoaDon.xuat();
                    System.out.println("----------------------");
                    System.out.println("Xuat hoa don thanh cong!");
                    Thread.sleep(1000);
                    break;
                case "4":
                    System.out.println("So luong hoa don theo gio: " + listHoaDon.thongKeSoLuongHoaDonTheoGio());
                    Thread.sleep(1000);
                    break;
                case "5":
                    System.out.println("So luong hoa don theo ngay: " + listHoaDon.thongKeSoLuongHoaDonTheoNgay());
                    Thread.sleep(1000);
                    break;
                case "6":
                    clearScreen();
                    System.out.println("Nhap nam: ");
                    int nam = sc.nextInt();
                    System.out.println("Nhap thang: ");
                    int thang = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Tong tien ke thu thang " + thang + ", nam " + nam + ": " + listHoaDon.tinhTongThanhTien(thang, nam));
                    Thread.sleep(1000);
                default:
                    System.out.println("Unknown Command!");
                    Thread.sleep(1000);
                    break;
            }
        }
    }

    public static void main(String[] args) throws Exception
    {
        mainMenu();
    }
}
