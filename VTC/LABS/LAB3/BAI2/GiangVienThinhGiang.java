import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GiangVienThinhGiang extends GiangVien
{
    private String noiCongTacHienTai;

    public GiangVienThinhGiang(String hoTen, LocalDate ngaySinh, String hocHam, String hocVi, 
        LocalDate ngayBatDauCongTac, String noiCongTacHienTai)
    {
        super(hoTen, ngaySinh, hocHam, hocVi, ngayBatDauCongTac);
        this.noiCongTacHienTai = (!noiCongTacHienTai.trim().equals("")) ? noiCongTacHienTai : "null";
    }

    @Override
    public void tinhLuong(Scanner sc)
    {
        System.out.println("Nhap so gio lam cua giang vien " + getHoTen());
        double input = Double.parseDouble(sc.nextLine());
        System.out.printf("Luong: %.5f\n", input * getThuLao());
        setTienLuong(input * getThuLao());
    }

    @Override
    public String toString()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-20s %-20s %-15s %-15s %-15s %20s", getHoTen(), getNgaySinh().format(dtf), getHocHam(), getHocVi(),
            getNgayBatDauCongTac().format(dtf), noiCongTacHienTai);
    }

    public String getNoiCongTacHienTai() {
        return noiCongTacHienTai;
    }

    public void setNoiCongTacHienTai(String noiCongTacHienTai) {
        this.noiCongTacHienTai = (!noiCongTacHienTai.trim().equals("")) ? noiCongTacHienTai : this.noiCongTacHienTai;
    }

    
}
