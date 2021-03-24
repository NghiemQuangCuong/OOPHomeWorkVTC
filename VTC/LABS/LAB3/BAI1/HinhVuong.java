public class HinhVuong extends HinhChuNhat
{
    public HinhVuong(String ten, double canh)
    {
        super(ten, canh, canh);
    }

    @Override
    public String toString()
    {
        return String.format("Hinh vuong %s\nDien tich: %.4f\nChu vi: %.4f", getTen(),tinhDienTich(), tinhChuVi());
    }
}
