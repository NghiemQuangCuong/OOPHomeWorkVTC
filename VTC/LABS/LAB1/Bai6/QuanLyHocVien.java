import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class QuanLyHocVien 
{
    private ArrayList<HocVien> listHocVien;
    private Scanner sc;

    public QuanLyHocVien()
    {
        listHocVien = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void themHocVien()
    {
        System.out.print("Nhap ho ten hoc vien: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap ngay thang nam sinh hoc vien (dd/mm/yyyy): ");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngaySinh = LocalDate.parse(sc.nextLine(), dtf);
        System.out.print("Nhap gioi tinh (1 = nam, 2 = nu, else = KHONGXACDINH): ");
        String gt = sc.nextLine();
        GioiTinh gioiTinh = (gt.equals("1")) ? GioiTinh.NAM : (gt.equals("2")) ? GioiTinh.NU : GioiTinh.KHONGXACDINH;
        System.out.print("Nhap que quan hoc vien: ");
        String queQuan = sc.nextLine();
        listHocVien.add(new HocVien(hoTen, ngaySinh, gioiTinh, queQuan));
        System.out.println("Da them thanh cong");
    }

    public void nhapDiem() throws Exception
    {
        boolean check = true;
        for (HocVien hv : listHocVien)
        {
            if (hv.getDiem() == null)
            {
                check = false;
                System.out.println("---- Nhap diem cho hoc vien " + hv.getHoTen() + " -----");
                System.out.print("Nhap diem mon 1: ");
                double diem1 = Double.parseDouble(sc.nextLine());
                System.out.print("Nhap diem mon 2: ");
                double diem2 = Double.parseDouble(sc.nextLine());
                System.out.print("Nhap diem mon 3: ");
                double diem3 = Double.parseDouble(sc.nextLine());
                hv.setDiem(diem1, diem2, diem3);
            }
        }

        if (check)
            System.out.println("Khong can nhap them");
        else    
            System.out.println("Da nhap thanh cong diem");
    }

    public void hienThiDanhSachHocVien()
    {
        for (HocVien hv : listHocVien)
            System.out.println(hv.getInfo());
    }

    public HocVien getHocVienBangMaSo(int maSo)
    {
        for (HocVien hv : listHocVien)
            if (hv.getMaSo() == maSo)
                return hv;

        return null;
    }

    public HocVien getHocVienBangHoTen(String hoTen)
    {
        for (HocVien hv : listHocVien)
            if (hv.getHoTen().equals(hoTen))
                return hv;

        return null;
    }

    public HocVien getHocVienBangQueQuan(String queQuan)
    {
        for (HocVien hv : listHocVien)
            if (hv.getQueQuan().equals(queQuan))
                return hv;

        return null;
    }

    public void sortHocVien()
    {
        listHocVien.sort((s1, s2) ->
        {
            if (s1.getDiem().getDiem1() > s2.getDiem().getDiem1())
                return -1;
            else if (s1.getDiem().getDiem1() < s2.getDiem().getDiem1())
                return 1;
            else    
            {
                if (s1.getDiem().getDiem2() > s2.getDiem().getDiem2())
                    return -1;
                else if (s1.getDiem().getDiem2() < s2.getDiem().getDiem2())
                    return 1;
                else    
                {
                    if (s1.getDiem().getDiem3() > s2.getDiem().getDiem3())
                        return -1;
                    else if (s1.getDiem().getDiem3() < s2.getDiem().getDiem3())
                        return 1;
                    else    
                        return 0;
                }
            }
        });
    }

    public void showDSHVHocBong()
    {
        for (HocVien hv : listHocVien)
            if (hv.getDiem() != null && hv.danhGia().equals("Tot"))
                System.out.println(hv.getInfo());
    }
}
