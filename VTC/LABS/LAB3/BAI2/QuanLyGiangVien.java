import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyGiangVien 
{
    private ArrayList<GiangVien> listGiangVien;

    public QuanLyGiangVien()
    {
        listGiangVien = new ArrayList<>();
    }

    public void themGiangVien(GiangVien gv)
    {
        listGiangVien.add(gv);
    }

    public void xoaGiangVien(GiangVien gv)
    {
        listGiangVien.remove(gv);
    }

    public void traCuuGiangVienTheoTen(String ten)
    {
        for (GiangVien gv : listGiangVien)
            if (gv.getHoTen().equals(ten))
                System.out.println(gv);
    }

    public void traCuuGiangVienTheoHocVi(String hocVi)
    {
        for (GiangVien gv : listGiangVien)
            if (gv.getHocVi().equals(hocVi))
                System.out.println(gv);
    }

    public void traCuuGiangVienTheoHocHam(String hocHam)
    {
        for (GiangVien gv : listGiangVien)
            if (gv.getHocHam().equals(hocHam))
                System.out.println(gv);
    }
    
    public void nhapGioLam(Scanner sc)
    {
        for (GiangVien gv : listGiangVien)
            gv.tinhLuong(sc);

        listGiangVien.sort((s1, s2) ->
        {
            if (s1.getTienLuong() > s2.getTienLuong())
                return -1;
            else if (s1.getTienLuong() < s2.getTienLuong())
                return 1;
            else
                return 0;
        });

        for (GiangVien gv : listGiangVien)
            System.out.println(gv);
    }
}
