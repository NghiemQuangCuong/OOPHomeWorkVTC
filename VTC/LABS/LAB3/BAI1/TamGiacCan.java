public class TamGiacCan extends TamGiac
{
    public TamGiacCan(String ten, double ab, double c) throws Exception
    {
        super(ten, ab, ab, c);
    }

    @Override
    public String toString()
    {
        return String.format("Hinh tam giac can %s\nDien tich: %.4f\nChu vi: %.4f", getTen(),tinhDienTich(), tinhChuVi());
    }
}
