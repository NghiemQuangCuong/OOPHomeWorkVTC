import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HoaDonGio extends HoaDon
{
    public int soGioThue;

    public HoaDonGio()
    {
        super();
        soGioThue = 0;
    }

    public HoaDonGio(String maHoaDon, LocalDate ngayHoaDon, 
        String tenKhachHang, String maPhong, double donGia, int soGioThue) throws Exception
    {
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
        if (soGioThue > 0)
            this.soGioThue = soGioThue;
        else
            this.soGioThue = 0;

        if (soGioThue >= 30)
            throw new Exception("Loi: Hoa don theo gio khong duoc lon hon 30");
    }

    public static HoaDonGio createByInput() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Tao Hoa Don Theo Gio -----");
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
        System.out.println("Nhap so gio thue (< 30 gio): ");
        int isoGioThue = sc.nextInt();
        sc.nextLine();

        LocalDate iNgayHoaDon = LocalDate.of(nam, thang, ngay);

        HoaDonGio result = new HoaDonGio(imaHoaDon, iNgayHoaDon, 
            itenKhachHang, imaPhong, idonGia, isoGioThue);

        return result;
    }

    @Override
    public double thanhTien()
    {
        return soGioThue * donGia;
    }

    @Override
    public String getInfo()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,###,###.0");

        return String.format("%-15s | %-15s | %-25s | %15s | %20s | %15d Gio", maHoaDon, ngayHoaDon.format(dtf),
            tenKhachHang, maPhong, df.format(donGia), soGioThue);
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
