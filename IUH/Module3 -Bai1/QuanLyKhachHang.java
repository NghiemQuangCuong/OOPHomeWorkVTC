import java.util.ArrayList;

public class QuanLyKhachHang 
{
    private ArrayList<KhachHang> listKhachHang = new ArrayList<>();

    public void themKH(KhachHang kh)
    {
        listKhachHang.add(kh);
    }

    public void sortListDoanhSoTangDan()
    {
        listKhachHang.sort((s1, s2) -> 
        {
            if (s1.getDoanhSo() < s2.getDoanhSo())
                return -1;
            else if (s1.getDoanhSo() == s2.getDoanhSo())
                return 0;
            else
                return 1;
        });
    }

    public void xuatListKhachHang()
    {
        for (KhachHang kh : listKhachHang)
        {
            System.out.println(kh.getInfo());
        }
    }
}
