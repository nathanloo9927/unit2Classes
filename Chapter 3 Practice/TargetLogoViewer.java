import javax.swing.JFrame;

public class TargetLogoViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(300,400);
        frame.setTitle("Target Logo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetLogoComponent component = new TargetLogoComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}