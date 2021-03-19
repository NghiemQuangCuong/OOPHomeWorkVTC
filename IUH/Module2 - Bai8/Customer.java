import java.text.DecimalFormat;

public class Customer extends Person
{
    private String tenCongTy;
    private double triGiaHoaDon;
    
    public Customer()
    {
        super();
        tenCongTy = "null";
        triGiaHoaDon = 0.0;
    }

    public Customer(String hoTen, String diaChi, String tenCongTy, double triGiaHoaDon)
    {
        super(hoTen, diaChi);
        if (!tenCongTy.trim().equals(""))
            this.tenCongTy = tenCongTy;
        else
            this.tenCongTy = "null";

        if (triGiaHoaDon > 0.0)
            this.triGiaHoaDon = triGiaHoaDon;
        else
            this.triGiaHoaDon = 0.0;
    }

    @Override
    public String danhGia()
    {
        if (triGiaHoaDon < 100000000)
            return "Cong ty nho";
        else if (triGiaHoaDon < 500000000)
            return "Cong ty vua";
        else
            return "Cong ty lon";
    }

    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        return String.format("%-25s %-25s %-25s %25s %20s", hoTen, diaChi, tenCongTy, df.format(triGiaHoaDon), danhGia());
    }
}
