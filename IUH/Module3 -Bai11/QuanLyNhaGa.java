import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;
import java.util.Map.Entry;

public class QuanLyNhaGa 
{
    private final String FILE_NAME = "danhsach.txt";
    private Queue<KhachHang> listKhachHangCho;
    private ArrayList<KhachHang> listKhachHangDaMuaVe;
    private HashMap<String, ArrayList<KhachHang>> listNoiDen;

    public QuanLyNhaGa() throws IOException
    {
        FileInputStream file = null;
        try 
        {
            file = new FileInputStream(FILE_NAME);    
        } 
        catch (FileNotFoundException ex)
        {
            System.out.println("Khong tim thay file!");
        }
        catch (Exception ex) 
        {
            System.out.println(ex.getMessage());
        }
        
        Scanner sc = new Scanner(file);
        listKhachHangCho = new ArrayDeque<>();
        listKhachHangDaMuaVe = new ArrayList<>();
        listNoiDen = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++)
        {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String place = sc.nextLine();
            double price = Double.parseDouble(sc.nextLine());
            KhachHang kh = new KhachHang(id, name, place, price);
            listKhachHangCho.add(kh);
            if (!listNoiDen.containsKey(place))
            {
                ArrayList<KhachHang> list = new ArrayList<>();
                list.add(kh);
                listNoiDen.put(place, list);
            }
            else
            {
                listNoiDen.get(place).add(kh);
            }
        }

        file.close();
    }

    public void themKhachHangVaoHangDoi()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Them khach hang vao hang doi mua ve =====");
        System.out.println("Nhap CMND khach hang: ");
        String id = sc.nextLine();
        System.out.println("Nhap ho ten khach hang: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap noi den trong danh sach noi den duoi day: ");
        for (Entry<String, ArrayList<KhachHang>> entry : listNoiDen.entrySet())
        {
            System.out.println(entry.getKey());
        }
        System.out.print("> ");
        String place = sc.nextLine();
        System.out.println("Nhap gia ve: ");
        double price = Double.parseDouble(sc.nextLine());
        if (!listNoiDen.containsKey(place))
        {
            System.out.println("Noi den ban nhap khong nam trong danh sach!");
            System.out.println("Nhan enter de ket thuc");
            sc.nextLine();
            return;
        }

        KhachHang khMoi = new KhachHang(id, hoTen, place, price);
        for (KhachHang kh : listKhachHangCho)
            if (kh.equals(khMoi))
            {
                System.out.println("Khach hang ban nhap da co trong danh sach cho, ban co muon cap nhat thong tin vua nhap? Y/N");
                String input = sc.nextLine();
                if (input.equals("Y") || input.equals("y"))
                {
                    kh.capNhat(hoTen, place, price);
                    System.out.println("Da cap nhat thong tin khach hang, nhan enter de quay lai");
                    sc.nextLine();
                }
                return;
            }

        listKhachHangCho.add(khMoi);
        listNoiDen.get(place).add(khMoi);
        System.out.println("Da them khach hang vao hang cho, nhan enter de ket thuc");
        sc.nextLine();
    }

    public void banVeChoKhach()
    {
        Scanner sc = new Scanner(System.in);
        if (!listKhachHangCho.isEmpty())
        {
            KhachHang kh = listKhachHangCho.poll();
            listKhachHangDaMuaVe.add(kh);
            listNoiDen.get(kh.getGaDen()).remove(kh);
            System.out.println("Da ban ve cho khach: ");
            System.out.println(kh.getInfo());
            System.out.println("Nhan enter de ket thuc");
        }
        else
        {
            System.out.println("Danh sach cho rong!");
            System.out.println("Nhan enter de ket thuc!");
        }
        sc.nextLine();
    }

    public void hienThiDanhSachKhachHangCho()
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Danh sach khach hang cho: ");
        for (KhachHang kh : listKhachHangCho)
        {
            count++;
            System.out.print(count + " " + kh.getInfo() + "\n");
        }
        System.out.println("Nhan enter de ket thuc");
        sc.nextLine();
    }

    public void huyKhachHangRaKhoiDanhSach(String id)
    {
        Scanner sc = new Scanner(System.in);
        for (KhachHang kh : listKhachHangCho)
            if (kh.getID().equals(id))
            {
                System.out.println("Da tim thay KH: ");
                System.out.println(kh.getInfo());
                System.out.print("Ban co chac muon huy khach hang nay? Y/N  ");
                String input = sc.nextLine();
                if (input.equals("Y") || input.equals("y"))
                {
                    listKhachHangCho.remove(kh);
                    listNoiDen.get(kh.getGaDen()).remove(kh);
                    System.out.println("Da xoa khach hang ra khoi danh sach!");
                }
                System.out.println("Nhan enter de ket thuc");
                sc.nextLine();
                return;
            }

        System.out.println("Khong tim thay id cua khach hang can xoa, nhan enter de ket thuc");
        sc.nextLine();
    }
    
    public void thongKeTinhHinh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("So luong khach hang dang cho mua ve: " + listKhachHangCho.size());
        System.out.println("So luong ve da ban ra: " + listKhachHangDaMuaVe.size());
        double tienThuVe = 0.0;
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        for (KhachHang kh : listKhachHangDaMuaVe)
            tienThuVe += kh.getGiaTien();
        System.out.println("Tien da thu ve: " + df.format(tienThuVe));
        System.out.println("Nhan enter de ket thuc!");
        sc.nextLine();
    }

    public void luuDanhSachVaoFile() throws IOException
    {
        Scanner sc = new Scanner(System.in);
        FileWriter file = new FileWriter(FILE_NAME);
        file.write(listKhachHangCho.size() + "\n");
        for (KhachHang kh : listKhachHangCho)
        {
            file.write(kh.getID() + "\n");
            file.write(kh.getHoTen() + "\n");
            file.write(kh.getGaDen() + "\n");
            file.write(kh.getGiaTien() + "\n");
        }

        file.close();
        System.out.println("Da luu danh sach thanh cong, nhan enter de ket thuc");
        sc.nextLine();
    }

    public void hienThiDanhSachCacGaDangChoMuaVeVaSoVeTuongUng()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Danh sach cac ga dang cho mua ve: ");
        for (Entry<String, ArrayList<KhachHang>> entry : listNoiDen.entrySet())
        {
            if (entry.getValue().size() > 0)
                System.out.println(entry.getKey() + ", so ve dang cho: " + entry.getValue().size());
        } 
        System.out.println("Nhan enter de ket thuc");
        sc.nextLine();
    }
}
