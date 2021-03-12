import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainP {
    
    public static void main(String[] args)
    {
        Product product1 = new Product("Nuoc tuong", "sp4", 8000);
        Product product2 = new Product("Gao", "sp1", 18000);
        Product product3 = new Product("Duong", "sp3", 10000);

        Order order = new Order(1, LocalDate.of(2021, 3, 12));
        order.addLineItem(product1, 10);
        order.addLineItem(product2, 5);
        order.addLineItem(product3, 1);
        order.addLineItem(product2, 1);



        System.out.println(order);

        // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // LocalDate day = LocalDate.of(2021, 3, 12);

        // System.out.println(day.format(dtf));
        
    }
}
