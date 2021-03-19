public class SinhVienLienKet extends SinhVien
{
    private String quocGia;

    public SinhVienLienKet()
    {
        super();
    }

    public SinhVienLienKet(String maSinhVien, String hoTen, String soDienThoai, String gioiTinh, 
        String quocGia)
    {
        super(maSinhVien, hoTen, soDienThoai, gioiTinh);
        if (!quocGia.trim().equals(""))
            this.quocGia = quocGia;
        else
            this.quocGia = "null";
    }

    @Override
    public String getInfo()
    {
        return String.format("%-10s | %-25s | %-15s | %-10s | %30s", maSinhVien, hoTen, 
            soDienThoai, gioiTinh, quocGia);
    }
}
