import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class TargetLogo
{
    private int xValue;
    private int yValue;
    
    public TargetLogo(int x, int y)
    {
        xValue = x;
        yValue = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double outer_circle = new Ellipse2D.Double(xValue + 15, yValue + 15, 150, 150);
        g2.setColor(Color.red);
        g2.draw(outer_circle);
        g2.fill(outer_circle);
        
        Ellipse2D.Double middle_circle = new Ellipse2D.Double(xValue + 40, yValue + 40, 100, 100);
        g2.draw(middle_circle);
        g2.setColor(Color.white);
        g2.fill(middle_circle);
        
        Ellipse2D.Double inner_circle = new Ellipse2D.Double(xValue + 65, yValue + 65, 50, 50);
        g2.draw(inner_circle);
        g2.setColor(Color.red);
        g2.fill(inner_circle);
    }
}