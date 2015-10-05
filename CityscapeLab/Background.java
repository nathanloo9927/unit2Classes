import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Creates the color of the background
 * 
 * @author Nathan
 * @version 10/5/15
 */
public class Background
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int y;

    /**
     * Default constructor for objects of class Background
     */
    public Background(int xValue, int yValue)
    {
        // initialise instance variables
        x = xValue;
        y = yValue;
    }

    /**
     * Makes a rectangle to represent the background, then fills it in
     *
     * @param    g2 using graphics to draw a rectangle for the background
     */
    public void draw(Graphics2D g2)
    {
        Rectangle sky = new Rectangle(x,y,1000,760);
        Color back = new Color(0,0,30);
        g2.draw(sky);
        g2.setColor(back);
        g2.fill(sky);
    }

}
