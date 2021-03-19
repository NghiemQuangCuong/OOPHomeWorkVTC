public abstract class Person
{
    protected String hoTen;
    protected String diaChi;

    protected Person()
    {
        hoTen = "null";
        diaChi = "null";
    }

    protected Person(String hoTen, String diaChi)
    {
        if (!hoTen.trim().equals(""))
            this.hoTen = hoTen;
        else
            this.hoTen = "null";
        if (!diaChi.trim().equals(""))
            this.diaChi = diaChi;
        else
            this.diaChi = "null";
    }

    @Override
    public String toString()
    {
        return hoTen + " " + diaChi;
    }

    public String getHoTen()
    {
        return hoTen;
    }

    public abstract String danhGia();
}