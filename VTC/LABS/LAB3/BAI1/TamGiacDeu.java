public class TamGiacDeu extends TamGiacCan
{
    public TamGiacDeu(String ten, double canh) throws Exception
    {
        super(ten, canh, canh);
    }

    @Override
    public String toString()
    {
        return String.format("Hinh tam giac deu %s\nDien tich: %.4f\nChu vi: %.4f", getTen(),tinhDienTich(), tinhChuVi());
    }
}
