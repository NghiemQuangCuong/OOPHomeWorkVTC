import java.util.ArrayList;
import java.util.Scanner;

public class MainP 
{
    public static Scanner sc = new Scanner(System.in);
    public static QuanLyPhongHoc qlph = new QuanLyPhongHoc();

    public static void mainMenu()
    {
        boolean isStop = false;
        while (!isStop)
        {
            System.out.println("=====Quan Ly Phong Hoc=====");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("1. Tim kiem phong theo ma so");
            System.out.println("2. In toan bo danh sach phong hoc");
            System.out.println("3. In danh sach phong hoc dat chuan");
            System.out.println("4. Sap xep danh sach tang dan theo day nha");
            System.out.println("5. Sap xep danh sach giam dan theo dien tich");
            System.out.println("6. Sap xep danh sach tang dan theo bong den");
            System.out.println("7. Cap nhap so may tinh theo ma so phong hoc");
            System.out.println("8. Xoa phong hoc theo ma so");
            System.out.println("9. Tong so luong phong hoc");
            System.out.println("10. In danh sach cac phong hoc may tinh co so may tinh tren 60");
            String userInput = sc.nextLine();
            switch (userInput)
            {
                case "0":
                    isStop = true;
                    break;
                case "1":
                    {
                        System.out.println("Nhap ma so can tim kiem");
                        String input = sc.nextLine();
                        PhongHoc ph = qlph.getPhongHocByMaPhong(input);
                        if (ph == null)
                            System.out.println("Khong tim thay phong hoc");
                        else
                            System.out.println(ph.getInfo());
                        break;
                    }
                case "2":
                    {
                        System.out.println(qlph.getInfoAllRoom());
                        break;
                    }
                case "3":
                    {
                        System.out.println(qlph.getInfoStandardRoom());
                        break;
                    }
                case "4":
                    {
                        qlph.sortWithAscendingDayNha();
                        System.out.println(qlph.getInfoAllRoom());
                        break;
                    }
                case "5":
                    {
                        qlph.sortWithDescendingDienTich();
                        System.out.println(qlph.getInfoAllRoom());
                        break;
                    }
                case "6":
                    {
                        qlph.sortWithAscendingBongDen();
                        System.out.println(qlph.getInfoAllRoom());
                        break;
                    }
                case "7":
                    {
                        qlph.editComputerWithMaPhong();
                        break;
                    }
                case "8":
                    {
                        qlph.xoaPhongHocWithMaPhong();
                        break;
                    }
                case "9":
                    {
                        System.out.println("Tong so luong phong hoc: " + qlph.tongSoPhongHoc());
                        break;
                    }
                case "10":
                    {
                        ArrayList<PhongHoc> list = qlph.getRoomListWithMoreThan60Comps();
                        for (PhongHoc ph : list)
                            System.out.println(ph.getInfo());
                        break;
                    }
                default:
                    {
                        System.out.println("Unknown Command!");
                        break;
                    }
            }
        }
    }

    public static void main(String[] args) 
    {
        PhongLyThuyet ph1 = new PhongLyThuyet("0001", "A", 15.0, 4, true);
        PhongLyThuyet ph2 = new PhongLyThuyet("0002", "B", 15.5, 4, true);
        PhongLyThuyet ph3 = new PhongLyThuyet("0003", "C", 22.5, 2, false);
        PhongLyThuyet ph4 = new PhongLyThuyet("0004", "D", 12.0, 1, false);

        PhongMayTinh ph5 = new PhongMayTinh("0005", "A", 30, 5, 15);
        PhongMayTinh ph6 = new PhongMayTinh("0006", "A", 22, 5, 10);
        PhongMayTinh ph7 = new PhongMayTinh("0007", "B", 60, 10, 60);
        PhongMayTinh ph8 = new PhongMayTinh("0008", "A", 50, 1, 2);

        PhongThiNghiem ph9 = new PhongThiNghiem("0009", "A", 40, 10,
             "Hoa", 40, true);
        PhongThiNghiem ph10 = new PhongThiNghiem("0010", "B", 50, 15,
             "Ly", 50, false);
        PhongThiNghiem ph11 = new PhongThiNghiem("0011", "C", 20, 2,
             "Hoa", 10, true);
        PhongThiNghiem ph12 = new PhongThiNghiem("0012", "D", 25, 5,
             "Sinh", 20, false);
        qlph.themPhongHoc(ph1);
        qlph.themPhongHoc(ph2);
        qlph.themPhongHoc(ph3);
        qlph.themPhongHoc(ph4);
        qlph.themPhongHoc(ph5);
        qlph.themPhongHoc(ph6);
        qlph.themPhongHoc(ph7);
        qlph.themPhongHoc(ph8);
        qlph.themPhongHoc(ph9);
        qlph.themPhongHoc(ph10);
        qlph.themPhongHoc(ph11);
        qlph.themPhongHoc(ph12);
        
        mainMenu();
    }
    
}
