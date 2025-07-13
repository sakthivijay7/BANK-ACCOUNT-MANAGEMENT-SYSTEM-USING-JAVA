# BANK-ACCOUNT-MANAGEMENT-SYSTEM-USING-JAVA
Bank account management system to design with java.
Java files:
1.Bank.java Main File-It contains bank details and mysql database connection and insert operations.
2.User.java -It contails users details input Name,GardianName,Phone,Address,Pin.
3.Transation.java -It contails transaction details like Deposit Amount with date and Withdraw Amount with date.

User file:
1.User class had checkinfo() and userinfo() function.
2.userinfo() function details had user Name,GardianName,Phone,Address,Pin.
3.Set while loop to continuoslly ask 4 digits custom PIN by User,if set break the loop else continue.
4.PIN was private so getpin() function to return pin than access the pin.
4.checkinfo() function details had ask PIN by User if entered correct PIN provide their filled information of Name,GardianName,Phone,Address else invalid PIN.

Transaction file:
1.Transaction class had deposit() and withdraw() function
2.Initial class had balance=0.
3.deposit() function details had ask deposit amount and date by user if enter their Amount to add Balance(Balance+DepositAmount).
4.withdraw() function details had ask withdraw amount and date by user if enter theri Amount to minus their Balance(Balance-WithdrawAmount) if not balance print Invalid Balance.

Main file:
1.Main file ,class Bank to create an object to access the other two files like object1=User and object2=Transaction
2.Now the main file access the two files,the User class functions like call userinfo() to ask user input details and checkinfo() to the filled information provide.
3.Insert user information to mysql database.
4.class Transaction deposit() function to ask deposit amount with date,if entered Amount that data insert through mysql DepositDetail table.
5.withdraw() function to ask withdraw amount with date,if entered their Amount that data insert through mysql WithdrawDetail table.

GUI:
JOptionPane used to user friendly GUI with 2 lines.
1.JOptionPane.showInputDialog(" ") 
2.JOptionPane.showMessageDialog(" ")
used input dialog to ask all input formats,same as message dialog popup with messages.

INPUT GUI:
<img width="304" height="139" alt="INPUT" src="https://github.com/user-attachments/assets/eeefd078-8232-49ff-8bbc-17a5ae5a8d4e" />

INVALID MESSAGE:
<img width="297" height="132" alt="INVALID" src="https://github.com/user-attachments/assets/a0abc86f-b57e-43db-a35f-8a0079c1dc03" />

RESULT:
At the end ,The Transaction Result in the termial:
<img width="406" height="257" alt="transaction details" src="https://github.com/user-attachments/assets/b4f2a85b-f56c-4685-8aa0-e662ae84fefa" />

Tools and Techniques:
1.Vs Code
2.Java 
3.Eclipse
4.MySQL
5.Mysql connection jar file(mysql-connector-j-9.3.0.jar)
