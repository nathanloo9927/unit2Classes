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
    private int l;
    private int h;

    /**
     * Default constructor for objects of class Moon
     */
    public Moon(int xValue, int yValue, int length, int height)
    {
        // initialise instance variables
        x = xValue;
        y = yValue;
        l = length;
        h = height;
    }

    /**
     * Draws the moon
     *
     * @param    g2 using graphics to draw the moon
     */
    public void draw (Graphics2D g2)
    {
        Ellipse2D.Double moonbright = new Ellipse2D.Double(x,y,l,h);
        g2.draw(moonbright);
        g2.setColor(Color.yellow);
        g2.fill(moonbright);
    }

}
