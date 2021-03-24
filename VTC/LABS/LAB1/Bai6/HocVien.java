import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HocVien
{
    private static int count;
    static 
    {
        count = 0;
    }
    private int maSo;
    private String hoTen;
    private LocalDate ngaySinh;
    private GioiTinh gioiTinh;
    private String queQuan;
    private DiemBaMon diem;

    public HocVien(String hoTen, LocalDate ngaySinh, GioiTinh gioiTinh, String queQuan)
    {
        count++;
        this.maSo = count;
        this.hoTen = (!hoTen.trim().equals("")) ? hoTen : "null";
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.queQuan = (!queQuan.trim().equals("")) ? queQuan : "null";
    }

    public String danhGia()
    {
        return diem.danhGia();
    }

    public int getMaSo()
    {
        return maSo;
    }

    public String getHoTen()
    {
        return hoTen;
    }

    public String getQueQuan()
    {
        return queQuan;
    }

    public void setDiem(double diem1, double diem2, double diem3) throws Exception
    {
        diem = new DiemBaMon(diem1, diem2, diem3);
    }

    public DiemBaMon getDiem()
    {
        return diem;
    }

    public GioiTinh getGioiTinh()
    {
        return gioiTinh;
    }

    public String getInfo()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if (diem != null)
            return String.format("%-25s %-20s %25s %10.1f %10.1f %10.1f", hoTen, queQuan, 
                ngaySinh.format(dtf), diem.diem1, diem.diem2, diem.diem3);
        else    
            return String.format("%-25s %-20s %25s", hoTen, queQuan, ngaySinh.format(dtf));
    }

    public class DiemBaMon 
    {
        private double diem1;
        private double diem2;
        private double diem3;

        private DiemBaMon(double diem1, double diem2, double diem3) throws Exception
        {
            if (diem1 >= 0.0 && diem1 <= 10.0)
                this.diem1 = diem1;
            else
                throw new Exception("Loi: diem khong hop le " + diem1);

            if (diem2 >= 0.0 && diem2 <= 10.0)
                this.diem2 = diem2;
            else
                throw new Exception("Loi: diem khong hop le " + diem2);

            if (diem3 >= 0.0 && diem3 <= 10.0)
                this.diem3 = diem3;
            else
                throw new Exception("Loi: diem khong hop le " + diem3);
        }

        private double diemTrungBinh()
        {
            return (diem1 + diem2 + diem3) / 3.0;
        }

        private String danhGia()
        {
            if (diemTrungBinh() >= 8.0 && diem1 >= 5 && diem2 >= 5 && diem3 >= 5)
                return "Tot";
            else
                return "Chua tot";
        }

        public double getDiem1()
        {
            return diem1;
        }

        public double getDiem2()
        {
            return diem2;
        }

        public double getDiem3()
        {
            return diem3;
        }
    }
}