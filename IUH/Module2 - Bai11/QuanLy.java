import java.util.ArrayList;

public class QuanLy 
{
    private ArrayList<SinhVien> listSV = new ArrayList<>();
    
    public void themSinhVien(SinhVien sv)
    {
        listSV.add(sv);
    }

    public void xuatDSSV()
    {
        for (SinhVien sv : listSV)
            System.out.println(sv.getInfo());
    }

}
