import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Creates the moon
 * 
 * @author Nathan 
 * @version 10/2/15
 */
public class Moon
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int y;

    /**
     * Default constructor for objects of class Moon
     */
    public Moon(int xValue, int yValue)
    {
        // initialise instance variables
        x = xValue;
        y = yValue;
    }

    /**
     * Draws the moon
     *
     * @param    g2 using graphics to draw the moon
     */
    public void draw (Graphics2D g2)
    {
        Ellipse2D.Double moonbright = new Ellipse2D.Double(x,y,100,100);
        g2.draw(moonbright);
        
        Ellipse2D.Double moondark = new Ellipse2D.Double(x + 20,y + 10,80,80);
        g2.draw(moondark);
    }

}
