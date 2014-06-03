import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JPanel;

class L11 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // draw a light blue sky
        g2d.setColor(Color.cyan);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
}
        