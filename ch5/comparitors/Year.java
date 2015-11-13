import java.util.Scanner;

/**
 * Write a description of class asdf here.
 * 
 * @author Joe 
 * @version 1.5.2
 */
public class Year
{
    public static void main(String[] args)
    {
        System.out.println("What year would you like to check?");
        Scanner userYear = new Scanner(System.in);
        int yearCheck = userYear.nextInt();
        if(yearCheck%4 == 0 && yearCheck%100 != 0 || yearCheck%400 == 0)
        {
            String string1 = String.format("Year %s is a leap year",yearCheck);
            System.out.println(string1);
        }
        else
        {
            String string1 = String.format("Year %s is not a leap year",yearCheck);
            System.out.println(string1);
        }
    }

}
