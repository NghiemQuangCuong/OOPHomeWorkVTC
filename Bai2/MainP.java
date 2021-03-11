public class MainP {

    public static void main(String[] args)
    {
        SinhVien sv1 = new SinhVien(111, "Nghiem Quang Cuong", 6.7f, 5.7f);
        SinhVien sv2 = new SinhVien(222, "Ly Toan Hanh", 7.7f, 9.7f);
        SinhVien sv3 = new SinhVien();

        System.out.printf("%-10s %-30s %10s   %10s   %10s\n", "MSSV", "Ho Va Ten", "Diem LT", "Diem TH", "Diem TB");
        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());
        
    }
    
}
