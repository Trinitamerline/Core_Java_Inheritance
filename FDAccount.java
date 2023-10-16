public class FDAccount extends Account
{
    private int period;

    public FDAccount(int accnumber, double balance, int period) {
        super(accnumber, balance);
        this.period = period;
        System.out.println("New FD Account is created with Accountnumber:"+accnumber+"& balance:"+balance+"for the period:"+period);
    }
    public double calc_interest()
    {
        return balance*8.25*period/(12*100);
    }
    public void close()
    {
        System.out.println("Current balance:"+balance);
        balance = balance + calc_interest();
        System.out.println("Maturity Amount:"+balance);
    }
}
