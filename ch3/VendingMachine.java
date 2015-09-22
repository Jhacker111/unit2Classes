/**
 * The vending machine will accept tokens and give soda
 * 
 * @author Joe Hacker
 * @version 9/22/15
 */

public class VendingMachine
{
    private int numberTokens = 0;
    private int numberSodas = 0;
    
    /**
     * Constructor for objects of class VendingMachine that specifies the number of items
     */
    public VendingMachine( int numberSodas, int numberTokens )
    {
        numberSodas = numberSodas;
        numberTokens = numberTokens;
    }
    
    /**
     * Simulates filling the machine
     * 
     * @pre  Cannot be less than 1
     */
    public void fillUp(int cans)
    {
        this.numberSodas = this.numberSodas + cans;
    }
    
    /**
     * Simulates someone putting in a token
     * 
     * @pre  numberSodas cannot be less than 1
     */
    public void tokenIn()
    {
        this.numberSodas = this.numberSodas - 1;
        this.numberTokens = this.numberTokens  + 1;
    }
    
    public int getNumberSodas()
    {
        return this.numberSodas;
    }
    
    public int getNumberTokens()
    {
        return this.numberTokens;
    }
}