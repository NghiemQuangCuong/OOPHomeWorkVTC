public class SavingsAccount extends Account
{
    private double rate;
    private double saveAmount;

    public SavingsAccount(String accID, double balance, double rate, double saveAmount)
    {
        super(accID, balance);
        if (rate > 0.0)
            this.rate = rate;
        else
            this.rate = 0.0;

        if (saveAmount <= balance)
            this.saveAmount = saveAmount;
        else
            this.saveAmount = 0.0;
    }

    public double calculateInterest()
    {
        return saveAmount * rate;
    }

    public void addInterestToBalance()
    {
        balance = getBalance() + saveAmount * rate;
    }

    public void addInterestToAmount()
    {
        saveAmount += saveAmount * rate;
        balance = getBalance() + saveAmount * rate;
    }

    public double getRate()
    {
        return rate;
    }

    public void setRate(double rate)
    {
        if (rate > 0.0)
            this.rate = rate;
        else
            this.rate = 0.0;
    }
}
