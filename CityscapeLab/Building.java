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
    private int z;

    /**
     * Default constructor for objects of class Building
     */
    public Building(int xValue, int yValue, int length)
    {
        // initialise instance variables
        x = xValue;
        y = yValue;
        z = length;
    }

    /**
     * Draws the buildings
     * 
     *
     * @param    g2 using graphics to draw the buildings
     */
    public void draw(Graphics2D g2)
    {
        Rectangle building1 = new Rectangle(x, y + 29, z, 470);
        Rectangle window1 = new Rectangle(x + 10, y + 50, 65, 65);
        Rectangle window2 = new Rectangle(x + 85, y + 50, 65, 65);
        Rectangle window3 = new Rectangle(x + 10, y + 135, 65, 65);
        Rectangle window4 = new Rectangle(x + 85, y + 135, 65, 65);
        Rectangle window5 = new Rectangle(x + 10, y + 220, 65, 65);
        Rectangle window6 = new Rectangle(x + 85, y + 220, 65, 65);
        Rectangle window7 = new Rectangle(x + 10, y + 305, 65, 65);
        Rectangle window8 = new Rectangle(x + 85, y + 305, 65, 65);
        Rectangle window9 = new Rectangle(x + 10, y + 390, 65, 65);
        Rectangle window10 = new Rectangle(x + 85, y + 390, 65, 65);
        Rectangle door1 = new Rectangle(x + 70, y + 460, 20, 40);
        
        Rectangle building2 = new Rectangle(x + 170, y + 179, z, 320);
        Rectangle window11 = new Rectangle(x + 180, y + 200, 65, 65);
        Rectangle window12 = new Rectangle(x + 255, y + 200, 65, 65);
        Rectangle window13 = new Rectangle(x + 180, y + 285, 65, 65);
        Rectangle window14 = new Rectangle(x + 255, y + 285, 65, 65);
        Rectangle window15 = new Rectangle(x + 180, y + 370, 65, 65);
        Rectangle window16 = new Rectangle(x + 255, y + 370, 65, 65);
        Rectangle door2 = new Rectangle(x + 230, y + 460, 20, 40);
        Rectangle door3 = new Rectangle(x + 251, y + 460, 20, 40);
        
        Rectangle building3 = new Rectangle(x + 340, y + 99, z, 400);
        Rectangle window17 = new Rectangle(x + 350, y + 120, 65, 65);
        Rectangle window18 = new Rectangle(x + 425, y + 120, 65, 65);
        Rectangle window19 = new Rectangle(x + 350, y + 205, 65, 65);
        Rectangle window20 = new Rectangle(x + 425, y + 205, 65, 65);
        Rectangle window21 = new Rectangle(x + 350, y + 290, 65, 65);
        Rectangle window22 = new Rectangle(x + 425, y + 290, 65, 65);
        Rectangle window23 = new Rectangle(x + 350, y + 375, 65, 65);
        Rectangle window24 = new Rectangle(x + 425, y + 375, 65, 65);
        Rectangle door4 = new Rectangle(x + 410, y + 460, 20, 40);
        
        Rectangle building4 = new Rectangle(x + 510, y - 1, z, 500);
        Rectangle window25 = new Rectangle(x + 520, y + 20, 65, 65);
        Rectangle window26 = new Rectangle(x + 595, y + 20, 65, 65);
        Rectangle window27 = new Rectangle(x + 520, y + 105, 65, 65);
        Rectangle window28 = new Rectangle(x + 595, y + 105, 65, 65);
        Rectangle window29 = new Rectangle(x + 520, y + 190, 65, 65);
        Rectangle window30 = new Rectangle(x + 595, y + 190, 65, 65);
        Rectangle window31 = new Rectangle(x + 520, y + 275, 65, 65);
        Rectangle window32 = new Rectangle(x + 595, y + 275, 65, 65);
        Rectangle window33 = new Rectangle(x + 520, y + 360, 65, 65);
        Rectangle window34 = new Rectangle(x + 595, y + 360, 65, 65);
        Rectangle door5 = new Rectangle(x + 580, y + 460, 20, 40);
        
        Rectangle building5 = new Rectangle(x + 680, y + 59, z, 440);
        g2.setColor(Color.white);
        g2.draw(building1);
        g2.draw(building2);
        g2.draw(building3);
        g2.draw(building4);
        g2.draw(building5);
        g2.setColor(Color.lightGray);
        g2.fill(building1);
        g2.fill(building2);
        g2.fill(building3);
        g2.fill(building4);
        g2.fill(building5);
        g2.setColor(Color.yellow);
        g2.fill(window1);
        g2.fill(window2);
        g2.fill(window3);
        g2.fill(window4);
        g2.fill(window5);
        g2.fill(window6);
        g2.fill(window7);
        g2.fill(window8);
        g2.fill(window9);
        g2.fill(window10);
        g2.fill(window11);
        g2.fill(window12);
        g2.fill(window13);
        g2.fill(window14);
        g2.fill(window15);
        g2.fill(window16);
        g2.fill(window17);
        g2.fill(window18);
        g2.fill(window19);
        g2.fill(window20);
        g2.fill(window21);
        g2.fill(window22);
        g2.fill(window23);
        g2.fill(window24);
        g2.fill(window25);
        g2.fill(window26);
        g2.fill(window27);
        g2.fill(window28);
        g2.fill(window29);
        g2.fill(window30);
        g2.fill(window31);
        g2.fill(window32);
        g2.fill(window33);
        g2.fill(window34);
        g2.setColor(Color.black);
        g2.draw(door2);
        g2.draw(door3);
        g2.setColor(Color.orange);
        g2.fill(door1);
        g2.fill(door2);
        g2.fill(door3);
        g2.fill(door4);
        g2.fill(door5);
    }

}
