public class SinhVien
{
    private String maSinhVien;
    private String hoTen;
    private int namSinh;

    public SinhVien(String maSinhVien, String hoTen, int namSinh)
    {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getInfo()
    {
        return String.format("%-20s %-25s %15d", maSinhVien, hoTen, namSinh);
    }

    public boolean equals(SinhVien sv)
    {
        return (maSinhVien == sv.getMaSinhVien()) ? true : false;
    }
}