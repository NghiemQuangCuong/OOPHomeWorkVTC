public class Student extends Person
{
    private double diemMon1;
    private double diemMon2;

    public Student()
    {
        super();
        diemMon1 = 0.0;
        diemMon2 = 0.0;
    }

    public Student(String hoTen, String diaChi, double diemMon1, double diemMon2)
    {
        super(hoTen, diaChi);
        if (diemMon1 < 0 || diemMon1 > 10.0)
            this.diemMon1 = 0.0;
        else
            this.diemMon1 = diemMon1;

        if (diemMon2 < 0 || diemMon2 > 10.0)
            this.diemMon2 = 0.0;
        else
            this.diemMon2 = diemMon1;
    }

    public double diemTrungBinh()
    {
        return (diemMon1 + diemMon2) / 2.0;
    }

    @Override
    public String danhGia()
    {
        if (diemTrungBinh() < 5)
            return "Trung Binh / Yeu";
        else if (diemTrungBinh() < 7)
            return "Kha";
        else if (diemTrungBinh() < 9)
            return "Gioi";
        else    
            return "Xuat Sac";
    }

    @Override
    public String toString()
    {
        return String.format("%-25s %-25s %12s %12s %15.2f %-15s", hoTen, diaChi, diemMon1, diemMon2, 
            diemTrungBinh(), danhGia());
    }
}
