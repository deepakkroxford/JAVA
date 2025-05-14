
package T13_ExceptionHandling;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        } else {
            System.out.println("successfull transaction left balance is : " + (balance - amount));
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        /**
         * Bank Account Custom Exception
         * Create a BankAccount class with methods deposit(double amount) and
         * withdraw(double amount).
         * Create a custom exception InsufficientBalanceException and throw it when
         * withdraw amount exceeds balance.
         */

        BankAccount b1 = new BankAccount();
        b1.deposit(21212123);
        try{
            b1.withdraw(232232.93);
            b1.withdraw(23212121.432);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
