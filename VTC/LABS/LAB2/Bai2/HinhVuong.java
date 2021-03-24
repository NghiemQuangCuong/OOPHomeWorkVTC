public class HinhVuong extends HinhChuNhat
{
    public HinhVuong(double canh)
    {
        super(canh, canh);
    }

    @Override
    public String toString()
    {
        return String.format("Hinh vuong\nDien tich: %.4f\nChu vi: %.4f", tinhDienTich(), tinhChuVi());
    }
}
