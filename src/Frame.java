import javax.swing.*;

public class Frame extends JFrame
{
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public Frame()
    {
        super("Smiley Face");
        setSize(WIDTH,HEIGHT);

        getContentPane().add(new SmileyFace());


        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main( String args[] )
    {
        Frame run = new Frame();
    }
}