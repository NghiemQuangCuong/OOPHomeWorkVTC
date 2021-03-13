public class SinhVien
{
    private int maSinhVien;
    private String hoTen;
    private float diemLT;
    private float diemTH;
    public static int abc = 5;

    public SinhVien()
    {
        maSinhVien = 0;
        hoTen = "NULL";
        diemLT = 0f;
        diemTH = 0f;
    }

    public SinhVien(int maSinhVien, String hoTen, float diemLT, float diemTH)
    {
        if (maSinhVien > 0)
            this.maSinhVien = maSinhVien;
        else
            maSinhVien = 0;

        if (!hoTen.equals(""))
            this.hoTen = hoTen;
        else
            this.hoTen = "NULL";

        if (diemLT >= 0f && diemLT <= 10f)
            this.diemLT = diemLT;
        else 
            this.diemLT = 0f;

        if (diemTH >= 0f && diemTH <= 10f)
            this.diemTH = diemTH;
        else
            this.diemTH = 0f;
    }

    public int getMaSinhVien()
    {
        return maSinhVien;
    }

    public String getHoTen()
    {
        return hoTen;
    }
    
    public float getDiemLT()
    {
        return diemLT;
    }

    public float getDiemTH()
    {
        return diemTH;
    }

    public void setMaSinhVien(int maSinhVien)
    {
        if (maSinhVien > 0)
            this.maSinhVien = maSinhVien;
        else 
            this.maSinhVien = 0;
    }

    public void setHoTen(String hoTen)
    {
        if (!hoTen.equals(""))
            this.hoTen = hoTen;
        else
            this.hoTen = "NULL";
    }

    public void setDiemLT(float diemLT)
    {
        if (diemLT >= 0f && diemLT <= 10f)
            this.diemLT = diemLT;
        else
            this.diemLT = 0f;
    }

    public void setDiemTH(float diemTH)
    {
        if (diemTH >= 0f && diemTH <= 10f)
            this.diemTH = diemTH;
        else    
            this.diemTH = 0f;
    }

    public float getAvarage()
    {
        return (diemLT + diemTH) / 2f;
    }

    @Override
    public String toString()
    {
        return String.format("%-10d %-30s %10.2f   %10.2f   %10.2f", maSinhVien, hoTen, diemLT, diemTH, getAvarage());
    }
    
}