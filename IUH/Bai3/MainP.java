public class MainP 
{
    public static void main(String[] args)
    {
        TamGiac tamGiac1 = new TamGiac(1, 4, 1);
        TamGiac tamGiac2 = new TamGiac(-3, 5, 1);
        TamGiac tamGiac3 = new TamGiac(2, 3, 4);
        TamGiac tamGiac4 = new TamGiac(4, 4, 3);
        TamGiac tamGiac5 = new TamGiac(7, 7, 7);

        System.out.printf("%-10s %-10s %-10s %-20s %-10s %-10s\n", "CanhA", "CanhB", "CanhC", "Kieu Tam Giac", "CV", "DT");
        System.out.println(tamGiac1.toString());
        System.out.println(tamGiac2.toString());
        System.out.println(tamGiac3.toString());
        System.out.println(tamGiac4.toString());
        System.out.println(tamGiac5.toString());
    }
}
