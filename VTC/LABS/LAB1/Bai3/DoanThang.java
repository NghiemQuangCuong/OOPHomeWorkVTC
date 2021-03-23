public class DoanThang 
{
    private Diem diem1;
    private Diem diem2;
    
    public DoanThang(double xa, double ya, double xb, double yb)
    {
        diem1 = new Diem(xa, ya);
        diem2 = new Diem(xb, yb);
    }

    public DoanThang(Diem diem1, Diem diem2)
    {
        this.diem1 = (diem1 != null) ? diem1 : new Diem(0, 0);
        this.diem2 = (diem2 != null) ? diem2 : new Diem(0, 0);
    }

    public Diem getDiem1()
    {
        return diem1;
    }
    public Diem getDiem2()
    {
        return diem2;
    }
    public void setDiem1(Diem diem1)
    {
        this.diem1 = (diem1 != null) ? diem1 : this.diem1;
    }
    public void setDiem2(Diem diem2)
    {
        this.diem2 = (diem2 != null) ? diem2 : this.diem2;
    }

    public void showDoanThang()
    {
        System.out.println("[(" + diem1.getX() + ", " + diem1.getY() + "), (" + diem2.getX() + ", " + diem2.getY() + ")]");
    }

    public double doDaiDoanThang()
    {
        return diem1.khoangCach(diem2);
    }

    public Diem getTrungDiem()
    {
        return new Diem( (diem1.getX() + diem2.getX())/2.0 , (diem1.getY() + diem2.getY())/2.0 );
    }

    public boolean songSong(DoanThang dt)
    {
        String s1 = String.format("%.5f", Math.abs((diem1.getX() - diem2.getX() / (diem1.getY() - diem2.getY()))));
        String s2 = String.format("%.5f", Math.abs( (dt.getDiem1().getX() - dt.getDiem2().getX()) / (dt.getDiem1().getY() - dt.getDiem2().getY())));
        return s1.equals(s2) ? true : false;
    }
}
