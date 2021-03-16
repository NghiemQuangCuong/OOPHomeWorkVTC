import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class MainP 
{
    public static void main(String[] args)
    {
        GiaoDich giaoDich1 = new GiaoDichVang("23451", LocalDate.of(2021, 3, 16), 4195000.0, 30, "Vang 9999");
        GiaoDich giaoDich7 = new GiaoDichVang("23452", LocalDate.of(2021, 3, 16), 4195000.0, 50, "Vang 9999");
        GiaoDich giaoDich2 = new GiaoDichVang("52794", LocalDate.of(2021, 2, 1), 2867900.0, 50, "Vang 68");
        GiaoDich giaoDich8 = new GiaoDichVang("52795", LocalDate.of(2021, 2, 1), 2867900.0, 100, "Vang 68");
        GiaoDich giaoDich3 = new GiaoDichVang("84910", LocalDate.of(2021, 2, 22), 1764500.0, 120, "Vang 41.7");
        GiaoDich giaoDich9 = new GiaoDichVang("84911", LocalDate.of(2021, 2, 22), 1764500.0, 40, "Vang 41.7");
        GiaoDich giaoDich4 = new GiaoDichTienTe("98057", LocalDate.of(2021, 1, 12), 10, 3000, 230000, "USD");
        GiaoDich giaoDich10 = new GiaoDichTienTe("98058", LocalDate.of(2021, 1, 12), 10, 5000, 230000, "USD");
        GiaoDich giaoDich5 = new GiaoDichTienTe("85341", LocalDate.of(2020, 12, 23), 100, 5000, 2690000, "EURO");
        GiaoDich giaoDich11 = new GiaoDichTienTe("85342", LocalDate.of(2020, 12, 23), 100, 7500, 2690000, "EURO");
        GiaoDich giaoDich6 = new GiaoDichTienTe("21584", LocalDate.of(2021, 3, 7), 10000, 52500, 1, "VND");
        GiaoDich giaoDich12 = new GiaoDichTienTe("21585", LocalDate.of(2021, 3, 7), 10000, 700000, 1, "VND");

        ArrayList<GiaoDich> listGiaoDich = new ArrayList<>();
        listGiaoDich.add(giaoDich1);
        listGiaoDich.add(giaoDich2);
        listGiaoDich.add(giaoDich3);
        listGiaoDich.add(giaoDich4);
        listGiaoDich.add(giaoDich5);
        listGiaoDich.add(giaoDich6);
        listGiaoDich.add(giaoDich7);
        listGiaoDich.add(giaoDich8);
        listGiaoDich.add(giaoDich9);
        listGiaoDich.add(giaoDich10);
        listGiaoDich.add(giaoDich11);
        listGiaoDich.add(giaoDich12);

        int sl9999 = 0, sl68 = 0, sl417 = 0, slUSD = 0, slEURO = 0, slVND = 0;
        double result = 0.0;
        int count = 0;
        for (GiaoDich gd : listGiaoDich)
        {
            if (gd instanceof GiaoDichVang)
            {
                if (gd.getLoai().equals("Vang 9999"))
                    sl9999 += gd.getSoLuong();
                else if (gd.getLoai().equals("Vang 68"))
                    sl68 += gd.getSoLuong();
                else if (gd.getLoai().equals("Vang 41.7"))
                    sl417 += gd.getSoLuong();
            }
            else if (gd instanceof GiaoDichTienTe)
            {
                if (gd.getLoai().equals("USD"))
                    slUSD += gd.getSoLuong();
                else if (gd.getLoai().equals("EURO"))
                    slEURO += gd.getSoLuong();
                else if (gd.getLoai().equals("VND"))
                    slVND += gd.getSoLuong();
                result += gd.thanhTien();
                count++;
            }
        }

        System.out.println("Tong so luong tung loai: ");
        System.out.println("Vang 9999: " + sl9999);
        System.out.println("Vang 68: " + sl68);
        System.out.println("Vang 41.7: " + sl417);
        System.out.println("USD menh gia 10$: " + slUSD);
        System.out.println("EURO menh gia 100: " + slEURO);
        System.out.println("VND menh gia 10000: " + slVND);

        Locale local = new Locale("vi", "vn");
        NumberFormat nf = NumberFormat.getInstance(local);
        System.out.println("Trung binh thanh tien cua giao dich tien te: ");
        if (count == 0)
            System.out.println("Khong co giao dich tien te");
        else
            System.out.println( nf.format(result / (double)count) + "VND");

        System.out.println("Cac giao dich co thanh tien tren 1 ty: ");
        for (GiaoDich gd : listGiaoDich)
            if (gd.thanhTien() > 1000000000.0)
                System.out.println(gd.getInfo());
    }
    
}
