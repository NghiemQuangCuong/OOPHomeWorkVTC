import java.util.ArrayList;

public class QuanLy 
{
    private ArrayList<KhoaHoc> listKhoaHoc = new ArrayList<>();
    private ArrayList<HocVien> listHocVien = new ArrayList<>();

    public QuanLy()
    {

    }

    public HocVien getHocVienByPhone(String phone)
    {
        for (HocVien hv : listHocVien)
        {
            if (hv.getSoDienThoai().equals(phone))
                return hv;
        }
        return null;
    }

    public KhoaHoc getKhoaHocByName(String name)
    {
        for (KhoaHoc kh : listKhoaHoc)
        {
            if (kh.getTenKhoaHoc().equals(name))
                return kh;
        }
        return null;
    }

    public void addKhoaHoc(KhoaHoc kh)
    {
        listKhoaHoc.add(kh);
    }

    public void addHocVienToKhoaHoc(HocVien hv, KhoaHoc kh)
    {
        for (HocVien temp : listHocVien)
            if (hv.getSoDienThoai().equals(temp.getSoDienThoai())) return;
        listHocVien.add(hv);
        kh.themHocVien(hv);
    }

    public void printKhoaHocOfHocVien(HocVien hv)
    {
        hv.inDSKhoaHoc();
    }

    public void printKhoaHocChuaKetThuc()
    {
        for (KhoaHoc kh : listKhoaHoc)
            if (kh.chuaKetThuc()) System.out.println(kh.chiTietKhoaHoc());
    }

    public void printKhoaHocChuaBatDau()
    {
        for (KhoaHoc kh : listKhoaHoc)
            if (kh.chuaBatDau()) System.out.println(kh.chiTietKhoaHoc());
    }
}
