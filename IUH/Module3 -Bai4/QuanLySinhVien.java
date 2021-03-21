import java.util.ArrayList;

public class QuanLySinhVien 
{
    private ArrayList<SinhVien> listSinhVien = new ArrayList<>();

    public void themSinhVien(SinhVien svToAdd)
    {
        for (SinhVien sv : listSinhVien)
            if (sv.equals(svToAdd)) return;

        listSinhVien.add(svToAdd);
    }    

    public void xoaSinhVien(String maSinhVien)
    {
        for (SinhVien sv : listSinhVien)
            if (sv.getMaSinhVien().equals(maSinhVien))
                listSinhVien.remove(sv);
    }

    public void suaSinhVien(String maSinhVien) throws NumberFormatException
    {
        for (SinhVien sv : listSinhVien)
            if (sv.getMaSinhVien().equals(maSinhVien))
            {
                System.out.println("Ho ten cu: " + sv.getHoTen());
                System.out.println("Nam sinh cu: " + sv.getNamSinh());
                System.out.print("Ho ten moi: ");
                String hoTenMoi = MainP.sc.nextLine();
                System.out.print("Nam sinh moi: ");
                int namSinhMoi = Integer.parseInt( MainP.sc.nextLine( ) );
                sv.setHoTen(hoTenMoi);
                sv.setNamSinh(namSinhMoi);
            }
    }

    public SinhVien getSinhVienTheoMa(String maSinhVien)
    {
        for (SinhVien sv : listSinhVien)
            if (sv.getMaSinhVien().equals(maSinhVien))
                return sv;

        return null;
    }

    public SinhVien getSinhVienTheoTen(String tenSinhVien)
    {
        for (SinhVien sv : listSinhVien)
            if (sv.getHoTen().equals(tenSinhVien))
                return sv;

        return null;
    }

    public void sortListWithAscendingName()
    {
        listSinhVien.sort((s1, s2) ->
        {
            return s1.getHoTen().compareTo(s2.getHoTen());
        });
    }

    public void showList()
    {
        System.out.printf("%-20s %-25s %15s\n", "Ma Sinh Vien", "Ho Va Ten", "Nam Sinh");
        for (SinhVien sv : listSinhVien)
            System.out.println(sv.getInfo());
    }
}
