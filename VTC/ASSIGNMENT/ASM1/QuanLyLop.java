import java.time.LocalTime;
import java.util.ArrayList;

public class QuanLyLop 
{
    private static ArrayList<LopHoc> listLopHoc = new ArrayList<LopHoc>();

    public static boolean themLop(LopHoc lop)
    {
        if (listLopHoc.contains(lop))
            return false;
        else
        {
            listLopHoc.add(lop);
            return true;
        }
    }

    public static LopHoc getLopHocByID(String id)
    {
        for (LopHoc lop : listLopHoc)
            if (lop.getMaLop().equals(id))
                return lop;

        return null;
    }

    public static boolean capNhatLopHoc(String id, String moTa, String giangVien, Pair<LocalTime, LocalTime> gioHoc,
        NgayHoc ngayHoc)
    {
        LopHoc lop = getLopHocByID(id);
        if (lop == null)
            return false;
        else
        {
            lop.setGiangVien(giangVien);
            lop.setMoTaLop(moTa);
            lop.setNgayHoc(ngayHoc);
            lop.setThoiGianHoc(gioHoc);
            return true;
        }
    }

    public static void showDanhSachLopHoc()
    {
        System.out.println("================================================================================");
        System.out.println("Danh sach lop");
        System.out.println("================================================================================");
        System.out.printf("%-15s %-25s %-25s %19s %15s\n", "Ma lop", "Mo ta", "Giang vien", 
            "Gio hoc", "Ngay hoc");
        System.out.println("================================================================================");
        for (LopHoc lh : listLopHoc)
            System.out.println(lh);
        System.out.println("================================================================================");
    }

    public static String getMaLopText()
    {
        String result = "";
        for (LopHoc lop : listLopHoc)
            result += lop.getMaLop() + " ";
        return result;
    }
    
}
