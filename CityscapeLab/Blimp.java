import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Allows the user to draw a blimp balloon
 * 
 * @author Jhhacker 
 * @version 10.10.15
 */
public class Blimp
{
    // puts the balloon on the grid horizontally
    private int xvar;
    // puts the balloon on the grid vertically
    private int yvar;
    // defines the horizontal radius
    private int xradius;
    // defines the vertical radius
    private int yradius;

    /**
     * Constructor for objects of class Blimp
     * @param radius = how big the radius is
     * @param xvar = the objects horizontal location
     * @param yvar = the objects vertical postition
     */
    public Blimp(int xvar, int yvar, int xradius, int yradius)
    {
        this.xvar = xvar;
        this.yvar = yvar;
        this.xradius = xradius;
        this.yradius = yradius;
    }

    /**
     * Renders the blimp
     * @param  g2 is the window the balloon is in
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double balloon = new Ellipse2D.Double(this.xvar, this.yvar, this.xradius, this.yradius);
        g2.setPaint(Color.GREEN);
        g2.draw(balloon);
        g2.fill(balloon);
    }
}
