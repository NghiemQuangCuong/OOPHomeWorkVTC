import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class MainP 
{
    public static void main(String[] args)
    {
        GiaoDich giaoDich1 = new GiaoDichNha("580192", LocalDate.of(2020, 7, 14), 29000000, 35, "Cao Cap", "713 Hoa Binh");
        GiaoDich giaoDich2 = new GiaoDichNha("137933", LocalDate.of(2021, 2, 11), 33000000, 50, "Cao Cap", "112 Au Co");
        GiaoDich giaoDich3 = new GiaoDichNha("962913", LocalDate.of(2020, 12, 19), 28000000, 42, "Thuong", "215 Lac Long Quan");
        GiaoDich giaoDich4 = new GiaoDichNha("786901", LocalDate.of(2021, 2, 23), 26500000, 33, "Thuong", "89 Hoang Dieu");
        GiaoDich giaoDich5 = new GiaoDichNha("309862", LocalDate.of(2020, 7, 1), 16000000, 120, "Thuong", "77 Ten Lua");
        GiaoDich giaoDich6 = new GiaoDichDat("231653", LocalDate.of(2020, 7, 19), 12000000, 200, "A");
        GiaoDich giaoDich7 = new GiaoDichDat("413642", LocalDate.of(2020, 7, 18), 10000000, 150, "B");
        GiaoDich giaoDich8 = new GiaoDichDat("351952", LocalDate.of(2020, 7, 17), 11500000, 165, "B");
        GiaoDich giaoDich9 = new GiaoDichDat("985219", LocalDate.of(2020, 7, 16), 10000000, 220, "C");
        GiaoDich giaoDich10 = new GiaoDichDat("998445", LocalDate.of(2020, 7, 15), 9800000, 300, "C");
        GiaoDich giaoDich11 = new GiaoDichDat("109223", LocalDate.of(2020, 7, 14), 8900000, 185, "C");

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

        int iCC = 0, iT = 0, iA = 0, iB = 0, iC = 0;
        for (GiaoDich gd : listGiaoDich)
        {
            if (gd instanceof GiaoDichNha)
            {
                if (gd.getLoai().equals("Cao Cap"))
                    iCC++;
                else if (gd.getLoai().equals("Thuong"))
                    iT++;
            }
            else if (gd instanceof GiaoDichDat)
            {
                if (gd.getLoai().equals("A"))
                    iA++;
                else if (gd.getLoai().equals("B"))
                    iB++;
                else if (gd.getLoai().equals("C"))
                    iC++;
            }
        }

        System.out.println("Tong so luong tung loai: ");
        System.out.println("So Luong nha loai cao cap: " + iCC);
        System.out.println("So Luong nha loai thuong: " + iT);
        System.out.println("So Luong dat loai A: " + iA);
        System.out.println("So Luong dat loai B: " + iB);
        System.out.println("So Luong dat loai C: " + iC);

        System.out.println("Trung binh thanh tien cua giao dich dat la: ");
        double temp = 0.0;
        int count = 0;
        Locale local = new Locale("vi", "vn");
        NumberFormat nf = NumberFormat.getInstance(local);
        for (GiaoDich gd : listGiaoDich)
            if (gd instanceof GiaoDichDat)
            {
                temp += gd.thanhTien();
                count++;
            }
        
        if (count != 0)
            System.out.println(nf.format(temp / (double) count));
        else
            System.out.println("Khong co giao dich dat");

        System.out.println("Giao dich dat ngay 14/07/2020 la: ");
        for (GiaoDich gd : listGiaoDich)
        {
            if (gd.ngayGiaoDich.isEqual(LocalDate.of(2020, 7, 14)))
                System.out.println(gd.getInfo());
        }
    }
    
}
