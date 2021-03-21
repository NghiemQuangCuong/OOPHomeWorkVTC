import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class QuanLyNhanVien 
{
    private ArrayList<NhanVien> listNhanVien = new ArrayList<>();
    private HashSet<String> setTenSanPham = new HashSet<>();
    private HashMap<String, Integer> mapTenNhanVien = new HashMap<>();
    private TreeMap<LocalDate, ArrayList<NhanVien>> mapNhanVienDangKyDL = new TreeMap<>();
    private ArrayList<KhachHang> listKhachHang = new ArrayList<>();

    public void themNhanVien(NhanVien nv)
    {
        listNhanVien.add(nv);
    }

    private void demSoLuongNhanVienTrungTen()
    {
        for (NhanVien nv : listNhanVien)
        {
            String tenNhanVien = nv.getTenNhanVien();
            if (mapTenNhanVien.containsKey(tenNhanVien))
                mapTenNhanVien.replace(tenNhanVien, mapTenNhanVien.get(tenNhanVien) + 1);
            else
                mapTenNhanVien.put(tenNhanVien, 1);
        }
    }

    private void taoDanhSachTenSanPham()
    {
        for (NhanVien nv : listNhanVien)
            setTenSanPham.add(nv.getTenNhanVien());
    }

    public String chonTenPhoBienNhat()
    {
        demSoLuongNhanVienTrungTen();
        int max = -1;
        String result = "";
        for (Map.Entry<String, Integer> entry : mapTenNhanVien.entrySet() )
        {
            if (max < entry.getValue())
            {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }

    public void dangKyDiDuLich(int maNhanVien, LocalDate ngayDangKi)
    {
        for (NhanVien nv : listNhanVien)
        {
            if (maNhanVien == nv.getMaNhanVien())
            {
                if (mapNhanVienDangKyDL.containsKey(ngayDangKi))
                    mapNhanVienDangKyDL.get(ngayDangKi).add(nv);
                else
                {
                    ArrayList<NhanVien> list = new ArrayList<>();
                    list.add(nv);
                    mapNhanVienDangKyDL.put(ngayDangKi, list);
                }
            }
        }
    }

    public void xuatNVDangKiSomNhat()
    {
        if (mapNhanVienDangKyDL.isEmpty())
            System.out.println("Khong co ai dang ky!");
        else
        {
            ArrayList<NhanVien> list = mapNhanVienDangKyDL.firstEntry().getValue();
            for (NhanVien nv : list)
                System.out.println(nv.getInfo());
        }
    }

    public void xuatTenSanPham()
    {
        taoDanhSachTenSanPham();
        for (String s : setTenSanPham)
            System.out.println(s);
    }
}
