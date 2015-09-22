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
        Ellipse2D.Double outside_target = new Ellipse2D.Double(xValue + 15, yValue + 15, 100, 100);
        g2.draw(outside_target);
        g2.fill(outside_target);
        
        Ellipse2D.Double outside_middle_target = new Ellipse2D.Double(xValue + 25, yValue + 25, 80, 80);
        g2.draw(outside_middle_target);
        g2.setColor(Color.WHITE);
        g2.fill(outside_middle_target);
        
        Ellipse2D.Double middle_target = new Ellipse2D.Double(xValue + 35, yValue + 35, 60, 60);
        g2.draw(middle_target);
        g2.setColor(Color.BLACK);
        g2.fill(middle_target);
        
        Ellipse2D.Double inside_middle_target = new Ellipse2D.Double(xValue + 45, yValue + 45, 40, 40);
        g2.draw(inside_middle_target);
        g2.setColor(Color.WHITE);
        g2.fill(inside_middle_target);
        
        Ellipse2D.Double inside_target = new Ellipse2D.Double(xValue + 55, yValue + 55, 20, 20);
        
        g2.draw(inside_target);
    }
}