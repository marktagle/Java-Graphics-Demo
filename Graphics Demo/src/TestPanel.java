import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;

public class TestPanel extends JPanel implements MouseMotionListener, MouseListener {

    public int x = 0, y = 0;
    boolean isPressed = false;

    Image img;

    public TestPanel(){
        this.addMouseMotionListener(this);
        this.addMouseListener(this);

        try {
            img = ImageIO.read(new File("untitled.png"));
        } catch (Exception ex){

        }

    }

    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){
        isPressed = true;
        repaint();
    }
    public void mouseReleased(MouseEvent e){
        isPressed = false;
        repaint();
    }
    public void mouseClicked(MouseEvent e){}

    public void mouseDragged(MouseEvent e){}
    public void mouseMoved(MouseEvent e){
        x = e.getX() - 50;
        y = e.getY() - 50;
        repaint();
    }

    int i = 0;

    BasicStroke stk = new BasicStroke(10);

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        if(g2.getRenderingHint(RenderingHints.KEY_ANTIALIASING) != RenderingHints.VALUE_ANTIALIAS_ON) g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if(isPressed)  g2.setColor(Color.RED);
        else g2.setColor(Color.BLACK);

        //render image
        g2.drawImage(img, x, y, null);

        g2.fillOval(0, 0, 100, 100);
    }

}
