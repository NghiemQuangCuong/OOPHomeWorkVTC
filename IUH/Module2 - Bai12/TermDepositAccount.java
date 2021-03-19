public class TermDepositAccount extends SavingsAccount
{
    private int term;

    public TermDepositAccount(String accID, double balance, double rate, double saveAmount,
        int term)
    {
        super(accID, balance, rate, saveAmount);
        if (term > 0)
            this.term = term;
        else
            this.term = 0;
    }

    public int getTerm()
    {
        return term;
    }

    public void setTerm(int term)
    {
        if (term > 0)
            this.term = term;
    }
}