
package singletonpattern;

public class Singleton {
    
    //Private static of the instance in class Singleton
    private static Singleton instance = null;
    
    //Private constructor hidden...
    private Singleton (){
        
    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        //System.out.println("instance is created"); //Testing purposes
        return instance;
    } 
    
    
    //Methods utilizing a simple deposit, withdraw and exit
    
    private double balance = 8000.00; //Balance variable
    
    //Deposit
    public void deposit(double amount) {
        if (amount <= 5){
            //System.err.println("You can only deposit above $5.00!");
        }
        else {
            balance += amount;
            //System.out.println("Deposit successful. Balance is now 💲 " +balance);
        }
    } //End Deposit
    
    
    //Withdraw
    public void withdraw(double num) {
        if (num <= 0 ) {
            //System.err.println("You've made an invalid withdrawal!");
        }
        else {
            balance -= num;
            //System.out.println("Retreive cash from despenser. Balance is now 💲" + balance);
        }
    }//End Withdraw
    
    //Get balance in account
    public double getBalance(){
        //System.out.print("💲 " + balance);
        return balance;
    }
    
    public void exit() {
        System.out.println("\n \t Good bye"); 
    }
    
}
