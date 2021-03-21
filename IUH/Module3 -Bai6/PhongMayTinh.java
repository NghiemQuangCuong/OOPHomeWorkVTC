public class PhongMayTinh extends PhongHoc
{
    private int soMayTinh;

    public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen,
        int soMayTinh)
    {
        super(maPhong, dayNha, dienTich, soBongDen);
        if (soMayTinh > 0)
            this.soMayTinh = soMayTinh;
        else
            this.soMayTinh = 0;
    }

    public boolean coDatChuan()
    {
        return ((dienTich / (double) soMayTinh) <= 1.5 && (dienTich / (double) soBongDen) <= 10.0) ? true : false;
    }

    public int getSoMayTinh()
    {
        return soMayTinh;
    }

    public void capNhapMayTinh()
    {
        System.out.println("----------Cap nhap so may tinh----------");
        System.out.println("So may tinh hien tai: " + soMayTinh);
        System.out.println("So may tinh can thay doi: ");
        int newSoMayTinh = Integer.parseInt(MainP.sc.nextLine());
        soMayTinh = newSoMayTinh;
    }

    @Override
    public String getInfo()
    {
        return String.format("%-15s %-15s %-15.2f %-15d %-15d", maPhong, dayNha,
            dienTich, soBongDen, soMayTinh);
    }
}
