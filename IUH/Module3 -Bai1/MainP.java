import java.time.LocalDate;

public class MainP 
{
    public static void main(String[] args)
    {
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        NhanVien nv1 = new NhanVien(1000, "Tran Thi Trinh", "23 Au Co", "0352893327");
        NhanVien nv2 = new NhanVien(1001, "Nguyen Minh Hieu", "236 Lac Long Quan", "0979399899");
        NhanVien nv3 = new NhanVien(1002, "Le Van Vui", "112 CMT8", "0939412624");
        NhanVien nv4 = new NhanVien(1003, "Nguyen Minh Hieu", "11 Duong 3/2", "0979371097");

        qlnv.themNhanVien(nv1);
        qlnv.themNhanVien(nv2);
        qlnv.themNhanVien(nv3);
        qlnv.themNhanVien(nv4);

        qlnv.xuatTenSanPham();
        System.out.println("----------------------------------------");
        qlnv.dangKyDiDuLich(1000, LocalDate.of(2021, 2, 2));
        qlnv.dangKyDiDuLich(1001, LocalDate.of(2021, 2, 2));
        qlnv.dangKyDiDuLich(1002, LocalDate.of(2021, 2, 4));
        qlnv.dangKyDiDuLich(1003, LocalDate.of(2021, 2, 2));
        qlnv.xuatNVDangKiSomNhat();
        System.out.println("----------------------------------------");
        System.out.println(qlnv.chonTenPhoBienNhat());
        System.out.println("----------------------------------------");

        KhachHang kh1 = new KhachHang("Minh", 2540000000.0);
        KhachHang kh2 = new KhachHang("Tuan", 3330000000.0);
        KhachHang kh3 = new KhachHang("Lan", 1570000000.0);
        KhachHang kh4 = new KhachHang("Khoi", 4250000000.0);

        QuanLyKhachHang qlkh = new QuanLyKhachHang();
        qlkh.themKH(kh1);
        qlkh.themKH(kh2);
        qlkh.themKH(kh3);
        qlkh.themKH(kh4);

        qlkh.sortListDoanhSoTangDan();
        qlkh.xuatListKhachHang();
    }
}
