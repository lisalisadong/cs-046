package ps1.BlockTower;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileFilter;

/**
 * A picture from an image file.
 */
public class Picture implements Shape
{
    private BufferedImage image;
    private JLabel label = new JLabel();    
    private double x;
    private double y;
    private double xGrow;
    private double yGrow;

    /**
     * Constructs a picture with no image.
     */
    public Picture()
    {
    }

   /**
    * Constructs a picture with a given width and height.
    * @param width the desired width
    * @param height the desired height
    */
   public Picture(double width, double height)
   {
      image = new BufferedImage((int) Math.round(width), 
         (int) Math.round(height), BufferedImage.TYPE_INT_RGB);
      label.setIcon(new ImageIcon(image));
      label.setText("");      
   }

    /**
     * Constructs an image from a given file or URL.
     * @param source the filename or URL
     */
    public Picture(String source)
    {
        load(source);
    }

    /**
     * Loads a new image from a given file or URL.
     * 
     * @param source the filename or URL
     */
    public void load(String source)
    {
        try
        {
            if (source.startsWith("http://"))
                image = ImageIO.read(new URL(source).openStream());
            else
                image = ImageIO.read(new File(source));

            label.setIcon(new ImageIcon(image));
            label.setText("");
        }
        catch (Exception ex)
        {
            image = null;
            label.setIcon(null);
            ex.printStackTrace();
        }
        Canvas.getInstance().repaint();
    }

    /**
     * Gets the leftmost x-position of the shape.
     * @return the leftmost x-position
     */
    public int getX()
    {
       return (int) Math.round(x - xGrow);
    }

    /**
     * Gets the topmost y-position of the shape.
     * @return the topmost y-position
     */
    public int getY()
    {
       return (int) Math.round(y - yGrow);
    }

    /**
     * Gets the width of this picture.
     */
    public int getWidth()
    {
       return (int) Math.round(
          (image == null ? 0 : image.getWidth()) + 2 * xGrow);
    }

    /**
     * Gets the height of this picture.
     */
    public int getHeight()
    {
       return (int) Math.round(
          (image == null ? 0 : image.getHeight()) + 2 * yGrow);
    }

    /**
     * The number of pixels in this picture.
     * @return the number of pixels
     */
    public int pixels()
    {
        if (image == null)
        {
            return 0;
        }
        else
        {
            return image.getWidth() * image.getHeight();
        }
    }

    /**
     * Gets the color of a pixel.
     * @param i the pixel index
     * @return the color at pixel i
     */
    public Color getColorAt(int i)
    {
        if (image == null || i < 0 || i >= pixels())
        {
           throw new IndexOutOfBoundsException("" + i);
        }
        else
        {
            return getColorAt(i % image.getWidth(), i / image.getWidth());
        }
    }

    /**
     * Sets the color of a pixel.
     * @param i the pixel index
     * @param color the new color for the pixel
     */
    public void setColorAt(int i, Color color)
    {
        if (image == null || i < 0 || i >= pixels())
        {
           throw new IndexOutOfBoundsException("" + i);
        }
        else
        {
            setColorAt(i % image.getWidth(), i / image.getWidth(), color);
        }
    }

    /**
     * Gets the color of a pixel.
     * @param x the x-coordinate (column) of the pixel
     * @param y the y-coordinate (row) of the pixel
     * @param color the new color for the pixel
     */
    public Color getColorAt(int x, int y)
    {
        if (image == null || x < 0 || x >= image.getWidth() || y < 0 || y >= image.getHeight())
        {
           throw new IndexOutOfBoundsException("(" + x + "," + y + ")");
        }
        else
        {
            int rgb = image.getRGB(x, y) & 0xFFFFFF;
            return new Color(rgb / 65536, (rgb / 256) % 256, rgb % 256);
        }
    }

    /**
     * Sets the color of a pixel.
     * @param x the x-coordinate (column) of the pixel
     * @param y the y-coordinate (row) of the pixel
     * @param the color of the pixel at the given row and column
     */
    public void setColorAt(int x, int y, Color color)
    {
        if (image == null || x < 0 || x >= image.getWidth() || y < 0 || y >= image.getHeight())
        {
           throw new IndexOutOfBoundsException("(" + x + "," + y + ")");
        }
        else
        {
            image.setRGB(x, y, ((int) color.getRed()) * 65536 + ((int) color.getGreen()) * 256 + (int) color.getBlue());
            Canvas.getInstance().repaint();
        }
    }

    /**
     * Moves this picture by a given amount.
     * @param dx the amount by which to move in x-direction
     * @param dy the amount by which to move in y-direction
     */
    public void translate(double dx, double dy)
    {
        x += dx;
        y += dy;
        Canvas.getInstance().repaint();
    }

    /**
     * Resizes this picture both horizontally and vertically.
     * @param dw the amount by which to resize the width on each side
     * @param dw the amount by which to resize the height on each side
     */
    public void grow(double dw, double dh)
    {
        xGrow += dw;
        yGrow += dh;
        Canvas.getInstance().repaint();
    }

    /**
     * Shows this picture on the canvas.
     */
    public void draw()
    {
        Canvas.getInstance().show(this);
    }

    /**
     * Draws this shape.
     * @param g2 the graphics context
     */
    public void paintShape(Graphics2D g2)
    {
        if (image != null)
        {
            Dimension dim = label.getPreferredSize();
            if (dim.width > 0 && dim.height > 0)
            {
                label.setBounds(0, 0, dim.width, dim.height);
                g2.translate(getX(), getY());
                g2.scale((image.getWidth() + 2 * xGrow) / dim.width, 
                    (image.getHeight() + 2 * yGrow) / dim.height);
                label.paint(g2);
            }
        }
    }
}
