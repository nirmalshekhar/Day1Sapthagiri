package Day4;

public class BankAccount {
    private String AccNo;
    private double bal;
    private int pin;
    private int WrongAttempt;
    private boolean locked;
    public BankAccount(String AccNo,int pin,double initbal){
        this.AccNo=AccNo;
        this.pin=pin;
        this.bal=initbal;
        this.WrongAttempt=0;
        this.locked=false;
    }
    public void deposit(double amount){
        if(!locked && amount>0)
        {
            bal+=amount;
            System.out.println("Deposited :"+amount);
        }
        else{
            System.out.println("Deposit failed");
        }
    }
    public void withdraw(double amount,int enteredpin){
        if(locked){
            System.out.println("Account is locked");
            return;
        }
        if(enteredpin !=pin){
            WrongAttempt++;
            System.out.println("Wrong PIN");
            if(WrongAttempt>=3){
                locked=true;
                System.out.println("Account Locked");
            }
            return;
        }
        WrongAttempt=0;
        if(amount>0 && amount<=25000 && amount<=bal)
        {
            bal-=amount;
            System.out.println("Withdrawl"+amount);
        }
        else{
            System.out.println("Withdrawl failed");
        }
    }
    public double getBalance(int enteredPin){
        if(!locked && enteredPin==pin){
            return bal;
        }
        System.out.println("Access denied");
        return -1;
    }
    public boolean isAccountLocked(){
        return locked;
    }
    public static void main(String[] args) {
        BankAccount acc=new BankAccount("35074589",1234,50000);
        acc.deposit(5000);
        acc.withdraw(25000,1111);
        acc.withdraw(25000,1111);
        acc.withdraw(25000,1111);
        acc.withdraw(25000,1111);
        System.out.println("Balance"+acc.getBalance(1111));
    }
}
