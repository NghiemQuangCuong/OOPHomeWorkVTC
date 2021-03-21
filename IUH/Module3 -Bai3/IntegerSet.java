import java.util.TreeSet;

public class IntegerSet 
{
    private TreeSet<Integer> set = new TreeSet<>();

    public void add(int... value)
    {
        for (int i = 0; i < value.length; i++)
            set.add(value[i]);
    }

    public void init(TreeSet<Integer> set)
    {
        this.set = set;
    }

    public TreeSet<Integer> getSet()
    {
        return set;
    }

    public void printElements()
    {
        for (int i : set)
            System.out.print(i + " ");
        System.out.println();
    }

    public IntegerSet addAll(IntegerSet _set)
    {
        TreeSet<Integer> treeSet = (TreeSet<Integer>) set.clone();
        for (int x : _set.getSet())
        {
            treeSet.add(x);
        }
        IntegerSet result = new IntegerSet();
        result.init(treeSet);
        return result;
    }

    public IntegerSet removeAll(IntegerSet _set)
    {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int x : this.set)
        {
            if (!_set.getSet().contains(x))
                treeSet.add(x);
        }
        IntegerSet result = new IntegerSet();
        result.init(treeSet);
        return result;
    }

    public IntegerSet retainAll(IntegerSet _set)
    {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int x : this.set)
        {
            if (_set.getSet().contains(x))
                treeSet.add(x);
        }
        IntegerSet result = new IntegerSet();
        result.init(treeSet);
        return result;
    }
}