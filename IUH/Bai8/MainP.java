public class MainP 
{

    public static void main(String[] args)
    {
        CD cd1 = new CD(35356, "ACAAA", 12, 350000);
        CD cd2 = new CD(24561, "BAABA", 15, 400000);
        CD cd3 = new CD(32156, "AGASA", 13, 250000);
        CD cd4 = new CD(32112, "TAAA", 8, 150000);
        CD cd5 = new CD(53642, "AAAA", 10, 750000);
        CD cd6 = new CD(77532, "AAADSAA", 9, 1000000);

        try
        {
            CDList list = new CDList(6);
            list.add(cd1);
            list.add(cd2);
            list.add(cd3);
            list.add(cd4);
            list.add(cd5);
            list.add(cd6);

            System.out.println(list.toString());
            System.out.println("So Luong CD: " + list.soLuongCD());
            System.out.println("Tong Gia Thanh: " + list.tongGiaThanh());
            System.out.println("=====================");
            list.sapXepGiamTheoGiaThanh();
            System.out.println(list.toString());
            list.sapXepTangTheoTuaCD();
            System.out.println(list.toString());
        }
        catch (Exception ex)
        {
            System.err.println(ex.getMessage());
        }
    }
}
