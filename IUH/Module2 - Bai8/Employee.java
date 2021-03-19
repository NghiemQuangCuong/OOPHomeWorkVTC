import java.text.DecimalFormat;

public class Employee extends Person
{
    private double heSoLuong;
    private final double LUONGCOBAN = 6000000;

    public Employee()
    {
        super();
        heSoLuong = 0.0;
    }

    public Employee(String hoTen, String diaChi, double heSoLuong)
    {
        super(hoTen, diaChi);
        if (heSoLuong > 0.0)
            this.heSoLuong = heSoLuong;
        else
            this.heSoLuong = 0.0;
    }

    public double tinhLuong()
    {
        return heSoLuong * LUONGCOBAN;
    }

    @Override
    public String danhGia()
    {
        if (tinhLuong() < 10000000)
            return "Nhan Vien Trung Binh";
        else if (tinhLuong() < 20000000)
            return "Nhan Vien Gioi";
        else 
            return "Nhan Vien Xuat Sac";
    }

    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        return String.format("%-25s %-25s %12.2f %25s %20s", hoTen, diaChi, heSoLuong, df.format(tinhLuong()), danhGia());
    }
}
