import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Scanner;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @Jhhacker
 * @version 10 October 2015
 */
public class CityscapeComponent extends JComponent
{
    public boolean isDay()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Is it day or night? (type \"day\" or \"night\", if you enter\nan invalid response it will default to night.) ");
        String t = s.next();
        if (t.equals("day"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private Sky sky = new Sky(0,000,800,300,isDay());
    private Grass grass = new Grass(0,300,800,300);
    private Blimp blimp = new Blimp(100,30,150,75);
    private BlimpCart blimpCart = new BlimpCart(140,95,60,32);
    private Road road = new Road(0,400,800,100);
    private Stripe stripe = new Stripe(0,445,800,10);    

    private Building building1 = new Building(20,100,100,200);
    private YellowWindow b1w1 = new YellowWindow(30,110,35,35);
    private YellowWindow b1w2 = new YellowWindow(75,110,35,35);
    private YellowWindow b1w3 = new YellowWindow(30,155,35,35);
    private YellowWindow b1w4 = new YellowWindow(75,155,35,35);
    private YellowWindow b1w5 = new YellowWindow(30,200,35,35);
    private YellowWindow b1w6 = new YellowWindow(75,200,35,35);
    private YellowWindow b1w7 = new YellowWindow(30,245,35,35);
    private YellowWindow b1w8 = new YellowWindow(75,245,35,35);

    private Building building2 = new Building(520,120,100,200);
    private YellowWindow b2w1 = new YellowWindow(530,130,35,35);
    private YellowWindow b2w2 = new YellowWindow(575,130,35,35);
    private YellowWindow b2w3 = new YellowWindow(530,175,35,35);
    private YellowWindow b2w4 = new YellowWindow(575,175,35,35);
    private YellowWindow b2w5 = new YellowWindow(530,220,35,35);
    private YellowWindow b2w6 = new YellowWindow(575,220,35,35);
    private YellowWindow b2w7 = new YellowWindow(530,265,35,35);
    private YellowWindow b2w8 = new YellowWindow(575,265,35,35);

    private Building building3 = new Building(300,130,100,200);
    private YellowWindow b3w1 = new YellowWindow(310,140,35,35);
    private YellowWindow b3w2 = new YellowWindow(355,140,35,35);
    private YellowWindow b3w3 = new YellowWindow(310,185,35,35);
    private YellowWindow b3w4 = new YellowWindow(355,185,35,35);
    private YellowWindow b3w5 = new YellowWindow(310,230,35,35);
    private YellowWindow b3w6 = new YellowWindow(355,230,35,35);
    private YellowWindow b3w7 = new YellowWindow(310,275,35,35);
    private YellowWindow b3w8 = new YellowWindow(355,275,35,35);

    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        sky.draw(g2);
        grass.draw(g2);
        blimp.draw(g2);
        blimpCart.draw(g2);
        road.draw(g2);
        stripe.draw(g2);

        building1.draw(g2);
        b1w1.draw(g2);
        b1w2.draw(g2);
        b1w3.draw(g2);
        b1w4.draw(g2);
        b1w5.draw(g2);        
        b1w6.draw(g2);
        b1w7.draw(g2);
        b1w8.draw(g2);

        building2.draw(g2);
        b2w1.draw(g2);
        b2w2.draw(g2);
        b2w3.draw(g2);
        b2w4.draw(g2);
        b2w5.draw(g2);        
        b2w6.draw(g2);
        b2w7.draw(g2);
        b2w8.draw(g2);

        building3.draw(g2);
        b3w1.draw(g2);
        b3w2.draw(g2);
        b3w3.draw(g2);
        b3w4.draw(g2);
        b3w5.draw(g2);        
        b3w6.draw(g2);
        b3w7.draw(g2);
        b3w8.draw(g2);
    }

    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
          */
         public void nextFrame()
         {
             // update the objects in the cityscape so they are animated
             // ...
             private Blimp blimp1 = new Blimp(200,20,150,75);
             private BlimpCart blimpCart1 = new BlimpCart(240,85,60,32);
             blimp1.draw(g2);
             blimpcart1.draw(g2);
             
             
             // request that the Java Runtime repaints this component by invoking its paintComponent method
             repaint();
         }

}
