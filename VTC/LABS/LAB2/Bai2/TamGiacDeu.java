public class TamGiacDeu extends TamGiacCan
{
    public TamGiacDeu(double canh) throws Exception
    {
        super(canh, canh);
    }

    @Override
    public String toString()
    {
        return String.format("Hinh tam giac deu\nDien tich: %.4f\nChu vi: %.4f", tinhDienTich(), tinhChuVi());
    }
}
