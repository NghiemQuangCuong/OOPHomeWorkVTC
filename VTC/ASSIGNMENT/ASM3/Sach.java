public class Sach
{
    private String maSach;
    private String tenSach;
    private String tenTacGia;
    private int soLuong;
    private String danhMuc;

    public Sach(String maSach, String tenSach, String tenTacGia, int soLuong, String danhMuc)
    {
        this.maSach = (!maSach.trim().equals("")) ? maSach : "null";
        this.tenSach = (!tenSach.trim().equals("")) ? tenSach : "null";
        this.tenTacGia = (!tenTacGia.trim().equals("")) ? tenTacGia : "null";
        this.danhMuc = (!danhMuc.trim().equals("")) ? danhMuc : "null";
        this.soLuong = (soLuong > 0) ? soLuong : 0;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Sach && ((Sach)obj).getMaSach().equals(maSach))
            return true;
        return false;
    }

    @Override
    public int hashCode()
    {
        return maSach.hashCode();
    }

    @Override
    public String toString()
    {
        return String.format("%-15s %-25s %-25s %10d %20s", maSach, tenSach, tenTacGia, soLuong, danhMuc);
    }

    public String toTextSave()
    {
        return maSach + "," + tenSach + "," + tenTacGia + "," + soLuong + "," + danhMuc;
    }

    public String getMaSach() {
        return maSach;
    }


    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = (!tenSach.trim().equals("")) ? tenSach : this.tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = (!tenTacGia.trim().equals("")) ? tenTacGia : this.tenTacGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = (soLuong > 0) ? soLuong : this.soLuong;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = (!danhMuc.trim().equals("")) ? danhMuc : this.danhMuc;
    }

    
}