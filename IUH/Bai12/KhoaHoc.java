import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class KhoaHoc 
{
    private static Scanner sc = new Scanner(System.in);
    
    private String tenKhoaHoc;
    private LocalDate ngayMo;
    private int thoiGianHoc;
    private ArrayList<HocVien> listHocVien = new ArrayList<>();

    public static KhoaHoc createByInput() throws NumberFormatException
    {
        System.out.println("Nhap ten khoa hoc: ");
        String tenKhoaHoc = sc.nextLine();
        System.out.println("Nhap nam bat dau: ");
        int nam = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap thang bat dau: ");
        int thang = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ngay bat dau: ");
        int ngay = Integer.parseInt(sc.nextLine());
        LocalDate date = LocalDate.of(nam, thang, ngay);
        System.out.println("Nhap so ngay hoc cua khoa hoc: ");
        int thoiGianHoc = Integer.parseInt(sc.nextLine());

        return new KhoaHoc(tenKhoaHoc, date, thoiGianHoc);
    }

    public KhoaHoc()
    {
        tenKhoaHoc = "chua xac dinh";
        ngayMo = LocalDate.of(9999, 12, 31);
        thoiGianHoc = 0;
    }

    public KhoaHoc(String tenKhoaHoc, LocalDate ngayMo, int thoiGianHoc)
    {
        if (!tenKhoaHoc.equals(""))
            this.tenKhoaHoc = tenKhoaHoc;
        else
            this.tenKhoaHoc = "chua xac dinh";

        this.ngayMo = ngayMo;

        if (thoiGianHoc > 0)
            this.thoiGianHoc = thoiGianHoc;
        else
            this.thoiGianHoc = 0;
    }

    public String getTenKhoaHoc()
    {
        return tenKhoaHoc;
    }

    public LocalDate getNgayMo()
    {
        return ngayMo;
    }

    public int getThoiGianHoc()
    {
        return thoiGianHoc;
    }

    public void setTenKhoaHoc(String tenKhoaHoc)
    {
        if (!tenKhoaHoc.equals(""))
            this.tenKhoaHoc = tenKhoaHoc;
    }

    public void setNgayMo(LocalDate ngayMo)
    {
        this.ngayMo = ngayMo;
    }

    public void setThoiGianHoc(int thoiGianHoc)
    {
        if (thoiGianHoc > 0)
            this.thoiGianHoc = thoiGianHoc;
    }

    public void themHocVien(HocVien hocVien)
    {
        listHocVien.add(hocVien);
        hocVien.themVaoKhoaHoc(this);
    }

    public String chiTietKhoaHoc()
    {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-20s %-15s %10d", tenKhoaHoc, ngayMo.format(df), thoiGianHoc);
    }

    public void inDanhSachHocVien()
    {
        for (HocVien hv : listHocVien)
            System.out.println(hv.chiTietHocVien());
    }

    public boolean chuaKetThuc()
    {
        LocalDate ngayKetThuc = ngayMo.plusDays(thoiGianHoc);
        if (ngayKetThuc.isAfter(LocalDate.now()))
            return true;

        return false;
    }

    public boolean chuaBatDau()
    {
        if (ngayMo.isAfter(LocalDate.now()))
            return true;
        
        return false;
    }
}