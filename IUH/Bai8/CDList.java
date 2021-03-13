import java.util.ArrayList;

public class CDList 
{
    private ArrayList<CD> cDList = new ArrayList<>();
    private int maxSize;

    private boolean trungMaCD(CD cD)
    {
        for (int i = 0; i < cDList.size(); i++)
        {
            if (cD.getMaCD() == cDList.get(i).getMaCD())
                return true;
        }
        return false;
    }

    public CDList(int n) throws Exception
    {
        if (n > 0)
        {
            cDList.ensureCapacity(n);
            maxSize = n;
        }
        else throw new Exception("Loi: Gia Tri Khoi Dau Khong Hop Le (n <= 0)");
        
    }

    public boolean add(CD cD)
    {
        if ((cDList.size() == maxSize) || trungMaCD(cD))
            return false;
        else
        {
            cDList.add(cD);
            return true;
        }
    }

    public int soLuongCD()
    {
        return cDList.size();
    }

    public double tongGiaThanh()
    {
        double result = 0.0;
        for (int i = 0; i < cDList.size(); i++)
        {
            result += cDList.get(i).getGiaThanh();
        }

        return result;
    }

    @Override
    public String toString()
    {
        String result = "";
        for (int i = 0; i < cDList.size(); i++)
        {
            result += cDList.get(i).toString() + "\n";
        }
        return result;
    }

    public void sapXepGiamTheoGiaThanh()
    {
        cDList.sort((s1, s2) -> 
        {
            if (s1.getGiaThanh() > s2.getGiaThanh())
                return -1;
            else
                return 1;
        });
    }

    public void sapXepTangTheoTuaCD()
    {
        cDList.sort((s1, s2) -> 
        {
            return s1.getTuaCD().compareTo(s2.getTuaCD());
        });
    }
    
}
