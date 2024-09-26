import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;


public class SmileyFace extends Canvas
{
    public SmileyFace()
    {
        setBackground(Color.WHITE);
    }

    public void paint(Graphics window)
    {
        window.setColor(Color.pink);
        window.fillOval(200,100,400,400);

        window.setColor(Color.WHITE);
        window.fillOval(250,200,100,100);
        window.fillOval(455,200,100,100);

        window.setColor(Color.BLACK);
        window.drawOval(200,100,400,400);
        window.fillOval(275,230,50,25);
        window.fillOval(480,230,50,25);
        window.fillArc(350,400,100,50,0,-180);
    }
}