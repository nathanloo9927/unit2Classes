import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @Nathan
 * @version 10/1/15
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private Building buildings;
    private Moon moon;
    private Road road;
    
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
        
        // invoke the draw method on each object in your Cityscape
        // ...
        buildings = new Building(80,100,160,65);
        road = new Road(0,600);
        int xValue = getWidth();
        int yValue = getHeight();
        buildings.draw(g2);
        road.draw(g2);
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        int x = 20;
        Random r1 = new Random();
        while (x < 20) {
        r1.nextInt(1000);
        int number = r1;
        number += 1;
        moon = new Moon(number,5,100,100);
        moon.draw(g2);
        x += 1;
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        moon.repaint();
    }
    }

}
