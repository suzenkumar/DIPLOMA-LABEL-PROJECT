//Design a class to represent a bank account. Include the following 
members :
Data members:
 Name of the depositor
 Account Number
 Type of account
 Balance amount in the account
21
Methods:
 To assign initial values
 To deposit an amount
 To withdraw an amount
 To display the name and balance||Exp-14
class Exp-14
{
    private String name; 
    private long accno;
    private char type;
    private double bal;

    BankAccount()   {
        name = "";
        accno = 0;
        type = '\0';
        bal = 0.0d;
    }
    BankAccount(String n, long accnumber, char t, double b)   {
        name = n;
        accno = accnumber;
        type = t;
        bal = b;
    }

    public void deposit(double amt)   {
        bal = bal + amt;
        System.out.println("Amount deposited: Rs. " + amt);
        System.out.println("Balance: Rs. " + bal);
    }

    public void withdraw(double amt)    {
        if(amt <= bal)  {
            bal = bal - amt;
            System.out.println("Amount withdrawn: Rs. " + amt);
            System.out.println("Balance: Rs. " + bal);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
    
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Balance: Rs. " + bal);
    }
}