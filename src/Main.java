import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
       new PongGui();
    }

}
class PongGui extends JFrame
{
    PongGui()
    {
        setSize(1000,1000);
        PongPanel p = new PongPanel();
        add(p);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        p.run();

    }

}
class PongPanel extends JPanel
{
    int paddlePos = 450;

    final int RIGHT_WALL = 1000;

    int x = 200,y=200, dx = 10,dy = 10;//remember that d stands for delta, or change.

    PongPanel() {
        setBackground(Color.BLACK);

        addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if (e.getPreciseWheelRotation() > 0)
                    paddlePos+=2;
                else
                    paddlePos-=2;
            }
        });

    }
    public void run(){
        runBall();
        runPaddle();

    }
    private void runBall()
    {
        Timer timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Gavriel Write some code here
                //notice that we have a variable right wall. X, Y , dx, and dy are meant for the ball.
            }
        });
        timer.start();

    }
    private void runPaddle() {
        Graphics2D g = (Graphics2D) getGraphics();
        Timer timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g.setColor(Color.black);
                g.fillRect(100,0,50,1000);
                g.setColor(Color.WHITE);
                g.fillRoundRect(100,paddlePos,50,200,10,10);
            }
        });
        timer.start();
    }
}