package Encapsulation;

public class BankAccount {
private String accountNumber;
private double balance;


public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
}
public String getAccountNumber(){
    return this.accountNumber;
}

public void deposit(double balance){
    this.balance += balance;
}
public void withdraw(double balance){
    if(balance>0 && balance<this.balance){
        this.balance -= balance;
    }else{
        System.out.println("Insufficient balance");
    }
}
public double getBalance(){
    return this.balance;
}

}

class Main{
    public static void main(String[] args) {
        BankAccount mahesh = new BankAccount();
        mahesh.setAccountNumber("8431492459");
        mahesh.deposit(1000.00);
        mahesh.withdraw(500.00);
        mahesh.withdraw(500.00);
        System.out.println(mahesh.getBalance());

    }
}
