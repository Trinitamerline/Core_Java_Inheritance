public class SBAccount extends Account
{
    public SBAccount(int accnumber, double balance) {
        super(accnumber, balance);
        System.out.println("New FD Account is created with Accountnumber:"+accnumber+"& balance:"+balance);
    }

    public void deposit(double amount)
    {
        if(amount >= 0)
        {
            System.out.println("Initial Balance:"+balance);
            balance = balance + amount;
            System.out.println("New Deposited Balance:"+balance);
        }
        else
        {
            System.out.println("Invalid Amount");
        }
    }
    public void withdraw(double amount)
    {
       if(balance-amount > 1000)
       {
           System.out.println("Current Balance:"+balance);
           balance = balance - amount;
           System.out.println("New Withdraw Balance:"+balance);
       }
       else
       {
           System.out.println("Insufficient Balance");
       }
    }
    public void calc_interest()
    {
        System.out.println("Current Balance:"+balance);
        balance = balance + balance * 4 /(12*100);
        System.out.println("New Interest Balance:"+balance);
    }

}
