import java.util.HashSet;

public class DiaChi
{
    private int soNha;
    private String tenDuong;
    private String tenPhuong;
    private String tenTP;
    private HashSet<String> listSDT;

    public DiaChi(int soNha, String tenDuong, String tenPhuong, String tenTP)
    {
        this.soNha = (soNha > 0) ? soNha : 0;
        this.tenDuong = (!tenDuong.trim().equals("")) ? tenDuong : "null";
        this.tenPhuong = (!tenPhuong.trim().equals("")) ? tenPhuong : "null";
        this.tenTP = (!tenTP.trim().equals("")) ? tenTP : "null";
        listSDT = new HashSet<>();
    }

    public void themSDT(String sdt)
    {
        if (!sdt.trim().equals(""))
            listSDT.add(sdt);
    }

    public String getInfo()
    {
        String result = "";
        result += soNha + " duong " + tenDuong + ", phuong " + tenPhuong + ", thanh pho " + tenTP +"\n"
        + "SDT da dang ky: \n";
        for (String std : listSDT)
            result += std + "\n";
        return result + "\n";
    }

    public boolean equals(DiaChi dc)
    {
        return (dc.getSoNha() == soNha && dc.getTenDuong().equals(tenDuong)
            && dc.getTenPhuong().equals(tenPhuong) && dc.getTenTP().equals(tenTP)) ? true : false;
    }

    public int getSoNha() {
        return soNha;
    }

    public String getTenDuong() {
        return tenDuong;
    }

    public String getTenPhuong() {
        return tenPhuong;
    }

    public String getTenTP() {
        return tenTP;
    }
}