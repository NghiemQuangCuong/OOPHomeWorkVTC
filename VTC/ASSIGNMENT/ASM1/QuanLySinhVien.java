import java.time.LocalDate;
import java.util.ArrayList;

public class QuanLySinhVien 
{
    private static ArrayList<SinhVien> listSinhVien = new ArrayList<SinhVien>();

    public static boolean themSinhVien(SinhVien sv)
    {
        if (listSinhVien.contains(sv))
            return false;
        else
        {
            listSinhVien.add(sv);
            return true;
        }
    }

    public static SinhVien getSinhVienByID(String id)
    {
        for (SinhVien sv : listSinhVien)
            if (sv.getId().equals(id))
                return sv;
        return null;
    }

    public static boolean capNhatSinhVien(String id, String hoTen, String diaChi, LocalDate ngaySinh, String maLop)
    {
        SinhVien sv = getSinhVienByID(id);
        if (sv == null)
            return false;
        else
        {
            sv.setHoTen(hoTen);;
            sv.setDiaChi(diaChi);
            sv.setNgaySinh(ngaySinh);
            sv.setMaLop(maLop);
            return true;
        }
    }

    public static void showDanhSachSinhVien()
    {
        System.out.println("================================================================================");
        System.out.println("Danh sach sinh vien");
        System.out.println("================================================================================");
        System.out.printf("%-18s %-25s %-25s %18s %15s\n", "Ma SV", "Ho va Ten", "Dia chi", "Ngay sinh", "Lop");
        System.out.println("================================================================================");
        for (SinhVien sv : listSinhVien)
            System.out.println(sv);
        System.out.println("================================================================================");
    }
}
