public class MainP 
{
    public static void main(String[] args) 
    {
        IntegerSet set1 = new IntegerSet();
        set1.add(5, 6, 4, 3, 7, 8, 2);
        IntegerSet set2 = new IntegerSet();
        set2.add(6, 8, 7, 9, 10, 11, 12, 1, 2);

        IntegerSet set3 = set1.addAll(set2);
        set3.printElements();
        IntegerSet set4 = set1.removeAll(set2);
        set4.printElements();
        IntegerSet set5 = set1.retainAll(set2);
        set5.printElements();
    }
}
