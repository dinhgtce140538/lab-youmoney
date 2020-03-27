/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yourmoney;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class CheckInput implements CheckException {

    

    @Override
    public String inputEmail(String email) {
        try {
            if (!(email.matches("^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$"))) {
                return null;
            }
        } catch (Exception Ex) {

        }
        return email;
    }

    @Override
    public String inputPhone(String phone) {
        try {
            if (!(phone.matches("[0][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"))) {
                return null;
            }
        } catch (Exception Ex) {

        }
        return phone;
    }

    //nethod check date of birth cannot null and have to right format
    @Override
    public boolean inputDOB(String dob) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        //User enter date 
        //Create datecheck to check date user inputted
        Date datecheck;
        try {
            datecheck = format.parse(dob);
            System.out.println(format.format(datecheck));
            System.out.println(dob);
            //if datecheck equal with user inputtedd return date
            if (!dob.equalsIgnoreCase(format.format(datecheck))) {
                return false;
            }
            //catch error if user enter incorrect format.

        } catch (ParseException ex) {
            Logger.getLogger(CheckInput.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public boolean checkNumber(String money) {
        TransferMoney tm = new TransferMoney();
        try {
            long n = Long.parseLong(money);
            if (n <= 0) {
                JOptionPane.showMessageDialog(tm, "Please enter positive number!!!");
                return false;
            } else if (n > Long.parseLong(Entity.getMoney())) {
                JOptionPane.showMessageDialog(tm, "Not enough money!!!");
                return false;
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(tm, "Pleas enter money is number!!!");
        }
        return false;
    }
    public boolean checkNumberAdd(String money) {
        TransferMoney tm = new TransferMoney();
        try {
            long n = Long.parseLong(money);
            if (n <= 0) {
                JOptionPane.showMessageDialog(tm, "Please enter positive number!!!");
                return false;
            } 
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(tm, "Pleas enter money is number!!!");
        }
        return false;
    }

    
}
