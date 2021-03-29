import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class DSHD 
{
    private static HashSet<HoaDon> setHoaDon;

    static 
    {
        setHoaDon = new HashSet<>();
    }
    
    public static void taoMoiHoaDon(Scanner sc) throws Exception
    {
        System.out.println("========== Tao moi hoa don ==========");
        System.out.print("Nhap ma nhan vien: ");
        String maNhanVien = sc.nextLine();
        System.out.print("Nhap ma hoa don: ");
        String maHoaDon = sc.nextLine();
        if (contains(maHoaDon))
            throw new Exception("Loi: trung ma hoa don trong danh sach");
        System.out.print("Nhap ma khach hang, khach vang lai = KH00: ");
        String maKhachHang = sc.nextLine();
        if (!maKhachHang.equals("KH00") && !DSKH.contains(maKhachHang))
            throw new Exception("Loi: ma khach hang khong ton tai");
        
        HoaDon hoaDon = new HoaDon(maHoaDon, maNhanVien, maKhachHang);
        boolean stopBuying = false;
        int count = 0;
        while (!stopBuying)
        {
            count++;
            System.out.print("Nhap ma hang " + count + ": ");
            String maHang = sc.nextLine();
            if (!DSMH.contains(maHang))
                throw new Exception("Loi: ma hang khong ton tai");

            MatHang hang = DSMH.getMatHangByID(maHang);

            int soLuong = 0;
            boolean isEmpty = false;
            while (!isEmpty)
            {
                System.out.printf("Nhap so luong, so luong con lai (%d): ", hang.getSoLuong());
                soLuong = Integer.parseInt(sc.nextLine());
                if (soLuong <= hang.getSoLuong())
                {
                    hang.setSoLuong(hang.getSoLuong() - soLuong);
                    isEmpty = true;
                }
            }
            
            MatHang mh = new MatHang( hang.getMaHang(), hang.getTenHang(), hang.getKieuDongGoi(), soLuong, hang.getDonGia() );
            hoaDon.themMatHang(mh);

            System.out.print("Ban co muon them mat hang khong? (Y/N): ");
            String input = sc.nextLine();
            if (input.equals("N"))
            {
                stopBuying = true;
                System.out.println("Tong tien cua hoa don la: ");
                DecimalFormat df = new DecimalFormat("#,###,###.000");
                System.out.printf("Bang so: %s VND\n", df.format(hoaDon.getTongTien()));
                System.out.println("Bang chu: " + tienSoSangChu(hoaDon.getTongTien()));
                KhachHang kh = DSKH.getKhachHangByID(maKhachHang);
                kh.setDiemThuong(kh.getDiemThuong() + (int)(hoaDon.getTongTien() / 1000.0));
            }  
        }
        setHoaDon.add(hoaDon);

        System.out.println("Press Enter to continue");
        sc.nextLine();
    }

    private static String tienSoSangChu(double value)
    {
        long x = (long)value;
        Stack<String> result = new Stack<>();

        if (x == 0) return "khong dong.";
        String demNho = "";
        String demLon = "dong.";
        result.push(demLon);
        while (x != 0)
        {
            if (demNho.equals(""))
            {
                demNho = "muoi";
                if (!demLon.equals("dong."))
                    result.push(demLon);
            }
            else if (demNho.equals("muoi"))
            {
                result.push(demNho);
                demNho = "tram";
            }
            else if (demNho.equals("tram"))
            {
                result.push(demNho);
                demNho = "";
                if (demLon.equals("dong."))
                    demLon = "nghin";
                else if (demLon.equals("nghin"))
                    demLon = "trieu";
                else if (demLon.equals("trieu"))
                    demLon = "ty";
            }

            long k = x % 10;
            x = x / 10;

            if (k != 0)
            {
                switch ((int)k)
                {
                    case 1:
                        if (!demNho.equals("tram"))
                            result.push("mot");
                        break;
                    case 2:
                        result.push("hai");
                        break;
                    case 3:
                        result.push("ba");
                        break;
                    case 4:
                        result.push("bon");
                        break;
                    case 5:
                        if (!demNho.equals("muoi"))
                            result.push("nam");
                        else
                            result.push("lam");
                        break;
                    case 6:
                        result.push("sau");
                        break;
                    case 7:
                        result.push("bay");
                        break;
                    case 8:
                        result.push("tam");
                        break;
                    case 9:
                        result.push("chin");
                        break;
                }
            }
        }

        String kq = "";
        while (!result.isEmpty())
        {
            kq += result.pop() + " ";
        }
        return kq;
    }

    public static void showHoaDonTheoMaNhanVien(Scanner sc)
    {
        System.out.println("=========================== Hoa don theo ma nhan vien ===========================");
        System.out.print("Nhap ma nhan vien thanh toan: ");
        String maNhanVien = sc.nextLine();
        System.out.println("=================================================================================");
        System.out.printf("%-15s %-20s %15s %25s\n", "Ma hoa don", "Ngay tao", "So mat hang", "Tong tien");
        System.out.println("=================================================================================");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        for (HoaDon hd : setHoaDon)
            if (hd.getMaNhanVien().equals(maNhanVien))
            {
                System.out.printf("%-15s %-20s %15d %25s\n", hd.getMaHoaDon(), 
                    hd.getNgayTao().format(dtf), hd.getSoMatHang(), df.format(hd.getTongTien()));
            }
        System.out.println("Press Enter to continue");
        sc.nextLine();
    }

    public static void showHoaDonTheoNgay(Scanner sc)
    {
        System.out.println("=============================== Hoa don theo ngay ===============================");
        System.out.print("Nhap ngay (dd/mm/yyyy): ");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngay = LocalDate.parse(sc.nextLine(), dtf);
        System.out.println("=================================================================================");
        System.out.printf("%-15s %-15s %25s\n", "Ma hoa don", "Gio tao", "Tong tien");
        System.out.println("=================================================================================");
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        for (HoaDon hd : setHoaDon)
            if (hd.getNgayTao().equals(ngay))
            {
                System.out.printf("%-15s %-15s %25s\n", hd.getMaHoaDon(),
                    hd.getGioTao().format(DateTimeFormatter.ISO_LOCAL_TIME), df.format(hd.getTongTien()));
            }
        System.out.println("Press Enter to continue");
        sc.nextLine();
    }

    public static boolean contains(String maHoaDon)
    {
        for (HoaDon hd : setHoaDon)
            if (hd.getMaHoaDon().equals(maHoaDon))
                return true;
        return false;
    }
}
