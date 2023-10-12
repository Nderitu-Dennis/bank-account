import javax.swing.*;

public class SavingsAccount extends Account{
    public SavingsAccount(){
        JOptionPane.showMessageDialog(null,"**SAVINGS ACCOUNT**");
    }

    public void withdraw(){
        float withdrawAmount;
        JOptionPane.showMessageDialog(null,"**WITHDRAWING**");

            withdrawAmount=Float.parseFloat(JOptionPane.showInputDialog("enter amount you wish to withdraw: "));
            if(withdrawAmount<=0){
            JOptionPane.showMessageDialog(null,"error!cannot withdraw an amount equal to 0 or less");
            withdraw();
        }
        else if (withdrawAmount <= balance) {
            JOptionPane.showMessageDialog(null,"kshs." + withdrawAmount + " successfully withdrawn.your balance is kshs." + (balance -= withdrawAmount));
        }
        else {
            JOptionPane.showMessageDialog(null,"error!Please enter amount lesser than or equal to your balance.");
            withdraw();
        }
        }

    }

