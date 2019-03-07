package Graphics_Unit_2;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovingShapePanel extends JPanel implements Runnable {

    private Shape sh;

    public MovingShapePanel() {
        setBackground(Color.WHITE);
        setVisible(true);
        sh = new Shape(100,100,100,100,Color.ORANGE,1,1);
        new Thread(this).start();
    }

    public void update(Graphics window) {
        paint(window);
    }

    public void paint(Graphics window) {
        window.setColor(Color.WHITE);
        window.fillRect(0, 0, getWidth(), getHeight());
        window.setColor(Color.BLUE);
        window.drawRect(20, 20, getWidth() - 40, getHeight() - 40);
        window.setFont(new Font("TAHOMA", Font.BOLD, 18));
        window.drawString("CREATE YOUR OWN SHAPE!", 40, 40);
        
		//tell sh to move and draw
         if(!(sh.getX()>=10 && sh.getX()<=730))
         {
            sh.setxSpeed(-sh.getxSpeed());
         }
         else if(!(sh.getyPos()>=10 && sh.getyPos()<=530)){
            sh.setySpeed(-sh.getySpeed());
         }
}

    public void run() {
        try {
            while (true) {
                Thread.currentThread().sleep(10);
                repaint();
            }
        } catch (Exception e) {
        }
    }
}
