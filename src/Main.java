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
    final int STARTING_POS = 450;
    int paddlePos = STARTING_POS;
    PongPanel(){
        setBackground(Color.BLACK);

        addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
               if(e.getPreciseWheelRotation() > 0)
               {
                   paddlePos++;
               }
               else
                   paddlePos--;

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
            }
        });

    }
    private void runPaddle() {
        Timer timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Gavriel Write some code here
            }
        });
    }
}