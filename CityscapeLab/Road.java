import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Allows the user to draw a road
 * 
 * @author Jhhacker 
 * @version 10.10.15
 */
public class Road
{
    // puts the road on the grid horizontally
    private int xvar;
    // puts the road on the grid vertically
    private int yvar;
    // defines the height
    private int height;
    // defines the width
    private int width;

    /**
     * Constructor for objects of class Road
     * @param xvar = the objects horizontal location
     * @param yvar = the objects vertical postition
     * @param height = how tall it is
     * @param width = how wide it is
     */
    public Road(int xvar, int yvar, int height, int width)
    {
        this.xvar = xvar;
        this.yvar = yvar;
        this.height = height;
        this.width = width;
    }

    /**
     * Renders the road
     * @param  g2 is the window that it is in
     */
    public void draw(Graphics2D g2)
    {
        Rectangle frame = new Rectangle(xvar,yvar,height,width);
        g2.setPaint(Color.GRAY);
        g2.draw(frame);
        g2.fill(frame);
        
    }
}
