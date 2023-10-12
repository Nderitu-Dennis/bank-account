
import javax.swing.JOptionPane;

public abstract class Account {

    protected String accHolder;
    protected int accNumber;
    protected float balance;

    public Account(){
        accHolder=JOptionPane.showInputDialog("enter account holder's name: ");
        accNumber=Integer.parseInt(JOptionPane.showInputDialog("enter the account number: "));
        balance=Float.parseFloat(JOptionPane.showInputDialog("enter the opening balance: "));

            }
    public  abstract void withdraw();

    public void checkBalance(){
        JOptionPane.showMessageDialog(null,"**CHECKING BALANCE**");
        JOptionPane.showMessageDialog(null,"your balance is kshs." + balance);
    }
    public void deposit(){
        float deposit_amount;
        JOptionPane.showMessageDialog(null,"**DEPOSITING**");
        deposit_amount=Float.parseFloat(JOptionPane.showInputDialog("enter the amount you want to deposit: "));
        JOptionPane.showMessageDialog(null,"kshs." + deposit_amount + " deposited successfully.Your balance is kshs."+ (balance+=deposit_amount));
    }
}

