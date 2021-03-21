import java.util.HashMap;

public class StringHandling 
{
    private static HashMap<String, Integer> charOfStrings = new HashMap<>();

    public static int countChar(String string)
    {
        if (charOfStrings.containsKey(string))
            return charOfStrings.get(string);
        else
            {
                charOfStrings.put(string, string.length());
                return string.length();
            }
    }
}
