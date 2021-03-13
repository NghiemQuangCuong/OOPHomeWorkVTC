import java.util.ArrayList;
import java.util.Scanner;

public class HocVien
{
    private static Scanner sc = new Scanner(System.in);

    private String hoTen;
    private String diaChi;
    private String soDienThoai;
    private ArrayList<KhoaHoc> listKhoaHoc = new ArrayList<>();

    public static HocVien createByInput()
    {
        System.out.println("Nhap ho ten hoc vien: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap dia chi hoc vien: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhap so dien thoai: ");
        String soDienThoai = sc.nextLine();
        return new HocVien(hoTen, diaChi, soDienThoai);
    }

    public HocVien()
    {
        hoTen = "chua xac dinh";
        diaChi = "chua xac dinh";
        soDienThoai = "chua xac dinh";
    }

    public HocVien(String hoTen, String diaChi, String soDienThoai)
    {
        if (!hoTen.equals(""))
            this.hoTen = hoTen;
        else
            this.hoTen = "chua xac dinh";

        if (!diaChi.equals(""))
            this.diaChi = diaChi;
        else
            this.diaChi = "chua xac dinh";

        if (!soDienThoai.equals(""))
            this.soDienThoai = soDienThoai;
        else
            this.soDienThoai = "chua xac dinh";
    }

    public String getHoTen()
    {
        return hoTen;
    }

    public String getDiaChi()
    {
        return diaChi;
    }

    public String getSoDienThoai()
    {
        return soDienThoai;
    }

    public void setHoTen(String hoTen)
    {
        if (!hoTen.equals(""))
            this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi)
    {
        if (!diaChi.equals(""))
            this.diaChi = diaChi;
    }

    public void setSoDienThoai(String soDienThoai)
    {
        if (!soDienThoai.equals(""))
            this.soDienThoai = soDienThoai;
    }

    public void themVaoKhoaHoc(KhoaHoc khoaHoc)
    {
        listKhoaHoc.add(khoaHoc);
    }

    public String chiTietHocVien()
    {
        return String.format("%-20s %-20s %-20s", hoTen, diaChi, soDienThoai);
    }

    public void inDSKhoaHoc()
    {
        for (KhoaHoc kh : listKhoaHoc)
            System.out.println(kh.chiTietKhoaHoc());
    }
}