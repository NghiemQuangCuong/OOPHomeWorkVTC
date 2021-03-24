public class Circle extends Ellipse
{
    public Circle(double banKinh)
    {
        super(banKinh, banKinh);
    }

    @Override
    public String toString()
    {
        return String.format("Hinh Circle\nDien Tich: %.4f\nChu vi: %.4f\n", tinhDienTich(), tinhChuVi()); 
    }
}
