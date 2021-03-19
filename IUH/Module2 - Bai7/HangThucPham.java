import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class HangThucPham extends HangHoa
{
    public String nhaCungCap;
    public LocalDate ngaySanXuat;
    public LocalDate ngayHetHan;

    public HangThucPham()
    {
        super();
        nhaCungCap = "xxx";
        ngaySanXuat = LocalDate.of(2000, 1, 1);
        ngayHetHan = LocalDate.of(2000, 1, 1);
    }

    public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, String nhaCungCap
        , LocalDate ngaySanXuat, LocalDate ngayHetHan)
    {
        super(maHang, tenHang, donGia, soLuongTon);
        if (!nhaCungCap.trim().equals(""))
            this.nhaCungCap = nhaCungCap;
        else
            this.nhaCungCap = "xxx";

        if (ngaySanXuat.isBefore(LocalDate.now()))
            this.ngaySanXuat = ngaySanXuat;
        else
            this.ngaySanXuat = LocalDate.now();

        if (ngayHetHan.isAfter(ngaySanXuat))
            this.ngayHetHan = ngayHetHan;
        else
            this.ngayHetHan = ngaySanXuat;
    }

    public static HangThucPham createHangThucPhamByInput() throws NullPointerException,
         NumberFormatException, DateTimeParseException
    {
        String imaHang, itenHang, inhaCungCap;
        double idonGia;
        int isoLuongTon;
        LocalDate ingaySanXuat, ingayHetHan;

        System.out.println("Nhap ma hang: ");
        imaHang = MainP.sc.nextLine();
        System.out.println("Nhap ten hang: ");
        itenHang = MainP.sc.nextLine();
        System.out.println("Nhap don gia (So thuc va lon hon 0): ");
        idonGia = Double.parseDouble(MainP.sc.nextLine());
        System.out.println("Nhap so luong ton kho (So nguyen va lon hon 0): ");
        isoLuongTon = Integer.parseInt(MainP.sc.nextLine());
        System.out.println("Nhap ten nha cung cap: ");
        inhaCungCap = MainP.sc.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Nhap ngay thang nam san xuat (Theo dang dd/mm/yyyy): ");
        String sngaySanXuat = MainP.sc.nextLine();
        ingaySanXuat = LocalDate.parse(sngaySanXuat, dtf);
        System.out.println("Nhap ngay thang nam het han (theo dang dd/mm/yyyy): ");
        String sngayHetHan = MainP.sc.nextLine();
        ingayHetHan = LocalDate.parse(sngayHetHan, dtf);

        return new HangThucPham(imaHang, itenHang, idonGia, isoLuongTon, inhaCungCap, ingaySanXuat, ingayHetHan);
    }

    @Override
    public String mucDoBanBuon()
    {
        if (soLuongTon > 0 && ngayHetHan.isAfter(LocalDate.now()))
            return "Kho ban";
        else return "Binh thuong";
    }

    @Override
    public String getInfo()
    {
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("Hang Thuc Pham: %-15s %-20s %15s VND %10d %-25s %15s %15s", maHang, tenHang, df.format(donGia), soLuongTon, nhaCungCap
        , ngaySanXuat.format(dtf), ngayHetHan.format(dtf));
    }

    ;
}
