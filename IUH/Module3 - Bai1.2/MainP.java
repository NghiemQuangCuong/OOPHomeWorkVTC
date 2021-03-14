import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MainP 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        Sach sach1 = new SachGiaoKhoa("982143", LocalDate.of(2021, 2, 3), 250000, 
            15, "Nha xuat ban Giao Duc", "MOI");
        Sach sach2 = new SachGiaoKhoa("311362", LocalDate.of(2021, 2, 3), 110000, 
            25, "Nha xuat ban GTVT", "MOI");
        Sach sach3 = new SachGiaoKhoa("165842", LocalDate.of(2021, 2, 3), 134000, 
            40, "Nha xuat ban Tuoi Tre", "CU");

        Sach sach4 = new SachThamKhao("468268", LocalDate.of(2020, 12, 23), 90000, 
            122, "Nha xuat ban Ton Giao", 120000);
        Sach sach5 = new SachThamKhao("784136", LocalDate.of(2019, 5, 11), 220000, 
            78, "Nha xuat ban Giao Duc", 95000);
        Sach sach6 = new SachThamKhao("158427", LocalDate.of(2021, 2, 23), 330000, 
            20, "Nha xuat ban Giao Duc", 50000);

        ArrayList<Sach> listSach = new ArrayList<>();
        listSach.add(sach1);
        listSach.add(sach2);
        listSach.add(sach3);
        listSach.add(sach4);
        listSach.add(sach5);
        listSach.add(sach6);

        Locale local = new Locale("vi", "vn");
        NumberFormat nf = NumberFormat.getInstance(local);
        
        double tempDouble = 0.0;
        System.out.println("Tong thanh tien cho sach giao khoa: ");
        for (Sach sach : listSach)
            if (sach instanceof SachGiaoKhoa) tempDouble += sach.getThanhTien();
        System.out.println(nf.format(tempDouble));

        tempDouble = 0.0;
        System.out.println("Tong thanh tien cho sach tham khao: ");
        for (Sach sach : listSach)
            if (sach instanceof SachThamKhao) tempDouble += sach.getThanhTien();
        System.out.println(nf.format(tempDouble));

        tempDouble = 0.0;
        int tempInt = 0;
        System.out.println("Trung binh cong don gia cua cac sach tham khao: ");
        for (Sach sach : listSach)
            if (sach instanceof SachThamKhao)
            {
                tempInt++;
                tempDouble += sach.getDonGia();
            }
        if (tempInt != 0)
            System.out.println(nf.format(tempDouble / (double) tempInt));

        System.out.println("Nhap nha xuat ban can tim: ");
        String userInput = sc.nextLine();
        System.out.println("Sach giao khoa cua " + userInput + ": ");
        for (Sach sach : listSach)
            if ((sach instanceof SachGiaoKhoa) && (sach.getNhaXuatBan().equals(userInput)))
                System.out.println(sach.getInfo());
        System.out.println("Sach tham khao cua " + userInput + ": ");
        for (Sach sach : listSach)
            if ((sach instanceof SachThamKhao) && (sach.getNhaXuatBan().equals(userInput)))
                System.out.println(sach.getInfo());

        sc.close();
    }
    
}
