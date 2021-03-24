import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BangDia extends SanPham
{
    private double thoiGianPhat;

    public BangDia(String maSP, String tenSP, String moTa, LocalDate ngaySX, 
        double giaBan, double thoiGianPhat)
    {
        super(maSP, tenSP, moTa, ngaySX, giaBan);
        this.thoiGianPhat = (thoiGianPhat > 0.0) ? thoiGianPhat : 0.0;
    }

    public static BangDia nhapSanPham(Scanner sc)
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
        System.out.print("Nhap thoi gian phat: ");
        double thoiGianPhat = Double.parseDouble(sc.nextLine());
        return new BangDia(maSP, tenSP, moTa, ngaySX, giaBan, thoiGianPhat);
    }

    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-15s %-20s %-20s %25s %15s %10.2f", maSP, tenSP, moTa,
            ngaySX.format(dtf), df.format(giaBan), thoiGianPhat);
    }
}
