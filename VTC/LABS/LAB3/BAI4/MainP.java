public class MainP 
{
    public static void main(String[] args)
    {
        EnglishTranslator et = new EnglishTranslator();
        VietnameseTranslator vt = new VietnameseTranslator();

        System.out.println(et.getNumber("ABC"));
        System.out.println(et.getString(3546));
        System.out.println(vt.getNumber("DEF"));
        System.out.println(vt.getString(5867));
    }
    
}
