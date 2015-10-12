import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @Jhhacker
 * @version 10 October 2015
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    
    
    
    
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Sky sky = new Sky(0,300,600,300);
        sky.draw(g2);
        
        Grass grass = new Grass(0,600,600,300);
        grass.draw(g2);
        
        Blimp blimp = new Blimp(100,450,100,50);
        blimp.draw(g2);
        
        Building building1 = new Building(50,50,50,250);
        building1.draw(g2);
        
        YellowWindow b1w1 = new YellowWindow(55,295,20,20);
        b1w1.draw(g2);
    }
    
            
        
        
        
    
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
//      */
//     public void nextFrame()
//     {
//         // update the objects in the cityscape so they are animated
//         // ...
//         
//         
//         
//         // request that the Java Runtime repaints this component by invoking its paintComponent method
//         repaint();
//     }

}
