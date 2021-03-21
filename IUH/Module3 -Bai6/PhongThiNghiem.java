public class PhongThiNghiem extends PhongHoc
{
    private String chuyenNganh;
    private int sucChua;
    private boolean coBonRua;

    public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen,
        String chuyenNganh, int sucChua, boolean coBonRua)
    {
        super(maPhong, dayNha, dienTich, soBongDen);
        if (!chuyenNganh.trim().equals(""))
            this.chuyenNganh = chuyenNganh;
        else
            this.chuyenNganh = "null";

        if (sucChua > 0)
            this.sucChua = sucChua;
        else
            this.sucChua = 0;

        this.coBonRua = coBonRua;
    }

    public boolean coDatChuan()
    {
        return (coBonRua && (dienTich / (double) soBongDen) <= 10.0) ? true : false;
    }

    @Override
    public String getInfo()
    {
        return String.format("%-15s %-15s %-15.2f %-15d %-15s %-10d %-15s", maPhong, dayNha,
            dienTich, soBongDen, chuyenNganh, sucChua, coBonRua ? "Co bon rua" : "Khong co bon rua");
    }
}
