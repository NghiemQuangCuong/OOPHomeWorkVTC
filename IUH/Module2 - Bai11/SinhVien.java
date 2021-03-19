public abstract class SinhVien
{
    protected String maSinhVien;
    protected String hoTen;
    protected String soDienThoai;
    protected String gioiTinh;

    public SinhVien()
    {
        maSinhVien = "null";
        hoTen = "null";
        soDienThoai = "null";
        gioiTinh = "null";
    }

    public SinhVien(String maSinhVien, String hoTen, String soDienThoai, String gioiTinh)
    {
        if (!maSinhVien.trim().equals(""))
            this.maSinhVien = maSinhVien;
        else
            this.maSinhVien = "null";

        if (!hoTen.trim().equals(""))
            this.hoTen = hoTen;
        else
            this.hoTen = "null";

        if (!soDienThoai.trim().equals(""))
            this.soDienThoai = soDienThoai;
        else
            this.soDienThoai = "null";

        if (!gioiTinh.trim().equals(""))
            this.gioiTinh = gioiTinh;
        else
            this.gioiTinh = "null";
    }

    public abstract String getInfo();
}