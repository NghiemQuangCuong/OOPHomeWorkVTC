public abstract class Account
{
    protected String accID;
    protected double balance;

    public Account(String accID, double balance)
    {
        this.accID = accID;
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }

    private void setBalance(double value)
    {
        balance = value;
    }

    public boolean withdraw(double amount)
    {
        if (amount > 0 && balance - 50000 >= amount)
        {
            setBalance(balance - amount);
            return true;
        }
        return false;
    }

    public boolean deposit(double amount)
    {
        if (amount > 0)
        {
            setBalance(balance + amount);
            return true;
        }
        return false;
    }
}