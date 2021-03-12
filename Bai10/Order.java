import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private ArrayList<OrderDetail> lineItems = new ArrayList<>();
    private int count;

    public Order(int orderID, LocalDate orderDate)
    {
        if (orderID > 0)
            this.orderID = orderID;
        else
            this.orderID = 999999;

        this.orderDate = orderDate;
    }

    public int getOrderID()
    {
        return orderID;
    }

    public LocalDate getOrderDate()
    {
        return orderDate;
    }

    public ArrayList<OrderDetail> getLineItems()
    {
        return lineItems;
    }

    public void setOrderDate(LocalDate date)
    {
        if (date.isBefore(LocalDate.now()))
            this.orderDate = date;
    }

    public void addLineItem(Product product, int quatity)
    {
        OrderDetail orderDetail = new OrderDetail(quatity, product);
        lineItems.add(orderDetail);
        this.count = lineItems.size();
    }
    
    public double calcTotalCharge()
    {
        double result = 0.0;
        for (OrderDetail od : lineItems)
            result += od.calcTotalPrice();

        return result;
    }

    @Override
    public String toString()
    {
        String result = "";
        int stt = 1;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        result += "Ma HD: " + orderID + "\n" +
            "Ngay Lap Hoa Don: " + orderDate.format(dtf) + "\n" +
            String.format("| %-4s | %-10s | %-30s | %20s | %10s | %24s", "STT", "Ma SP", "Mo ta", "Don Gia", 
            "S Luong", "Thanh Tien") + "\n";

        Locale local = new Locale("vi", "vn");
        NumberFormat nf = NumberFormat.getInstance(local);
        for (OrderDetail od : lineItems)
        {
            Product product = od.getProduct();
            
            result += String.format("| %-4d | %-10s | %-30s | %20s | %10d | %20s VND", stt, product.getProductID(),
                product.getDescription(), nf.format(product.getPrice()), od.getQuatity(), nf.format(od.calcTotalPrice())) + "\n"; 
            stt++;
        }
        result += "Tong tien thanh toan: " + nf.format(calcTotalCharge()) + "VND\n";
        return result;
    }
}
