import java.util.ArrayList;

public class CongNhanList 
{
    private ArrayList<CongNhan> list = new ArrayList<>();
    private int maxSize;

    public CongNhanList(int n) throws Exception
    {
        if (n > 0)
        {
            maxSize = n;
            list.ensureCapacity(n);
        }
        else throw new Exception("Loi: so luong phan tu khoi dau khong hop le");
    }
    
    public boolean add(CongNhan cn)
    {
        if (list.size() == maxSize)
            return false;
        else
        {
            list.add(cn);
            return true;
        }
    }

    public int soLuongCongNhan()
    {
        return list.size();
    }

    @Override
    public String toString()
    {
        String result = "";
        for (CongNhan cn : list)
        {
            result += cn.toString() + "\n";
        }
        return result;
    }

    public void xuatNhanVienLamTren200SP()
    {
        for (CongNhan cn : list)
        {
            if (cn.getmSoSP() > 200)
                System.out.println(cn);
        }
    }

    public void sapXepTheoSoSPGiamDan()
    {
        list.sort((s1, s2) -> 
        {
            if (s1.getmSoSP() < s2.getmSoSP())
                return -1;
            else
                return 1;
        });
    }
}
