import javax.swing.*;

public class CurrentAccount extends Account{
    public CurrentAccount(){
        JOptionPane.showMessageDialog(null,"**CURRENT ACCOUNT**");
    }
    public void withdraw() {
        float withdrawAmount;
        JOptionPane.showMessageDialog(null,"**WITHDRAWING");
        double limit = (1.45 * balance);
        JOptionPane.showMessageDialog(null,"you can withdraw as much as kshs." + limit);
       withdrawAmount=Float.parseFloat( JOptionPane.showInputDialog("enter amount you wish to withdraw: "));

        if(withdrawAmount<=0){
            JOptionPane.showMessageDialog(null,"error!cannot withdraw an amount equal to 0 or less");
            withdraw();
        }
        else if(withdrawAmount<=balance ) {
            JOptionPane.showMessageDialog(null,"kshs." + withdrawAmount + " successfully withdrawn.Your balance is kshs." + (balance -= withdrawAmount));
        }

        else if(withdrawAmount>balance && withdrawAmount<=limit){
            String response="";
            response=JOptionPane.showInputDialog("insufficient funds in your account for withdrawal of kshs."+withdrawAmount+ ".Do you wish to have an overdraft of kshs." + (withdrawAmount-balance) + "?\ntype y for YES, and n for NO if you don't want to authorize an overdraft\nenter 0 if you want to resume to the normal withdrawal");
            if(response.equalsIgnoreCase("y")){
                JOptionPane.showMessageDialog(null,"kshs." + withdrawAmount + " successfully withdrawn.Your balance is kshs." + (balance -= withdrawAmount));
            } else if(response.equalsIgnoreCase("n")){
                JOptionPane.showMessageDialog(null,"**TERMINATING THE PROCESS**");
                System.exit(0);}
            else if(response.equals("0")){
                withdraw();
            }
            else{
                JOptionPane.showMessageDialog(null,"error!");
            System.exit(0);}}
         if(withdrawAmount>limit) {


            JOptionPane.showMessageDialog(null,"error! Please enter an amount that is less or equal to your overdraft limit" + " kshs.(" + limit + ")");
            withdraw();
        }


    }
        public static void main (String[]args){
           CurrentAccount c = new CurrentAccount();
// SavingsAccount s=new SavingsAccount();
            c.deposit();
            //c.checkBalance();
            c.withdraw();
            c.checkBalance();
            c.deposit();
            c.checkBalance();

        }
    }


