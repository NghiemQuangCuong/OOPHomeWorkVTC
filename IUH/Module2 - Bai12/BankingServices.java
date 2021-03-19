public class BankingServices
{
    public static void main(String[] args)
    {
        OverdraftAccount acc1 = new OverdraftAccount("44421232314", 50000000);
        OverdraftAccount acc2 = new OverdraftAccount("32415364731", 120000000);
        SavingsAccount acc3 = new SavingsAccount("23151351232", 25000000, 0.035, 15000000);
        TermDepositAccount acc4 = new TermDepositAccount("214512343", 10000000, 0.035, 10000000, 12);
        
        acc1.withdraw(51000000);
        acc2.setODLimit(5000000);
        acc3.addInterestToAmount();
        acc3.addInterestToBalance();
        acc4.setRate(0.2);
        acc4.deposit(20000000);
        acc4.addInterestToAmount();
        
        System.out.println("AAA");
    }
}