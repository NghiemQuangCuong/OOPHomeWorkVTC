import java.util.ArrayList;

public class QuanLyPhongHoc 
{
    private ArrayList<PhongHoc> listPhongHoc;

    public QuanLyPhongHoc()
    {
        listPhongHoc = new ArrayList<>();
    }
    
    public boolean themPhongHoc(PhongHoc ph)
    {
        for (PhongHoc phongHoc : listPhongHoc)
            if (phongHoc.equals(ph)) return false;

        listPhongHoc.add(ph);
        return true;
    }

    public PhongHoc getPhongHocByMaPhong(String maPhong)
    {
        for (PhongHoc ph : listPhongHoc)
            if (ph.getMaPhong().equals(maPhong)) return ph;

        return null;
    }

    public String getInfoAllRoom()
    {
        String result = "";
        for (PhongHoc ph : listPhongHoc)
            result += ph.getInfo() + "\n";
        return result;
    }

    public String getInfoStandardRoom()
    {
        String result = "";
        for (PhongHoc ph : listPhongHoc)
            if (ph.coDatChuan()) result += ph.getInfo() + "\n";
        return result;
    }

    public void sortWithAscendingDayNha()
    {
        listPhongHoc.sort((s1, s2) ->
        {
            return s1.getDayNha().compareTo(s2.getDayNha());
        });
    }

    public void sortWithDescendingDienTich()
    {
        listPhongHoc.sort((s1, s2) ->
        {
            if (s1.getDienTich() > s2.getDienTich())
                return -1;
            else if (s1.getDienTich() == s2.getDienTich())
                return 0;
            else
                return 1;
        });
    }

    public void sortWithAscendingBongDen()
    {
        listPhongHoc.sort((s1, s2) ->
        {
            if (s1.getBongDen() < s2.getBongDen())
                return -1;
            else if (s1.getBongDen() == s2.getBongDen())
                return 0;
            else
                return 1;
        });
    }

    public void editComputerWithMaPhong()
    {
        System.out.println("Nhap ma phong can tim kiem");
        String input = MainP.sc.nextLine();
        PhongHoc phongHoc = getPhongHocByMaPhong(input);
        if (phongHoc instanceof PhongMayTinh)
        {
            ((PhongMayTinh)phongHoc).capNhapMayTinh();
        }
        else 
        {
            System.out.println("Khong tim thay phong hoc!");
        }
    }

    public boolean xoaPhongHocWithMaPhong()
    {
        System.out.println("Nhap ma phong can xoa: ");
        String input = MainP.sc.nextLine();
        PhongHoc phongHoc = getPhongHocByMaPhong(input);
        if (phongHoc == null)
        {
            System.out.println("Khong tim thay phong hoc");
            return false;
        }
        else
        {
            System.out.print("Da tim thay phong hoc, ban co chac muon xoa? Y/N: ");
            String sure = MainP.sc.nextLine();
            if (sure.equals("Y") || sure.equals("y"))
            {
                listPhongHoc.remove(phongHoc);
                return true;
            }
            else
                return false;
        }
    }

    public int tongSoPhongHoc()
    {
        return listPhongHoc.size();
    }

    public ArrayList<PhongHoc> getRoomListWithMoreThan60Comps()
    {
        ArrayList<PhongHoc> result = new ArrayList<>();
        for (PhongHoc ph : listPhongHoc)
            if (ph instanceof PhongMayTinh && ((PhongMayTinh)ph).getSoMayTinh() >= 60)
                result.add(ph);

        return result;
    }
}
