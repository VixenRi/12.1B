import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startC = new Color(red,green,blue);
        red = (int) ( Math.random()* 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endC = new Color(red,green,blue);
        GradientPaint gradient = new GradientPaint( 70,70, startC,150,150,endC);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
    }
}
