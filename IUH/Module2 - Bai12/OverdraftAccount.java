public class OverdraftAccount extends Account
{
    private double odLimit = -2000000;

    public OverdraftAccount(String accID, double balance)
    {
        super(accID, balance);
    }

    @Override
    public boolean withdraw(double amount)
    {
        if (amount > 0 && getBalance() - amount >= odLimit)
        {
            balance = getBalance() - amount;
            return true;
        }
        return false;
    }

    public double getODLimit()
    {
        return odLimit;
    }

    public void setODLimit(double limit)
    {
        odLimit = limit;
    }
}
