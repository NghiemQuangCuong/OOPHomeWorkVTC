class ChuyenXeNoiThanh extends ChuyenXe
{
    private int soTuyen;
    private float soKmDiDuoc;

    public ChuyenXeNoiThanh()
    {
        super();
        this.soTuyen = 0;
        this.soKmDiDuoc = 0f;
    }

    public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu
        , int soTuyen, float soKmDiDuoc)
    {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        if (soTuyen > 0)
            this.soTuyen = soTuyen;
        else
            this.soTuyen = 0;

        if (soKmDiDuoc > 0f)
            this.soKmDiDuoc = soKmDiDuoc;
        else
            this.soKmDiDuoc = 0f;
    }

    @Override
    public String getInfo()
    {
        return String.format("%-10s %-25s %-10s %20.1f %10d %10.1f", maSoChuyen, hoTenTaiXe, soXe,
            doanhThu, soTuyen, soKmDiDuoc);
    }
}