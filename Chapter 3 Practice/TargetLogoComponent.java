import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class TargetLogoComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        TargetLogo t1 = new TargetLogo(30,50);
        int x = getWidth();
        int y = getHeight();
        t1.draw(g2);
    }
}