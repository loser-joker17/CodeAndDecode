// implement the deposit and withdraw with encapsulation

class Account{
    public double balance;
    public int accountNumber;

    Account(int accountNumber,double initialBalance)
    {
        this.accountNumber=accountNumber;
        if(initialBalance > 0)
            this.balance=initialBalance;
        else
            this.balance=0;
    }

    int getAccountNumber(int accountNumber)
    {
        return accountNumber;
    }
    double getMoney(double amount)
    {
        return amount;
    }

    void deposit(int accountNumber,int amount )
    {
         balance+=amount;
         System.out.println("Current Balance is : " + balance);
    }

    void withdraw(int accountNumber, int amount)
    {
        balance-=amount;
        if(balance >0) {
            System.out.println("Remaining balance is : " + balance);
            System.out.println("Amount is : " + amount);
        }
        else
        {
            System.out.println("Insufficient Balance ");
        }
    }
}



public class Main {
    public static void main(String args[]) {
          Account account= new Account(12345678, 100);

          account.deposit(12345678, 11000);
          System.out.println("Account number is : " + account.accountNumber+" Account balance is : " + account.balance);

          account.withdraw(12345678, 10100);
          System.out.println("Account number is " + account.accountNumber+ " Account balance is : " + account.balance);
    }
}