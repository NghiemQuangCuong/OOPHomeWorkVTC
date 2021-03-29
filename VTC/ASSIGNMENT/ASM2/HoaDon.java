import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class HoaDon 
{
    private String maHoaDon;
    private String maNhanVien;
    private String maKhachHang;
    private ArrayList<MatHang> listMatHang;
    private int soMatHang;
    private LocalDate ngayTao;
    private LocalTime gioTao;
    private double tongTien;
    
    public HoaDon(String maHoaDon, String maNhanVien, String maKhachHang) throws Exception
    {
        this.maHoaDon = (!maHoaDon.trim().equals("")) ? maHoaDon : "null";
        this.maNhanVien = (!maNhanVien.trim().equals("")) ? maNhanVien : "null";
        if (DSKH.contains(maKhachHang))
            this.maKhachHang = maKhachHang;
        else
            throw new Exception("Loi: Khong tim thay ma khach hang");
        soMatHang = 0;
        tongTien = 0.0;
        ngayTao = LocalDate.now();
        gioTao = LocalTime.now();
        
        listMatHang = new ArrayList<>();
    }

    public void themMatHang(MatHang mh)
    {
        listMatHang.add(mh);
        soMatHang ++;
        tongTien += mh.getDonGia() * mh.getSoLuong();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof HoaDon && ((HoaDon)obj).getMaHoaDon().equals(maHoaDon))
            return true;
        return false;
    }

    @Override
    public int hashCode()
    {
        return maHoaDon.hashCode();
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }


    public String getMaNhanVien() {
        return maNhanVien;
    }


    public String getMaKhachHang() {
        return maKhachHang;
    }


    public int getSoMatHang() {
        return soMatHang;
    }


    public LocalDate getNgayTao() {
        return ngayTao;
    }


    public LocalTime getGioTao() {
        return gioTao;
    }


    public double getTongTien() {
        return tongTien;
    }
}