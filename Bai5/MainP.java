import java.time.LocalDate;

public class MainP 
{
    public static void main(String[] args) throws Exception
    {
        // Kiem thu cho san pham co ma hang rong:
        String maHang = "";
        String tenHang = "Bot Giat";
        float donGia = 17000f;
        LocalDate ngaySanXuat = LocalDate.of(2020,12, 24);
        LocalDate ngayHetHan = LocalDate.of(2021, 12, 24);

        try 
        {
            HangThucPham hang1 = new HangThucPham("001", "Gao", 100000f, 
                LocalDate.of(2020, 7, 10), LocalDate.of(2021, 7, 10));
            HangThucPham hang2 = new HangThucPham("002", "Mi", 5000f, 
                LocalDate.of(2020, 5, 22), LocalDate.of(2021, 11, 22));
            HangThucPham hang3 = new HangThucPham("003", "", -10000f,
                LocalDate.of(2017, 3, 1), LocalDate.of(2020, 3, 8));
            
            System.out.printf("%-10s %-20s %23s %-15s %-15s %-20s\n", "MaHang", "TenHang", "DonGia",
            "NgaySanXuat", "NgayHetHan", "GhiChu");
            System.out.println("====================================================================================================");
            System.out.println(hang1);
            System.out.println(hang2);
            System.out.println(hang3);

            // hang 4 co ma hang rong -> quang exception -> catch exception
            HangThucPham hang4 = new HangThucPham(maHang, tenHang, donGia, ngaySanXuat, ngayHetHan);
            System.out.println(hang4);
        }
        catch (Exception ex)
        {
           // System.err.println(ex.getMessage());  
        }
    }
}
