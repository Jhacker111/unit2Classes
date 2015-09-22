

/**
 * The car will drive a certain distance
 * 
 * @author Joe Hacker 
 * @version 9/10/15
 */
public class Car
{
    /** fuel efficiency in mpg */
    private double fuelEfficiency;
    
    /**amount of fuel left in the cars tank in gallons**/
    private double fuelInTank;

    /**
     * constructor for objects of class Car that specifies fuel efficiency
     */
    public Car( double fuelEfficiency )
    {
        // initialise instance variables
        fuelEfficiency = fuelEfficiency;
        fuelInTank = 0;
    }

    /**
     * Simulates driving and reduces fuel in the tank
     *
     * @pre     specified distance cannot result in the consumption of more gas than is available
     * @param   distance distance that the car drives in miles
     */
    public void drive(double distance)
    {
        fuelInTank -= distance / fuelEfficiency;
    }
    

    /**
     * Returns the amount of gas in the cars tank in units of gallons
     * 
     * @return the amount of gas in the cars tank in units of gallons
     */
    public double getGasInTank()
    {
        return fuelInTank;
    }


    /**
     * 
     * @pre    gallonsOfGas must be a positive number
     * @param  gallonsOfGas amount of gas to add to the car's tank in gallons
     */
    public void addGas(double gallonsOfGas)
    {
        fuelInTank+= gallonsOfGas;
    }


}
