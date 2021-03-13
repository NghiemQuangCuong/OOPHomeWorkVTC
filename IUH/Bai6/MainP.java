public class MainP 
{
    public static void main(String[] args)
    {
        Account acc1 = new Account(72354, "Ted Murphy", 2000000.0);
        Account acc2 = new Account(69713, "Jane Smith", 5000.0);
        Account acc3 = new Account(93757, "Edward Demsy", 10000000.0);
        
        acc1.deposit(400000.0);
        acc2.deposit(3000000.0);
        acc3.withdraw(4500000, 9000);
        acc3.addInterest();
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        System.out.println("==================================================================================");
        acc3.transfer(acc2, 2000000);
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
    }    
}
