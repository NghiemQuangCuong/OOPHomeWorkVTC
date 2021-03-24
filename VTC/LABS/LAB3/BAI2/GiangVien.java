import java.time.LocalDate;
import java.util.Scanner;

public abstract class GiangVien
{
    private String hoTen;
    private LocalDate ngaySinh;
    private String hocHam;
    private String hocVi;
    private LocalDate ngayBatDauCongTac;
    private final double thuLao = 90000;
    private double tienLuong;

    protected GiangVien(String hoTen, LocalDate ngaySinh, String hocHam, String hocVi, LocalDate ngayBatDauCongTac)
    {
        this.hoTen = (!hoTen.trim().equals("")) ? hoTen : "null";
        this.ngaySinh = ngaySinh;
        this.hocHam = (!hocHam.trim().equals("")) ? hocHam : "null";
        this.hocVi = (!hocVi.trim().equals("")) ? hocVi : "null";
        this.ngayBatDauCongTac = ngayBatDauCongTac;
    }

    protected abstract void tinhLuong(Scanner sc);
    public abstract String toString();

    protected String getHoTen() {
        return hoTen;
    }

    protected void setHoTen(String hoTen) {
        this.hoTen = (!hoTen.trim().equals("")) ? hoTen : this.hoTen;
    }

    protected LocalDate getNgaySinh() {
        return ngaySinh;
    }

    protected void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    protected String getHocHam() {
        return hocHam;
    }

    protected void setHocHam(String hocHam) {
        this.hocHam = (!hocHam.trim().equals("")) ? hocHam : this.hocHam;
    }

    protected String getHocVi() {
        return hocVi;
    }

    protected void setHocVi(String hocVi) {
        this.hocVi = (!hocVi.trim().equals("")) ? hocVi : this.hocVi;
    }

    protected LocalDate getNgayBatDauCongTac() {
        return ngayBatDauCongTac;
    }

    protected void setNgayBatDauCongTac(LocalDate ngayBatDauCongTac) {
        this.ngayBatDauCongTac = ngayBatDauCongTac;
    }

    protected double getThuLao()
    {
        return thuLao;
    }

    protected double getTienLuong() {
        return tienLuong;
    }

    protected void setTienLuong(double tienLuong) {
        this.tienLuong = (tienLuong > 0.0) ? tienLuong : this.tienLuong;
    }
}