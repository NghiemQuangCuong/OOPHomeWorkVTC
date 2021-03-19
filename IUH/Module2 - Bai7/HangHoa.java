public abstract class HangHoa
{
    protected String maHang;
    protected String tenHang;
    protected double donGia;
    protected int soLuongTon;

    public HangHoa()
    {
        maHang = "xxx";
        tenHang = "xxx";
        donGia = 0;
        soLuongTon = 0;
    }

    public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon)
    {
        if (maHang.trim().equals(""))
            this.maHang = "xxx";
        else
            this.maHang = maHang;

        if (tenHang.trim().equals(""))
            this.tenHang = "xxx";
        else
            this.tenHang = tenHang;

        if (donGia > 0)
            this.donGia = donGia;
        else
            this.donGia = 0;

        if (soLuongTon > 0)
            this.soLuongTon = soLuongTon;
        else
            this.soLuongTon = 0;
    }

    public String getMaHang()
    {
        return maHang;
    }

    public boolean equals(HangHoa obj)
    {
        if (maHang.equals(obj.getMaHang()))
            return true;
        else
            return false;
    }

    public String getTenHang()
    {
        return tenHang;
    }

    public int getSoLuongTon()
    {
        return soLuongTon;
    }

    public double getDonGia()
    {
        return donGia;
    }

    public void setDonGia(double donGia)
    {
        if (donGia > 0.0)
            this.donGia = donGia;
        else
            this.donGia = 0.0;
    }

    public abstract String mucDoBanBuon();
    public abstract String getInfo();
}