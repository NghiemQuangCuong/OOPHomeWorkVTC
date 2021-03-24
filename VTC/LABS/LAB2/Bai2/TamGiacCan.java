public class TamGiacCan extends TamGiac
{
    public TamGiacCan(double ab, double c) throws Exception
    {
        super(ab, ab, c);
    }

    @Override
    public String toString()
    {
        return String.format("Hinh tam giac can\nDien tich: %.4f\nChu vi: %.4f", tinhDienTich(), tinhChuVi());
    }
}
