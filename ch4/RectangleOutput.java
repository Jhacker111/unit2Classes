import java.util.Scanner;
public class RectangleOutput
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the width of you rectangle: ");
        double width = in.nextFloat();
        Scanner h = new Scanner(System.in);
        System.out.print("Please enter the height of you rectangle: ");
        double height = h.nextFloat();
        System.out.printf("\nwidth: %f\theight: %f",width,height);
        double area = width*height;
        double perimeter = 2*width + 2*height;
        System.out.printf("\nArea: %f\tPerimeter: %f",area,perimeter);
        double diagonal = Math.sqrt(width*width+height*height);
        System.out.printf("\ndiagonal: %f",diagonal);
    }
}