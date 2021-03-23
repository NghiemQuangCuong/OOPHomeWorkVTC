public class MainP 
{
    public static void main(String[] args) 
    {
        DoanThang dt1 = new DoanThang(0, 0, 2, 2);
        DoanThang dt2 = new DoanThang(new Diem(2, 0), new Diem(0, -2));

        dt1.showDoanThang();
        dt2.showDoanThang();

        System.out.println(dt1.doDaiDoanThang()); 
        System.out.println(dt2.doDaiDoanThang());

        if (dt1.songSong(dt2))
            System.out.println("Song song");
        else
            System.out.println("Khong song song");
    }
}
