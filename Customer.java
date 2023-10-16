import java.util.Scanner;

public class Customer
{
    private int cust_id;
    private String name;
    private String address;
    SBAccount sb;
    FDAccount fd;
    private static int sbno = 158960;
    private static int fdno = 136470;

    Scanner scanner = new Scanner(System.in);
    public Customer(int cust_id, String name, String address) {
        this.cust_id = cust_id;
        this.name = name;
        this.address = address;
    }
    public void createAccount(int type)
    {
        if(type == 1)
        {
            System.out.println("Enter initial balance to create new SB Account:");
            double bal = scanner.nextDouble();
            sb = new SBAccount(sbno++,bal);
        }
        else if(type == 2)
        {
            System.out.println("Enter initial balance & period to create new FD Account:");
            double bal = scanner.nextDouble();
            int period = scanner.nextInt();
            fd = new FDAccount(fdno++,bal,period);
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
    public void transaction(int type)
    {
        if(type == 1)
        {
            System.out.println("Enter amount to deposit in  SB Account:");
            double bal = scanner.nextDouble();
            sb.deposit(bal);
        }
        else if(type == 2)
        {
            System.out.println("Enter amount to withdraw in  SB Account:");
            double bal = scanner.nextDouble();
            sb.withdraw(bal);
        }
        else if(type == 3)
        {
            sb.calc_interest();
        }
        else if(type == 4)
        {
            fd.close();
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}
