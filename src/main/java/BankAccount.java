import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;
    public void setAccountBalance(double x) {
        this.accountBalance = x;
    }
    public double getAccountBalance(){
        return this.accountBalance;
    }
    public void setAccountNumber(int y){
        this.accountNumber = y;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public void setOwnerName( String d){
        this.ownerName = d;
    }
    public String getOwnerName(){
        return this.ownerName
    }
    public void setInterestRate( double e){
        this.interestRate = e;
    }
    public double getInterestRate(){
        return this.interestRate;
    }

    public BankAccount(final String name, final BankAccountType accountCategory) {
        setOwnerName(name);
        this.accountType = accountCategory;
        /*
         * Implement this function
         */
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}