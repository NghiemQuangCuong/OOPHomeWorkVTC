import java.util.ArrayList;

public class MainP 
{
    public static void main(String[] args)
    {
        Xe xe1 = new XeDap("Martin", "Martin", "Trang", 9000000);
        Xe xe2 = new XeMay("Future FI 125", "Future", "Do", 28000000);
        Xe xe3 = new XeOToKhach("Xpander", "Mitsubishi", "Den", 375000000, 7);
        Xe xe4 = new XeOToKhach("Civic", "Honda", "Den", 425000000, 4);
        Xe xe5 = new XeOToTai("HINO", "HINO", "Xanh", 400000000);

        ArrayList<Xe> listXe = new ArrayList<>();
        listXe.add(xe1);
        listXe.add(xe2);
        listXe.add(xe3);
        listXe.add(xe4);
        listXe.add(xe5);

        for (Xe xe : listXe)
            System.out.println(xe.getInfo());
    }   
}
