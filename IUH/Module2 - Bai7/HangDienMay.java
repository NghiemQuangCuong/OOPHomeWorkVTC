import java.text.DecimalFormat;

public class HangDienMay extends HangHoa
{
    private int thoiGianBaoHanh;
    private int congSuat;
    
    public HangDienMay()
    {
        super();
        thoiGianBaoHanh = 0;
        congSuat = 0;
    }

    public HangDienMay(String maHang, String tenHang, double donGia, 
        int soLuongTon, int thoiGianBaoHanh, int congSuat)
    {
        super(maHang, tenHang, donGia, soLuongTon);
        if (thoiGianBaoHanh > 0)
            this.thoiGianBaoHanh = thoiGianBaoHanh;
        else
            this.thoiGianBaoHanh = 0;

        if (congSuat > 0)
            this.congSuat = congSuat;
        else
            this.congSuat = 0;
    }

    public static HangDienMay createHangDienMayByInput() throws NullPointerException,
        NumberFormatException
    {
        String imaHang, itenHang;
        double idonGia;
        int isoLuongTon, ithoiGianBaoHang, icongSuat;

        System.out.println("Nhap ma hang: ");
        imaHang = MainP.sc.nextLine();
        System.out.println("Nhap ten hang: ");
        itenHang = MainP.sc.nextLine();
        System.out.println("Nhap don gia (So thuc va lon hon 0): ");
        idonGia = Double.parseDouble(MainP.sc.nextLine());
        System.out.println("Nhap so luong ton kho (So nguyen va lon hon 0): ");
        isoLuongTon = Integer.parseInt(MainP.sc.nextLine());
        System.out.println("Nhap thoi gian bao hanh (so ngay bao hanh, la so nguyen va > 0): ");
        ithoiGianBaoHang = Integer.parseInt(MainP.sc.nextLine());
        System.out.println("Nhap cong suat (So nguyen va > 0): ");
        icongSuat = Integer.parseInt(MainP.sc.nextLine());

        return new HangDienMay(imaHang, itenHang, idonGia, isoLuongTon, ithoiGianBaoHang, icongSuat);
    }

    @Override
    public String mucDoBanBuon()
    {
        if (soLuongTon < 3)
            return "Ban Duoc";
        else return "Binh thuong";
    }

    @Override
    public String getInfo()
    {
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        return String.format("Hang Dien May: %-15s %-20s %15s VND %10d %-25d %15d", maHang, tenHang, df.format(donGia), soLuongTon, thoiGianBaoHanh
        , congSuat);
    }
}
