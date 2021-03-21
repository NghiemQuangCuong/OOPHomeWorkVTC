public abstract class PhongHoc
{
    protected String maPhong;
    protected String dayNha;
    protected double dienTich;
    protected int soBongDen;

    protected PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen)
    {
        if (!maPhong.trim().equals(""))
            this.maPhong = maPhong;
        else
            this.maPhong = "null";

        if (!dayNha.trim().equals(""))
            this.dayNha = dayNha;
        else
            this.dayNha = "null";

        if (dienTich > 0.0)
            this.dienTich = dienTich;
        else
            this.dienTich = 0.0;

        if (soBongDen > 0)
            this.soBongDen = soBongDen;
        else
            this.soBongDen = 0;
    }

    public String getMaPhong()
    {
        return maPhong;
    }

    public String getDayNha()
    {
        return dayNha;
    }

    public double getDienTich()
    {
        return dienTich;
    }

    public int getBongDen()
    {
        return soBongDen;
    }

    public boolean equals(PhongHoc ph)
    {
        return (maPhong.equals(ph.getMaPhong())) ? true : false;
    }

    protected abstract boolean coDatChuan();
    protected abstract String getInfo();
}