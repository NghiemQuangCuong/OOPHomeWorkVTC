public class HinhChuNhat
{
    protected double chieuDai;
    protected double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong)
    {
        this.chieuDai = (chieuDai > 0.0) ? chieuDai : 0.0;
        this.chieuRong = (chieuRong > 0.0) ? chieuRong : 0.0;
    }

    public double tinhChuVi()
    {
        return 2.0 * (chieuDai + chieuRong);
    }

    public double tinhDienTich()
    {
        return chieuDai * chieuRong;
    }

    @Override
    public String toString()
    {
        return String.format("Hinh chu nhat\nDien tich: %.4f\nChu vi: %.4f", tinhDienTich(), tinhChuVi());
    }

    public double getChieuDai() 
    {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) 
    {
        this.chieuDai = (chieuDai > 0.0) ? chieuDai : 0.0;
    }

    public double getChieuRong() 
    {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) 
    {
        this.chieuRong = (chieuRong > 0.0) ? chieuRong : 0.0;
    }    
}