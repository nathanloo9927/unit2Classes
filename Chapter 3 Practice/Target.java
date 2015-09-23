import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Target
{
    private int xValue;
    private int yValue;
    
    public Target(int x, int y)
    {
        xValue = x;
        yValue = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double circle1 = new Ellipse2D.Double(xValue + 15, yValue + 15, 200, 200);
        g2.draw(circle1);
        g2.setColor(Color.white);
        g2.fill(circle1);
        
        Ellipse2D.Double circle2 = new Ellipse2D.Double(xValue + 25, yValue + 25, 180, 180);
        g2.setColor(Color.black);
        g2.draw(circle2);
        g2.setColor(Color.white);
        g2.fill(circle2);
        
        Ellipse2D.Double circle3 = new Ellipse2D.Double(xValue + 35, yValue + 35, 160, 160);
        g2.setColor(Color.black);
        g2.draw(circle3);
        g2.setColor(Color.black);
        g2.fill(circle3);
        
        Ellipse2D.Double circle4 = new Ellipse2D.Double(xValue + 45, yValue + 45, 140, 140);
        g2.setColor(Color.white);
        g2.draw(circle4);
        g2.setColor(Color.black);
        g2.fill(circle4);
        
        Ellipse2D.Double circle5 = new Ellipse2D.Double(xValue + 55, yValue + 55, 120, 120);
        g2.setColor(Color.black);
        g2.draw(circle5);
        g2.setColor(Color.blue);
        g2.fill(circle5);
        
        Ellipse2D.Double circle6 = new Ellipse2D.Double(xValue + 65, yValue + 65, 100, 100);
        g2.setColor(Color.white);
        g2.draw(circle6);
        g2.setColor(Color.blue);
        g2.fill(circle6);
        
        Ellipse2D.Double circle7 = new Ellipse2D.Double(xValue + 75, yValue + 75, 80, 80);
        g2.setColor(Color.black);
        g2.draw(circle7);
        g2.setColor(Color.red);
        g2.fill(circle7);
        
        Ellipse2D.Double circle8 = new Ellipse2D.Double(xValue + 85, yValue + 85, 60, 60);
        g2.setColor(Color.black);
        g2.draw(circle8);
        g2.setColor(Color.red);
        g2.fill(circle8);
        
        Ellipse2D.Double circle9 = new Ellipse2D.Double(xValue + 95, yValue + 95, 40, 40);
        g2.setColor(Color.black);
        g2.draw(circle9);
        g2.setColor(Color.yellow);
        g2.fill(circle9);
        
        Ellipse2D.Double circle10 = new Ellipse2D.Double(xValue + 105, yValue + 105, 20, 20);
        g2.setColor(Color.black);
        g2.draw(circle10);
        g2.setColor(Color.yellow);
        g2.fill(circle10);
    }
}