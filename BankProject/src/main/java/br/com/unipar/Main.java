package br.com.unipar;

import br.com.unipar.entities.CheckingAccount;
import br.com.unipar.entities.SavingsAccount;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Main {

    public static void main(String[] args) {
        
        Date dateOne = new Date(21/9/2021);
        Date dateTwo = new Date(21/10/2021);
        
        try {
            CheckingAccount checkingAccount = new CheckingAccount();
            checkingAccount.getOverdraftLimit(700);
            checkingAccount.extractByPeriod(dateOne, dateTwo);
            checkingAccount.getBankBalanceByDate(dateOne);
            checkingAccount.cashDeposit(100);
            checkingAccount.cashOut(500);
            System.out.println(checkingAccount.getBalance());

            SavingsAccount savingsAccount = new SavingsAccount();
            savingsAccount.extractByPeriod(dateOne, dateOne);
            savingsAccount.getBankBalanceByDate(dateTwo);
            savingsAccount.cashDeposit(500);
            savingsAccount.cashOut(200);
            System.out.println(savingsAccount.getBalance());

        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
    }
    
}
