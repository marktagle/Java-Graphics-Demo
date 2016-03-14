import javax.swing.*;
import java.awt.event.*;

public class MainForm extends JFrame implements KeyListener {

    TestPanel pnl = new TestPanel();
    public MainForm(){
        setSize(450, 450);
        setTitle("Graphics Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnl);
        setVisible(true);
        addKeyListener(this);
    }

    public void keyTyped (KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_J){
            pnl.x += 5;
            pnl.repaint();
        }

    }

    public void keyPressed (KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_D){
            pnl.x += 5;
            pnl.repaint();
        }
        if(e.getKeyCode() == KeyEvent.VK_W){
            pnl.y -= 5;
            pnl.repaint();
        }
        if(e.getKeyCode() == KeyEvent.VK_A){
            pnl.x -= 5;
            pnl.repaint();
        }
        if(e.getKeyCode() == KeyEvent.VK_S){
            pnl.y += 5;
            pnl.repaint();
        }
    }

    public void keyReleased (KeyEvent e){}

}
