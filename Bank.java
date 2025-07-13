import java.sql.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

        //  Bank details
class BankDetail{
    String branch="Perumbalai";
    String branchaddress="Perumbalai,Dharmapuri,TamilNadu,India";
    String Email="perumbalai@universalbank.com";
    String bankphone="04123-654321";
    String IFSC="UNIVERSAL07";
}
      // MySQL DataBase connection
public class Bank{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        User u=new User();
        Bank b=new Bank();
        BankDetail detail=new BankDetail();
        u.userinfo(scan);
        u.checkinfo(scan);

        String dbname="UniversalBank";
        String url="jdbc:mysql://localhost:3306/"+dbname;
        String dbuser="root";
        String password="sakthi7";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,dbuser,password);
            System.out.println("Connected.");
            Statement stm=conn.createStatement();

            // user information insertion
            String query="Insert into user(Name,GardianName,Phone,Address,Pin) values('"+u.Name+"','"+u.PName+"','"+u.Phone+"','"+u.Address+"','"+u.getpin()+"')";
            int data=stm.executeUpdate(query);

            // Transactions
           String n=JOptionPane.showInputDialog("Enter an User Name");
           Transaction t=new Transaction(n);
        
            //Amount of deposit
           double d=Double.parseDouble(JOptionPane.showInputDialog("Enter a Deposit Amount"));
           String dpdate=JOptionPane.showInputDialog("Enter Deposit Date");
           t.deposit(d,dpdate);
            
            // Insert information in mysql
           String query1="Insert into DepositDetail(Deposit,DepositDate) values("+d+",'"+dpdate+"')";
           int data1=stm.executeUpdate(query1);
           JOptionPane.showMessageDialog(null,"Amount Credited: Rs."+d);
            
             //withdraw amount
           int type=Integer.parseInt(JOptionPane.showInputDialog("Type: 1 to  Withdraw or Pin to BalanceChcek"));
           if (type==1){
           Double w=Double.parseDouble(JOptionPane.showInputDialog("Enter a Withdraw Amount"));
           String wddate=JOptionPane.showInputDialog("Enter Withdraw Date");

           while(true){
             int key=Integer.parseInt(JOptionPane.showInputDialog("Enter Your PIN"));
             if (key==u.getpin()){ 
             JOptionPane.showMessageDialog(null,"PIN Accepted.");
             break;
    } 
              JOptionPane.showMessageDialog(null,"@Invalid Pin* | Enter correct Pin");
}          
            //    insert withdraw information in mysql
           String query2="Insert into WithdrawDetail(Withdraw,WithdrawDate) values("+w+",'"+wddate+"')";
           int data2=stm.executeUpdate(query2);
           JOptionPane.showMessageDialog(null,"Amount Debited: Rs."+w);

           t.withdraw(w,wddate);
           scan.close();
           conn.close();
        } 
        if (type==u.getpin()){
            System.out.println("User Information");
            System.out.println("Name          : "+u.Name);
            System.out.println("Phone         : "+u.Phone);
            System.out.println("Balance       : "+t.balance);
            System.out.println("Branch Name   : "+detail.branch);
            System.out.println("Branch Address: "+detail.branchaddress);
            System.out.println("Bank PhoneNo  : "+detail.bankphone);
         }
       }catch(Exception e){
        System.out.println("Error in connection"+e);
       }
    }
}

