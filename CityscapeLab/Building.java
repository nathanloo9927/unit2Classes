import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Creates a rectangle to show how tall the building is
 * 
 * @author Nathan 
 * @version 10/1/15
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int y;

    /**
     * Default constructor for objects of class Building
     */
    public Building(int xValue, int yValue)
    {
        // initialise instance variables
        x = xValue;
        y = yValue;
    }

    /**
     * Draws the buildings
     * 
     *
     * @param    g2 using graphics to draw the buildings
     */
    public void draw(Graphics2D g2)
    {
        Rectangle building1 = new Rectangle(x, y, 160, 500);
        Rectangle building2 = new Rectangle(x + 160, y + 30, 160, 50);
        Rectangle building3 = new Rectangle(x + 320, y + 10, 160, 70);
        Rectangle building4 = new Rectangle(x + 480, y - 40, 160, 120);
        Rectangle building5 = new Rectangle(x + 640, y + 20, 160, 60);
        
        g2.draw(building1);
        g2.draw(building2);
        g2.draw(building3);
        g2.draw(building4);
        g2.draw(building5);
    }

}
