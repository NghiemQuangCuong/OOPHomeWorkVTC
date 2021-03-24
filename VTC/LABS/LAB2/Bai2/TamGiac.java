public class TamGiac 
{
    protected double a;
    protected double b;
    protected double c;

    public TamGiac(double a, double b, double c) throws Exception
    {

        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a)
            throw new Exception("Loi: 3 canh khong tao thanh tam giac");

        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double tinhDienTich()
    {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public double tinhChuVi()
    {
        return a + b + c;
    }

    @Override
    public String toString()
    {
        return String.format("Hinh tam giac\nDien tich: %.4f\nChu vi: %.4f", tinhDienTich(), tinhChuVi());
    }
}
