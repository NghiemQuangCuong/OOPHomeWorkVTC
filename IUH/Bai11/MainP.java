import java.time.LocalDate;

public class MainP 
{
    public static void main(String[] args)
    {
        float[] diem1 = {8f, 5f, 6f, 10f, 10f};
        float[] diem2 = {6.5f, 7f, 5f, 6.5f, 6f};
        float[] diem3 = {9f, 9f, 8f, 10f, 3f};

        HocVien hv1 = new HocVien("Dao Thi A", LocalDate.of(1997, 11, 7), diem1);
        HocVien hv2 = new HocVien("Truong Tuan B", LocalDate.of(1997, 2, 16), diem2);
        HocVien hv3 = new HocVien("Ly Quang C", LocalDate.of(1997, 2, 1), diem3);
        HocVien hv4 = new HocVien();

        System.out.println(hv1.ghiChu());
        System.out.println(hv2.ghiChu());
        System.out.println(hv3.ghiChu());
        System.out.println(hv4.ghiChu());

    }
    
}
