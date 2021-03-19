public class SinhVienTrungCap extends SinhVien
{
    private String selfField;

    public SinhVienTrungCap()
    {
        super();
    }

    public SinhVienTrungCap(String maSinhVien, String hoTen, String soDienThoai, String gioiTinh, 
        String selfField)
    {
        super(maSinhVien, hoTen, soDienThoai, gioiTinh);
        if (!selfField.trim().equals(""))
            this.selfField = selfField;
        else
            this.selfField = "null";
    }

    @Override
    public String getInfo()
    {
        return String.format("%-10s | %-25s | %-15s | %-10s | %30s", maSinhVien, hoTen, 
            soDienThoai, gioiTinh, selfField);
    }
}
