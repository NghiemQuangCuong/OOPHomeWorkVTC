import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GiangVienCoHuu extends GiangVien
{
    private double luongCoBan;
    private double heSoLuong;

    public GiangVienCoHuu(String hoTen, LocalDate ngaySinh, String hocHam, String hocVi, LocalDate ngayBatDauCongTac,
        double luongCoBan, double heSoLuong)
    {
        super(hoTen, ngaySinh, hocHam, hocVi, ngayBatDauCongTac);
        this.luongCoBan = (luongCoBan > 0.0) ? luongCoBan : 0.0;
        this.heSoLuong = (heSoLuong > 0.0) ? heSoLuong : 0.0;
    }

    @Override
    public void tinhLuong(Scanner sc)
    {
        System.out.println("Nhap so gio lam cua giang vien " + getHoTen());
        double input = Double.parseDouble(sc.nextLine());
        System.out.printf("Luong: %.5f\n", input * getThuLao() + luongCoBan * heSoLuong);
        setTienLuong(input * getThuLao() + luongCoBan * heSoLuong);
    }

    @Override
    public String toString()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        return String.format("%-20s %-20s %-15s %-15s %-15s %15s %15.2f", getHoTen(), getNgaySinh().format(dtf), getHocHam(), getHocVi(),
            getNgayBatDauCongTac().format(dtf), df.format(luongCoBan), heSoLuong);
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = (luongCoBan > 0.0) ? luongCoBan : this.luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = (heSoLuong > 0.0) ? heSoLuong : this.heSoLuong;
    }



    
}
