import java.util.ArrayList;
import java.util.Scanner;

public class MainP 
{
    public static void mainMenu()
    {
        Scanner sc = new Scanner(System.in);
        DanhSachSanPham ds = new DanhSachSanPham();
        boolean isStop = false;
        while (!isStop)
        {
            System.out.println("===== Quan Ly San Pham =====");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("1. Them san pham sach");
            System.out.println("2. Them san pham bang dia");
            System.out.println("3. Xoa san pham");
            System.out.println("4. Cap nhap san pham");
            System.out.println("5. Tim kiem san pham theo tu khoa");
            System.out.println("6. Tim kiem san pham trong khoang gia");
            System.out.println("7. Sap xep cac san pham giam dan theo gia");
            System.out.println("8. Xem danh sach san pham");
            String userInput = sc.nextLine();
            switch (userInput)
            {
                case "0":
                    isStop = true;
                    break;
                case "1":
                    Sach sachCanThem = Sach.nhapSanPham(sc);
                    ds.themSanPham(sachCanThem);
                    break;
                case "2":
                    BangDia bangDiaCanThem = BangDia.nhapSanPham(sc);
                    ds.themSanPham(bangDiaCanThem);
                    break;
                case "3":
                    System.out.print("Nhap ma sp muon xoa: ");
                    String ma = sc.nextLine();
                    if (ds.xoaSanPham(ma))
                        System.out.println("Xoa thanh cong");
                    else
                        System.out.println("Khong tim thay ma san pham trong danh sach");
                    break;
                case "4":
                    System.out.print("Nhap ma san pham can cap nhap: ");
                    String maa = sc.nextLine();
                    System.out.print("Nhap ten moi: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhap mo ta moi: ");
                    String moTa = sc.nextLine();
                    System.out.print("Nhap gia ban moi: ");
                    double giaBan = Double.parseDouble(sc.nextLine());
                    ds.capNhapSanPham(maa, ten, moTa, giaBan);
                    break;
                case "5":
                    System.out.print("Nhap tu khoa can tim kiem: ");
                    ArrayList<SanPham> result = ds.timKiem(sc.nextLine());
                    System.out.println("Ket qua tim kiem: ");
                    for (SanPham sp : result)
                        System.out.println(sp);
                    break;
                case "6":
                    System.out.print("Nhap gia toi thieu: ");
                    double min = Double.parseDouble(sc.nextLine());
                    System.out.print("Nhap gia toi da: ");
                    double max = Double.parseDouble(sc.nextLine());
                    ArrayList<SanPham> resultt = ds.timKiem(min, max);
                    System.out.println("Ket qua tim kiem: ");
                    for (SanPham sp : resultt)
                        System.out.println(sp);
                    break;

                case "7":
                    ds.sapXep();
                    System.out.println("Da sap xep thanh cong");
                    break;
                case "8":
                    ds.hienThi();
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
    }
    
}
