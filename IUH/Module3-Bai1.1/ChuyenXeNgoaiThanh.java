public class ChuyenXeNgoaiThanh extends ChuyenXe
{
    private String noiDen;
    private int soNgayDiDuoc;

    public ChuyenXeNgoaiThanh()
    {
        super();
        this.noiDen = "null";
        this.soNgayDiDuoc = 0;
    }

    public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu
        , String noiDen, int soNgayDiDuoc)
    {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        if (!noiDen.trim().equals(""))
            this.noiDen = noiDen;
        else
            this.noiDen = "null";

        if (soNgayDiDuoc > 0)
            this.soNgayDiDuoc = soNgayDiDuoc;
        else
            this.soNgayDiDuoc = 0;
    }

    @Override
    public String getInfo()
    {
        return String.format("%-10s %-25s %-10s %20.1f %20s %10d", maSoChuyen, hoTenTaiXe, soXe,
            doanhThu, noiDen, soNgayDiDuoc);
    }
}

