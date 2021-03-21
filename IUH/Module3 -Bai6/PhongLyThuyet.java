public class PhongLyThuyet extends PhongHoc
{
    private boolean coMayChieu;

    public PhongLyThuyet(String maPhong, String dayNha, double dienTich, 
        int soBongDen, boolean coMayChieu)
    {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.coMayChieu = coMayChieu;
    }

    public boolean coDatChuan()
    {
        return (coMayChieu && (dienTich / (double) soBongDen) <= 10.0) ? true : false;
    }

    @Override
    public String getInfo()
    {
        return String.format("%-15s %-15s %-15.2f %-15d %-15s", maPhong, dayNha,
            dienTich, soBongDen, coMayChieu ? "Co may chieu" : "Khong may chieu");
    }
}
