public class EnglishTranslator implements NumberTranslator
{
    @Override
    public String getString(int number)
    {
        return "Result translating english number to english string";
    }

    @Override
    public int getNumber(String str)
    {
        return 12345;
    }
}
