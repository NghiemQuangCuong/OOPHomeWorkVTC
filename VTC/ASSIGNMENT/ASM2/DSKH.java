import java.util.HashSet;

public class DSKH 
{
    private static HashSet<KhachHang> setKhachHang;

    static
    {
        setKhachHang = new HashSet<>();
    }

    public static void showDSKH()
    {
        System.out.println("=============================================================================================");
        System.out.println("Danh sach khach hang");
        System.out.println("=============================================================================================");
        System.out.printf("%-15s %-25s %-20s %15s", "Ma khach hang", "Ten khach hang", "So dien thoai", "Diem thuong");
        System.out.println("=============================================================================================");
        for (KhachHang kh : setKhachHang)
            System.out.println(kh);

        System.out.println("=============================================================================================");
    }

    public static boolean capNhatKhachHang(String maKhachHang, String tenKhachHang, String soDienThoai)
    {
        for (KhachHang kh : setKhachHang)
            if (kh.getMaKhachHang().equals(maKhachHang))
            {
                kh.setTenKhachHang(tenKhachHang);
                kh.setSoDienThoai(soDienThoai);
                return true;
            }
        return false;
    }

    public static boolean themKhachHang(KhachHang kh)
    {
        if (setKhachHang.contains(kh))
            return false;
        setKhachHang.add(kh);
        return true;
    }

    public static boolean contains(String maKhachHang)
    {
        for (KhachHang kh : setKhachHang)
            if (kh.getMaKhachHang().equals(maKhachHang))
                return true;

        return false;
    }

    public static KhachHang getKhachHangByID(String maKhachHang)
    {
        for (KhachHang kh : setKhachHang)
            if (kh.getMaKhachHang().equals(maKhachHang))
                return kh;
        return null;
    }
    
}
