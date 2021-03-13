import java.time.LocalDate;

public class HocVien
{
    private String hoTen;
    private LocalDate namSinh;
    private float[] diem = new float[5];

    public HocVien()
    {
        this.hoTen = "Chua xac dinh";
        this.namSinh = null;
    }

    public HocVien(String hoTen, LocalDate namSinh, float[] diem)
    {
        if (!hoTen.equals(""))
            this.hoTen = hoTen;
        else
            this.hoTen = "Chua xac dinh";

        this.namSinh = namSinh;
        if (diem.length == 5)
            for (int i = 0; i < 5; i++)
            {
                if (diem[i] >= 0f && diem[i] <= 10f)
                    this.diem[i] = diem[i];
                else
                    this.diem[i] = 0f;
            }
    }

    public String getHoTen()
    {
        return hoTen;
    }

    public LocalDate getNamSinh()
    {
        return namSinh;
    }

    public float diemTrungBinh()
    {
        float result = 0f;
        for (float i : diem)
        {
            result += i;
        }
        return (result / 5f);
    }

    public String ghiChu()
    {
        boolean aboveFive = true; 
        for (float i : diem)
            if (i < 5f)
                aboveFive = false;

        if (!aboveFive)
            return "Thi Lai";
        else if (diemTrungBinh() <= 7f)
        {
            return "Thi tot nghiep";
        }
        else
        {
            return "lam luan van";
        }
    }
}