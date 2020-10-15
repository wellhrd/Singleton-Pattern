
package singletonpattern;

import java.util.*;

/**
 * @author Mickael Walters
 * ID: 2016111033
 */
public class SingletonPattern {

    public static void main(String[] args) {
        
        //Opens the GIU interface
        Login bankApp = new Login();
        bankApp.setVisible(true);
        //END GUI
        
/*        
       //Input object
        Scanner input = new Scanner(System.in);
        double n;
        
        System.out.print("Enter deposit amount here: 💲");
        n = input.nextDouble();
        Singleton.getInstance().deposit(n);
        
        System.out.print("How much you'd like to withdraw? 💲");
        n = input.nextDouble();
        Singleton.getInstance().withdraw(n);
        
        Singleton.getInstance().getBalance();
        Singleton.getInstance().exit();
*/
    }


}
