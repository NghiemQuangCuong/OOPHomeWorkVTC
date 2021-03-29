import java.util.Map.Entry;

public class Pair<T1, T2> implements Entry<T1, T2>
{
    private T1 a;
    private T2 b;

    public Pair(T1 a, T2 b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public T1 getKey() {
        return (a != null) ? a : null; 
    }

    @Override
    public T2 getValue() {
        return (b != null) ? b : null;
    }

    @Override
    public T2 setValue(Object value) {
        return null;
    }

    public void setKey(T1 a)
    {
        this.a = a;
    }

    public void SetValue(T2 b)
    {
        this.b = b;
    }

}
