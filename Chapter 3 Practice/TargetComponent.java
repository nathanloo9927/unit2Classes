import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Target t1 = new Target(100,100);
        int x = getWidth();
        int y = getHeight();
        t1.draw(g2);
    }
}