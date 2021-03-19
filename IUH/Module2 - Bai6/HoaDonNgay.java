import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HoaDonNgay extends HoaDon
{
    public int soNgayThue;

    public HoaDonNgay()
    {
        super();
        soNgayThue = 0;
    }

    public HoaDonNgay(String maHoaDon, LocalDate ngayHoaDon, 
        String tenKhachHang, String maPhong, double donGia, int soNgayThue)
    {
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
        if (soNgayThue > 0)
            this.soNgayThue = soNgayThue;
        else
            this.soNgayThue = 0;
    }

    public static HoaDonNgay createByInput() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Tao Hoa Don Theo Ngay -----");
        System.out.println("Nhap ma hoa don: ");
        String imaHoaDon = sc.nextLine();
        System.out.println("Ngay nam lap hoa don: ");
        int nam = sc.nextInt();
        System.out.println("Nhap thang lap hoa don: ");
        int thang = sc.nextInt();
        System.out.println("Nhap ngay lap hoa don: ");
        int ngay = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten khach hang: ");
        String itenKhachHang = sc.nextLine();
        System.out.println("Nhap ma phong: ");
        String imaPhong = sc.nextLine();
        System.out.println("Nhap don gia: ");
        double idonGia = sc.nextDouble();
        System.out.println("Nhap so ngay thue ");
        int isoNgayThue = sc.nextInt();
        sc.nextLine();

        LocalDate iNgayHoaDon = LocalDate.of(nam, thang, ngay);

        HoaDonNgay result = new HoaDonNgay(imaHoaDon, iNgayHoaDon, 
            itenKhachHang, imaPhong, idonGia, isoNgayThue);

        return result;
    }

    @Override
    public double thanhTien()
    {
        if (soNgayThue <= 7)
            return soNgayThue * donGia;
        else
            return 7 * donGia + (soNgayThue - 7) * donGia * 0.8; 
    }

    @Override
    public String getInfo()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,###,###.0");

        return String.format("%-15s | %-15s | %-25s | %15s | %20s | %15d Ngay", maHoaDon, ngayHoaDon.format(dtf),
            tenKhachHang, maPhong, df.format(donGia), soNgayThue);
    } 

    @Override
    public boolean equals(HoaDon obj)
    {
        if (this.maHoaDon == obj.getMaHoaDon())
            return true;
        else
            return false;
    }
}
