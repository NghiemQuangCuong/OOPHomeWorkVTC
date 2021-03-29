import java.util.HashSet;

public class DSMH 
{
    private static HashSet<MatHang> setMatHang;
    
    static 
    {
        setMatHang = new HashSet<>();
    }

    public static void showDSMH()
    {
        System.out.println("===============================================================================================================================");
        System.out.println("Danh sach mat hang");
        System.out.println("===============================================================================================================================");
        System.out.printf("%-15s %-25s %-15s %15s %20s\n", "Ma mat hang", "Ten mat hang", "Kieu dong goi", "So luong", "Gia");
        System.out.println("===============================================================================================================================");
        for (MatHang mh : setMatHang)
            System.out.println(mh);
        System.out.println("===============================================================================================================================");
    }

    public static boolean capNhatMatHang(String maHang, String tenHang, String kieuDongGoi, int soLuong, double donGia)
    {
        for (MatHang mh : setMatHang)
            if (mh.getMaHang().equals(maHang))
            {
                mh.setTenHang(tenHang);
                mh.setKieuDongGoi(kieuDongGoi);
                mh.setSoLuong(soLuong);
                mh.setDonGia(donGia);
                return true;
            }

        return false;
    }

    public static boolean themMoiMatHang(MatHang mh)
    {
        if (setMatHang.contains(mh))
            return false;
        
        setMatHang.add(mh);
        return true;
    }

    public static boolean contains(String maHang)
    {
        for (MatHang mh : setMatHang)
            if (mh.getMaHang().equals(maHang))
                return true;
        return false;
    }

    public static MatHang getMatHangByID(String maHang)
    {
        for (MatHang mh : setMatHang)
            if (mh.getMaHang().equals(maHang))
                return mh;
        return null;
    }
}
