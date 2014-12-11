package ps1.BlockTower;

import java.awt.image.BufferedImage;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.RescaleOp;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Canvas
{
    private static Canvas canvas = new Canvas();

    private ArrayList<Shape> shapes = new ArrayList<Shape>();
    private BufferedImage background;
    private JFrame frame;
    private JComponent component;

    private static final int MIN_SIZE = 100;
    private static final int MARGIN = 10;
    private static final int LOCATION_OFFSET = 120;

    private Canvas()
    {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        component = new JComponent()
        {
            public void paintComponent(Graphics g)
            {
                g.setColor(java.awt.Color.WHITE);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(java.awt.Color.BLACK);
                if (background != null)
                {
                   g.drawImage(background, 0, 0, null);
                }               
                for (Shape s : new ArrayList<Shape>(shapes))
                {
                    Graphics2D g2 = (Graphics2D) g.create();
                    s.paintShape(g2);
                    g2.dispose();
                }
            }

            public Dimension getPreferredSize()
            {
                int maxx = MIN_SIZE;
                int maxy = MIN_SIZE;
                if (background != null)
                {
                   maxx = Math.max(maxx, background.getWidth());
                   maxy = Math.max(maxx, background.getHeight());
                }
                for (Shape s : shapes)
                {
                    maxx = (int) Math.max(maxx, s.getX() + s.getWidth());
                    maxy = (int) Math.max(maxy, s.getY() + s.getHeight());
                }
                return new Dimension(maxx + MARGIN, maxy + MARGIN);
            }
        };

        frame.add(component);
        frame.pack();
        frame.setLocation(LOCATION_OFFSET, LOCATION_OFFSET);
        frame.setVisible(true);
    }

    public static Canvas getInstance()
    {
        return canvas;
    }

    public void show(Shape s)
    {
        if (!shapes.contains(s))
        {
            shapes.add(s);
        }
        repaint();
    }

    public void repaint()
    {
        Dimension dim = component.getPreferredSize();
        if (dim.getWidth() > component.getWidth()
                || dim.getHeight() > component.getHeight())
        {
            frame.pack();
        }
        else
        {
            frame.repaint();
        }
    }

    /**
     * Pauses so that the user can see the picture before it is transformed.
     */
    public void pause()
    {
        JOptionPane.showMessageDialog(frame, "Click Ok to continue");
    }

    /**
     * Takes a snapshot of the screen, fades it, and sets it as the background.
     */
    public static void snapshot()
    {
        java.awt.Rectangle rect = getInstance().component.getBounds();
        BufferedImage image = new BufferedImage(rect.width, rect.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setColor(java.awt.Color.WHITE);
        g.fillRect(0, 0, rect.width, rect.height);
        g.setColor(java.awt.Color.BLACK);
        getInstance().component.paint(g);
        float factor = 0.8f;
        float base = 255f * (1f - factor);
        RescaleOp op = new RescaleOp(factor, base, null);
        BufferedImage filteredImage
           = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
        op.filter(image, filteredImage);
        getInstance().background = filteredImage;
        getInstance().component.repaint();
    }
}
