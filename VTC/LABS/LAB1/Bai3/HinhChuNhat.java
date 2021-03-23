public class HinhChuNhat 
{
    private Diem diemTraiTren;
    private Diem diemPhaiDuoi;

    public HinhChuNhat(Diem diemTraiTren, Diem diemPhaiDuoi) throws Exception
    {
        if (diemTraiTren.getX() >= diemPhaiDuoi.getX() || diemTraiTren.getY() <= diemPhaiDuoi.getY())
            throw new Exception("Loi: diem trai tren va diem phai duoi khong chinh xac");

        this.diemTraiTren = diemTraiTren;
        this.diemPhaiDuoi = diemPhaiDuoi;
    }
    public Diem getDiemTraiTren() {
        return diemTraiTren;
    }
    public void setDiemTraiTren(Diem diemTraiTren) throws Exception
    {
        if (diemTraiTren.getX() >= diemPhaiDuoi.getX() || diemTraiTren.getY() <= diemPhaiDuoi.getY())
            throw new Exception("Loi: diem trai tren va diem phai duoi khong chinh xac");

        this.diemTraiTren = diemTraiTren;
    }
    public Diem getDiemPhaiDuoi() {
        return diemPhaiDuoi;
    }
    public void setDiemPhaiDuoi(Diem diemPhaiDuoi) throws Exception
    {
        if (diemTraiTren.getX() >= diemPhaiDuoi.getX() || diemTraiTren.getY() <= diemPhaiDuoi.getY())
            throw new Exception("Loi: diem trai tren va diem phai duoi khong chinh xac");
        this.diemPhaiDuoi = diemPhaiDuoi;
    }

    public double dienTich()
    {
        double canh1 = new DoanThang(diemTraiTren, new Diem(diemTraiTren.getX(), diemPhaiDuoi.getY())).doDaiDoanThang();
        double canh2 = new DoanThang(diemTraiTren, new Diem(diemPhaiDuoi.getX(), diemTraiTren.getY())).doDaiDoanThang();
        return canh1*canh2;
    }

    public double chuVi()
    {
        double canh1 = new DoanThang(diemTraiTren, new Diem(diemTraiTren.getX(), diemPhaiDuoi.getY())).doDaiDoanThang();
        double canh2 = new DoanThang(diemTraiTren, new Diem(diemPhaiDuoi.getX(), diemTraiTren.getY())).doDaiDoanThang();
        return (canh1+canh2)*2;
    }

    public void showInfo()
    {
        System.out.println(diemTraiTren.getInfo() + " - " + diemPhaiDuoi.getInfo());
        System.out.println("Dien tich: " + dienTich());
        System.out.println("Chu vi: " + chuVi()); 
    }
}
