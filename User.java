import java.util.Scanner;
import javax.swing.JOptionPane;
// User information
class User{
    protected String Name;
    protected String PName;
    protected String Phone;
    protected String Address;
    private int Pin;

    // Ask user input
    void userinfo(Scanner scan){
        this.Name=JOptionPane.showInputDialog("Enter Your Name");
        this.PName=JOptionPane.showInputDialog("Enter Parent or Gardian or Husband Name");
        this.Phone=JOptionPane.showInputDialog("Enter Phone Number");
        this.Address=JOptionPane.showInputDialog("Enter the Address");

        while(true){
           this.Pin=Integer.parseInt(JOptionPane.showInputDialog("Enter custom Pin Number with 4 digits"));
            
             if (Pin>1000 && Pin<10000){
                JOptionPane.showMessageDialog(null,"Your Pin saved.Keep it safe :["+Pin+"]");
                break;
        }
        JOptionPane.showMessageDialog(null,"Enter a valid Pin Number...");
    } 
}   
        // return pin number
        public int getpin(){
            return Pin;
}
//    User Enter the pin number to check their information.
    void checkinfo(Scanner scan){
        
      while(true){
        int check=Integer.parseInt(JOptionPane.showInputDialog("Enter Pin to Check User Information"));
        if(check==Pin){
        JOptionPane.showMessageDialog(null,"Accepted");
        System.out.println("Your Information");
        System.out.println("Name        :"+Name);
        System.out.println("Gardian Name:"+PName);
        System.out.println("Address     :"+Address);
        System.out.println("Phone Number:"+Phone);
        break;
      }
      JOptionPane.showMessageDialog(null,"@Invalid Pin Number.*|Enter a valid Pin");
    }
  } 
}
