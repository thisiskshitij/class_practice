public class BankDemo{
    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount(1001);
        System.out.println("Deposited $1000...");
        c.deposit(1000.0);
    
    try{
        System.out.println("Withdrawing $700...");
        c.withdraw(700);
        System.out.println("Withdrawing $600...");
        c.withdraw(600);
    }
}
catch (InsufficientFundsException e){
    System.out.println("Sorry, short of $"+e.getAmount()+" in the account number "+c.getNumber());
}
}

public class InsufficientFundsException extends Exception {
    private double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}


class CheckingAccount{
    private double balance;
    private int accountNumber;
    public CheckingAccount(int number){
        accountNumber = number;
    }

    public void deposit(double amount){
        balance +=amount ; 
    }
    public void withdraw(double amount) throws InsufficientFundsException{
        if(balance > amount){
            balance-=amount;
        }
        else{
            throw new InsufficientFundsException(amount-balance);
        }
    }
    public double getBalance(){
        return balance;
    }
}