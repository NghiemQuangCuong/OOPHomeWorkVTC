import java.util.ArrayList;

public class QLHinh 
{
    private ArrayList<Hinh> listHinh;
    
    public QLHinh()
    {
        listHinh = new ArrayList<>();
    }

    public void themHinh(Hinh hinh)
    {
        listHinh.add(hinh);
    }

    public void xoaHinh(String nameToDelete)
    {
        for (Hinh h : listHinh)
            if (h.getTen().equals(nameToDelete))
            {
                listHinh.remove(h);
                return;
            }
    }

    public void showAllInfo()
    {
        for (Hinh h : listHinh)
            System.out.println(h);
    }

    public void showHinhEllipse()
    {
        for (Hinh h : listHinh)
            if (h instanceof Ellipse && !(h instanceof Circle)) System.out.println(h);
    }

    public void showHinhCircle()
    {
        for (Hinh h : listHinh)
            if (h instanceof Circle) System.out.println(h);
    }

    public void showHinhChuNhat()
    {
        for (Hinh h : listHinh)
            if (h instanceof HinhChuNhat && !(h instanceof HinhVuong)) System.out.println(h);
    }

    public void showHinhVuong()
    {
        for (Hinh h : listHinh)
            if (h instanceof HinhVuong) System.out.println(h);
    }

    public void showHinhTamGiac()
    {
        for (Hinh h : listHinh)
            if (h instanceof TamGiac) System.out.println(h);
    }

    public void showHinhTamGiacCan()
    {
        for (Hinh h : listHinh)
            if (h instanceof TamGiacCan && !(h instanceof TamGiacDeu)) System.out.println(h);
    }

    public void showHinhTamGiacDeu()
    {
        for (Hinh h : listHinh)
            if (h instanceof TamGiacDeu) System.out.println(h);
    }

    public void sapXepDienTichTangDan()
    {
        listHinh.sort((s1, s2) ->
        {
            if (s1.tinhDienTich() < s2.tinhDienTich())
                return -1;
            else if (s1.tinhDienTich() > s2.tinhDienTich())
                return 1;
            else
                return 0;
        });
    }

    public void sapXepChuViGiamDan()
    {
        listHinh.sort((s1, s2) ->
        {
            if (s1.tinhChuVi() > s2.tinhChuVi())
                return -1;
            else if (s1.tinhChuVi() < s2.tinhChuVi())
                return 1;
            else
                return 0;
        });
    }
}
