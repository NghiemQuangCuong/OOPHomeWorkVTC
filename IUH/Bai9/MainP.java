public class MainP 
{
    public static void main(String[] args) throws Exception
    {
        CongNhan cn1 = new CongNhan(134632, "Tran", "Sang", 178);
        CongNhan cn2 = new CongNhan(254563, "Nguyen", "Ha", 341);
        CongNhan cn3 = new CongNhan(432685, "Le", "Cuong", 17);
        CongNhan cn4 = new CongNhan(334232, "Ho", "Trang", 233);
        CongNhan cn5 = new CongNhan(685489, "Dinh", "Thuy", 117);
        CongNhan cn6 = new CongNhan(457128, "Vo", "Diem", 457);

        CongNhanList cnList = new CongNhanList(10);
        cnList.add(cn1);
        cnList.add(cn2);
        cnList.add(cn3);
        cnList.add(cn4);
        cnList.add(cn5);
        cnList.add(cn6);

        System.out.println(cnList);
        System.out.println("So Luong Cong Nhan: " + cnList.soLuongCongNhan());
        System.out.println("Cac Cong Nhan co so SP tren 200: ");
        cnList.xuatNhanVienLamTren200SP();
        System.out.println("========SORT=======");
        cnList.sapXepTheoSoSPGiamDan();
        System.out.println(cnList);
    }    
}
