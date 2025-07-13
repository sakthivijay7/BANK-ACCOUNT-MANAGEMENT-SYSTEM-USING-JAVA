import java.util.Scanner;
import javax.swing.JOptionPane;

class Transaction{
    double balance;   //initial balance
    String owner;
    Transaction(String owner){
        this.balance=0;
        this.owner=owner;
    }
    // deposit an amount
    void deposit(double amount,String date1){
        if (amount>100) {
            balance+=amount;
            System.out.println("Deposit Detail:");
            System.out.println("Date          :"+date1);
            System.out.println("User Name     :"+owner);
            System.out.println("Deposit Amount:"+amount);
            System.out.println("Balance Amount:"+balance);
        }
        else{
            JOptionPane.showMessageDialog(null,"Deposit a valid Amount");
        }
    }
    // withdraw an amount
    void withdraw(double amt,String date2){
        if (amt>0 && balance>amt){
            balance-=amt;
        System.out.println("Withdraw Details");
        System.out.println("Date           :"+date2);
        System.out.println("User Name      :"+owner);
        System.out.println("Withdraw Amount:"+amt);
        System.out.println("Balance Amount :"+balance);
    }else{
        JOptionPane.showMessageDialog(null,"Insufficient Balance"+balance);
    }
  }
}
