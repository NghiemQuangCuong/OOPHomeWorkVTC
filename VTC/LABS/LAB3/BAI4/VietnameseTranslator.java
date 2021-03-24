public class VietnameseTranslator implements NumberTranslator
{
    @Override
    public String getString(int number)
    {
        return "Result translating VietNam number to VietNam string";
    }

    @Override
    public int getNumber(String str)
    {
        return 54321;
    }
}
