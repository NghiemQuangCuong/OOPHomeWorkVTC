import java.util.ArrayList;

public class QuanLyPhanSo 
{
    private ArrayList<PhanSo> listPhanSo;

    public QuanLyPhanSo()
    {
        listPhanSo = new ArrayList<>();
    }

    public void themPhanSo(PhanSo ps)
    {
        listPhanSo.add(ps);
    }

    public void xoaPhanSo(PhanSo ps)
    {
        for (PhanSo e : listPhanSo)
        if (e.compareTo(ps) == 0)
        {
            listPhanSo.remove(e);
            return;
        }
    }

    public double tinhTong()
    {
        double result = 0.0;
        for (PhanSo e : listPhanSo)
            result += e.getValue();
        return result;
    }

    public void sapXep()
    {
        listPhanSo.sort((s1, s2) ->
        {
            if (s1.getValue() < s2.getValue())
                return -1;
            else if (s1.getValue() == s2.getValue())
                return 0;
            else
                return 1;
        });
    }

    public void showInfo()
    {
        for (PhanSo e : listPhanSo)
            System.out.println(e + ", ");
        System.out.println();
    }
}
