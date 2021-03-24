import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Sach extends SanPham
{
    private int soTrang;

    public Sach(String maSP, String tenSP, String moTa, LocalDate ngaySX, 
        double giaBan, int soTrang)
    {
        super(maSP, tenSP, moTa, ngaySX, giaBan);
        this.soTrang = (soTrang > 0) ? soTrang : 0;
    }

    public static Sach nhapSanPham(Scanner sc)
    {
        System.out.print("Nhap ma san pham: ");
        String maSP = sc.nextLine();
        System.out.print("Nhap ten san pham: ");
        String tenSP = sc.nextLine();
        System.out.print("Nhap mo ta: ");
        String moTa = sc.nextLine();
        System.out.print("Nhap ngay thang nam san xuat (dd/mm/yyyy): ");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngaySX = LocalDate.parse(sc.nextLine(), dtf);
        System.out.print("Nhap gia ban (so thuc): ");
        double giaBan = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so trang: ");
        int soTrang = Integer.parseInt(sc.nextLine());
        return new Sach(maSP, tenSP, moTa, ngaySX, giaBan, soTrang);
    }

    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-15s %-20s %-20s %25s %15s %10d", maSP, tenSP, moTa,
            ngaySX.format(dtf), df.format(giaBan), soTrang);
    }
}
