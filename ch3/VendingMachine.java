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
     * @pre   Cannot be less than 1
     * @param number of sodas that are being filled
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
    
    /**
     * Returns the number of sodas
     * 
     * @pre  numberSodas must be positive
     * 
     */
    public int getNumberSodas()
    {
        return this.numberSodas;
    }
    
    /**
     * 
     * @pre  numberTokens must be positive
     * 
     */
    public int getNumberTokens()
    {
        return this.numberTokens;
    }
}