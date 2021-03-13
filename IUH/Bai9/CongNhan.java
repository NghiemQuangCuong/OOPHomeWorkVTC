public class CongNhan
{
    private int maCN;
    private String mHo;
    private String mTen;
    private int mSoSP;

    public CongNhan()
    {
        maCN = 999999;
        mHo = "chua xac dinh";
        mTen = "chua xac dinh";
        mSoSP = 0;
    }

    public CongNhan(int maCN, String mHo, String mTen, int mSoSP)
    {
        if (maCN > 0)
            this.maCN = maCN;
        else
            this.maCN = 999999;

        if (!mHo.equals(""))
            this.mHo = mHo;
        else
            this.mHo = "chua xac dinh";

        if (!mTen.equals(""))
            this.mTen = mTen;
        else
            this.mTen = "chua xac dinh";

        if (mSoSP > 0)
            this.mSoSP = mSoSP;
        else
            this.mSoSP = 0;
    }

    public int getmaCN()
    {
        return maCN;
    }

    public String getmHo()
    {
        return mHo;
    }

    public String getmTen()
    {
        return mTen;
    }

    public int getmSoSP()
    {
        return mSoSP;
    }

    public void setmaCN(int maCN)
    {
        if (maCN > 0)
            this.maCN = maCN;
    }

    public void setmHo(String mHo)
    {
        if (!mHo.equals(""))
            this.mHo = mHo;
    }

    public void setmTen(String mTen)
    {
        if (!mTen.equals(""))
            this.mTen = mTen;
    }

    public void setmSoSP(int mSoSP)
    {
        if (mSoSP > 0)
            this.mSoSP = mSoSP;
    }

    public double luong()
    {
        float heSo;
        if (mSoSP < 200)
            heSo = 0.5f;
        else if (mSoSP < 400)
            heSo = 0.55f;
        else if (mSoSP < 600)
            heSo = 0.6f;
        else
            heSo = 0.65f;

        return mSoSP * heSo;
    }

    @Override
    public String toString()
    {
        return String.format("%-10d %-10s %-10s %8d %8.2f", maCN, mHo, mTen, mSoSP, luong());
    }
}