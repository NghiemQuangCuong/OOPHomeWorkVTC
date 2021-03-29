import java.time.LocalTime;


public class LopHoc 
{
    private String maLop;
    private String moTaLop;
    private String giangVien;
    private Pair<LocalTime, LocalTime> thoiGianHoc;
    private NgayHoc ngayHoc;

    public LopHoc(String maLop, String moTaLop, String giangVien,Pair<LocalTime, LocalTime> thoiGianHoc,
        NgayHoc ngayHoc)
    {
        this.maLop = (!maLop.trim().equals("")) ? maLop : "null";
        this.moTaLop = (!moTaLop.trim().equals("")) ? moTaLop : "null";
        this.giangVien = (!giangVien.trim().equals("")) ? giangVien : "null";
        this.thoiGianHoc = thoiGianHoc;
        this.ngayHoc = ngayHoc;
    }

    @Override
    public String toString()
    {
        String gioHocDau = thoiGianHoc.getKey().toString();
        gioHocDau = gioHocDau.replace(":", "h");
        String gioHocCuoi = thoiGianHoc.getValue().toString();
        gioHocCuoi = gioHocCuoi.replace(":", "h");
        String ngayHoc = (this.ngayHoc == NgayHoc.HAI_TU_SAU) ? "2 - 4 - 6" : "3 - 5 - 7";

        return String.format("%-15s %-25s %-25s %8s - %8s %15s", maLop, 
            moTaLop, giangVien, gioHocDau, gioHocCuoi, ngayHoc);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof LopHoc && ((LopHoc)obj).getMaLop().equals(maLop))
            return true;
        else
            return false;
    }

    public String getMaLop() {
        return maLop;
    }

    public String getMoTaLop() {
        return moTaLop;
    }

    public void setMoTaLop(String moTaLop) {
        this.moTaLop = (!moTaLop.trim().equals("")) ? moTaLop : this.moTaLop;
    }

    public String getGiangVien() {
        return giangVien;
    }

    public void setGiangVien(String giangVien) {
        this.giangVien = (!giangVien.trim().equals("")) ? giangVien : this.giangVien;
    }

    public Pair<LocalTime, LocalTime> getThoiGianHoc() {
        return thoiGianHoc;
    }

    public void setThoiGianHoc(Pair<LocalTime, LocalTime> thoiGianHoc) {
        this.thoiGianHoc = thoiGianHoc;
    }

    public NgayHoc getNgayHoc() {
        return ngayHoc;
    }

    public void setNgayHoc(NgayHoc ngayHoc) {
        this.ngayHoc = ngayHoc;
    }

    

}
