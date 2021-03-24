public class Circle extends Ellipse
{
    public Circle(String ten, double banKinh)
    {
        super(ten, banKinh, banKinh);
    }

    @Override
    public String toString()
    {
        return String.format("Hinh Circle %s\nDien Tich: %.4f\nChu vi: %.4f\n", getTen(),tinhDienTich(), tinhChuVi()); 
    }
}
