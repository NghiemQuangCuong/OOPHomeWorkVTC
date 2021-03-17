import java.time.LocalDate;
import java.util.ArrayList;

public class MainP 
{
    public static void main(String[] args)
    {
        HoaDonDien hoaDon1 = new HoaDonDienVN("792", "Tran Thi Cuc", LocalDate.of(2019, 8, 22), 55, 3000.0, "Sinh Hoat", 50);
        HoaDonDien hoaDon2 = new HoaDonDienVN("239", "Nguyen Quang Dinh", LocalDate.of(2019, 8, 22), 150, 2500.0, "Kinh Doanh", 100);
        HoaDonDien hoaDon3 = new HoaDonDienVN("153", "Dinh Thi Mui", LocalDate.of(2019, 8, 21), 1200, 2200.0, "San Xuat", 150);
        HoaDonDien hoaDon4 = new HoaDonDienNN("634", "John Josep", LocalDate.of(2019, 8, 22), 45, 3500.0, "Hungrary");
        HoaDonDien hoaDon5 = new HoaDonDienNN("561", "Carde Suelle", LocalDate.of(2019, 8, 20), 55, 3500.0, "Italy");
        HoaDonDien hoaDon6 = new HoaDonDienNN("452", "METLAMROI", LocalDate.of(2019, 8, 20), 65, 3500.0, "Spain");
        ArrayList<HoaDonDien> listHoaDonDien = new ArrayList<>();
        listHoaDonDien.add(hoaDon1);
        listHoaDonDien.add(hoaDon2);
        listHoaDonDien.add(hoaDon3);
        listHoaDonDien.add(hoaDon4);
        listHoaDonDien.add(hoaDon5);
        listHoaDonDien.add(hoaDon6);

        int iVN = 0, iNN = 0;
        double trungBinh = 0.0;
        int count = 0;
        for (HoaDonDien hd : listHoaDonDien)
            if (hd instanceof HoaDonDienVN)
                iVN++;
            else if (hd instanceof HoaDonDienNN)
            {
                iNN++;
                trungBinh += hd.thanhTien();
                count++;
            }
                
        if (count != 0)
            trungBinh /= (double) count;
        else
            trungBinh = 0;

        System.out.println("Tong so luong tung loai khach hang: ");
        System.out.println("Nguoi VN: " + iVN);
        System.out.println("Nguoi NN: " + iNN);
        System.out.println("Trung binh thanh tien cua nuoc ngoai: " + trungBinh);

        System.out.println("Cac hoa don trong ngay 22/08/2019 la: ");
        for (HoaDonDien hd : listHoaDonDien)
            if (hd.getNgayLapHoaDon().isEqual(LocalDate.of(2019, 8, 22)))
                System.out.println(hd.getInfo());


    }
    
}
