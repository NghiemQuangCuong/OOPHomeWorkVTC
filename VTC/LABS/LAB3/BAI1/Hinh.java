public abstract class Hinh 
{
    private String ten;

    public Hinh(String ten)
    {
        this.ten = (!ten.trim().equals("")) ? ten : "null";
    }

    public abstract double tinhChuVi();
    public abstract double tinhDienTich();

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = (!ten.trim().equals("")) ? ten : this.ten;
    }
    
    public abstract String toString();
    
}
