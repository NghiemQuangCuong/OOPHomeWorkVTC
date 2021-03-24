public class MainP 
{
    public static void main(String[] args) throws Exception
    {
        Circle h1 = new Circle("A", 5.5);
        Ellipse h2 = new Ellipse("B", 7.64, 5.73);
        HinhChuNhat h3 = new HinhChuNhat("C", 12, 3);
        HinhVuong h4 = new HinhVuong("D", 5.7);
        TamGiac h5 = new TamGiac("E", 5.6, 7.8, 6.5);
        TamGiacCan h6 = new TamGiacCan("F", 7.5, 6);
        TamGiacDeu h7 = new TamGiacDeu("G", 4.5);

        QLHinh list = new QLHinh();
        list.themHinh(h1);
        list.themHinh(h2);
        list.themHinh(h3);
        list.themHinh(h4);
        list.themHinh(h5);
        list.themHinh(h6);
        list.themHinh(h7);

        list.sapXepChuViGiamDan();
        list.showAllInfo();
        System.out.println("-------------------");
        list.sapXepDienTichTangDan();
        list.showAllInfo();
        System.out.println("-------------------");
        list.xoaHinh("B");
        list.showAllInfo();
        System.out.println("-------------------");
        list.showHinhChuNhat();
        System.out.println("-------------------");
        list.showHinhCircle();
        System.out.println("-------------------");
        list.showHinhTamGiacCan();
    }
    
}
