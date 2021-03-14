import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class MainP 
{
    public static void main(String[] args)
    {
        ChuyenXe chuyenXe1 = new ChuyenXeNgoaiThanh("0003", "Nguyen Van Chien", "33456", 15000000.0,
            "Tien Giang", 3);
        ChuyenXe chuyenXe2 = new ChuyenXeNgoaiThanh("1321", "Tran Quang Thuc", "34217", 20000000.0,
            "Kien Giang", 5);
        ChuyenXe chuyenXe3 = new ChuyenXeNoiThanh("3521", "Sang", "97241", 8000000.0,
            30, 235.3f);
        ChuyenXe chuyenXe4 = new ChuyenXeNoiThanh("1354", "Minh Chi", "42789", 12000000.0,
            25, 312.6f);
        ChuyenXe chuyenXe5 = new ChuyenXeNgoaiThanh();

        ArrayList<ChuyenXe> listChuyenXe = new ArrayList<>();
        listChuyenXe.add(chuyenXe1);
        listChuyenXe.add(chuyenXe2);
        listChuyenXe.add(chuyenXe3);
        listChuyenXe.add(chuyenXe4);
        listChuyenXe.add(chuyenXe5);
        Locale local = new Locale("vi", "vn");
        NumberFormat nf = NumberFormat.getInstance(local);

        {
            System.out.println("Tong doanh thu: ");
            double doanhThu = 0.0;
            for (ChuyenXe cx : listChuyenXe)
                doanhThu += cx.getDoanhThu();

            System.out.println(nf.format(doanhThu));
        }

        {
            System.out.println("Doanh thu xe ngoai thanh: ");
            double doanhThu = 0.0;
            for (ChuyenXe cx : listChuyenXe)
                if (cx instanceof ChuyenXeNgoaiThanh) doanhThu += cx.getDoanhThu();

            System.out.println(nf.format(doanhThu));
        }

        {
            System.out.println("Doanh thu xe noi thanh: ");
            double doanhThu = 0.0;
            for (ChuyenXe cx : listChuyenXe)
                if (cx instanceof ChuyenXeNoiThanh) doanhThu += cx.getDoanhThu();

            System.out.println(nf.format(doanhThu));
        }

        System.out.println("---------------------------------");
        for (ChuyenXe cx : listChuyenXe)
            System.out.println(cx.getInfo());

    }    
}
