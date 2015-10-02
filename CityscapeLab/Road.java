import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Draws the Road
 * 
 * @author Nathan 
 * @version 10/2/15
 */
public class Road
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int y;

    /**
     * Default constructor for objects of class Road
     */
    public Road(int xValue, int yValue)
    {
        x = xValue;
        y = yValue;
    }

    /**
     * Draws the road
     *
     *
     * @param    g2 using graphics to draw the road
     */
    public void draw(Graphics2D g2)
    {
        Rectangle sidewalk = new Rectangle(x,y,1000,120);
        Rectangle road = new Rectangle(x,y + 20,1000,100);
        Rectangle divider = new Rectangle (x,y + 50,1000,20);
        Rectangle grass = new Rectangle(x,y + 100,1000,20);
        g2.draw(sidewalk);
        g2.draw(road);
        g2.setColor(Color.yellow);
        g2.draw(divider);
        g2.setColor(Color.black);
        g2.draw(grass);
    }

}
