public class PhanSo
{
    private int tuSo;
    private int mauSo;

    public PhanSo()
    {
        tuSo = 0;
        mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) throws Exception
    {
        this.tuSo = tuSo;
        if (mauSo != 0)
            this.mauSo = mauSo;
        else
            throw new Exception("Loi: mau so bang 0");

        rutGon();
    }

    public static int getUCLN(int a, int b)
    {
        if (a == 0 || b == 0 || a == 1 || b == 1)
            return 1;

        a = (a > 0) ? a : -a;
        b = (b > 0) ? b : -b;

        while (a != b)
        {
            if (a > b)
                a -= b;
            else if (a < b)
                b -= a;
        }

        return a;
    }

    public int getTuSo() 
    {
        return tuSo;
    }

    public void setTuSo(int tuSo) 
    {
        this.tuSo = tuSo;
    }

    public int getMauSo() 
    {
        return mauSo;
    }

    public void setMauSo(int mauSo) throws Exception 
    {
        if (mauSo != 0)
            this.mauSo = mauSo;
        else
            throw new Exception("Loi: mau so bang 0");
    }

    public void rutGon()
    {
        int ucln = PhanSo.getUCLN(tuSo, mauSo);
        tuSo = tuSo / ucln;
        mauSo = mauSo / ucln;
    }

    public PhanSo cong(PhanSo ps) throws Exception
    {
        int newTuSo = tuSo * ps.getMauSo() + ps.getTuSo() * mauSo;
        int newMauSo = mauSo * ps.getMauSo();
        return new PhanSo(newTuSo, newMauSo);
    }

    public PhanSo tru(PhanSo ps) throws Exception
    {
        int newTuSo = tuSo * ps.getMauSo() - ps.getTuSo() * mauSo;
        int newMauSo = mauSo * ps.getMauSo();
        return new PhanSo(newTuSo, newMauSo);
    }

    public PhanSo nhan(PhanSo ps) throws Exception
    {
        int newTuSo = tuSo * ps.getTuSo();
        int newMauSo = mauSo * ps.getMauSo();
        return new PhanSo(newTuSo, newMauSo);
    }

    public PhanSo chia(PhanSo ps) throws Exception
    {
        return this.nhan(new PhanSo(ps.getMauSo(), ps.getTuSo()));
    }

    /**
     * 
     * @param ps
     * @return -1 if this smaller than ps, 1 if this bigger than ps, 0 if this equals to ps
     */
    public int compareTo(PhanSo ps)
    {
        double a = (double)tuSo / (double)mauSo;
        double b = (double)ps.getTuSo() / (double)ps.getMauSo();
        if (a > b)
            return 1;
        else if (a < b)
            return -1;
        else
            return 0;
    }

    public double getValue()
    {
        return (double)tuSo / (double)mauSo;
    }

    @Override
    public String toString()
    {
        return tuSo + "/" + mauSo;
    }
}