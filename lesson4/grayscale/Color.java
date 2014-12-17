package grayscale;

// BlueJ project: lesson4/grayscale

public class Color
{
    private int red;
    private int green;
    private int blue;

    /**
     * Turns this color into the equivalent gray value.
     */
    public void turnGray()
    {
        // TODO: Change this color to its equivalent gray value.
        // The red, green, and blue variables should all be
        // set to the gray level, which is computed as a weighted
        // average of the original red, blue, and green levels.
        // The weights (corresponding to the sensitivity of the
        // cone cells in the human eye) are:
        // red - 0.2126
        // green - 0.7152
        // blue - 0.0722
    	int gray = (int) (0.2126 * red + 0.7152 * green + 0.0722 * blue);
    	red = gray;
    	green = gray;
    	blue = gray;
    }

    /**
     * Constructs a new Color object.
     * @param red the red value of the color (between 0 and 255)
     * @param green the green value of the color (between 0 and 255)
     * @param blue the blue value of the color (between 0 and 255)
     */
    public Color(int red, int green, int blue)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    /**
     * Gets the red value of this color.
     * @return the red value (between 0 and 255)
     */
    public int getRed()
    {
        return red;
    }

    /**
     * Gets the green value of this color.
     * @return the green value (between 0 and 255)
     */
    public int getGreen()
    {
        return green;
    }

    /**
     * Gets the blue value of this color.
     * @return the blue value (between 0 and 255)
     */
    public int getBlue()
    {
        return blue;
    }

    // Color constants

    public static final Color RED = new Color(255, 0, 0);
    public static final Color GREEN = new Color(0, 255, 0);
    public static final Color BLUE = new Color(0, 0, 255);
    public static final Color WHITE = new Color(255, 255, 255);
    public static final Color LIGHT_GRAY = new Color(192, 192, 192);
    public static final Color GRAY = new Color(128, 128, 128);
    public static final Color DARK_GRAY = new Color(64, 64, 64);
    public static final Color BLACK = new Color(0, 0, 0);
    public static final Color CYAN = new Color(0, 255, 255);
    public static final Color MAGENTA = new Color(255, 0, 255);
    public static final Color YELLOW = new Color(255, 255, 0);
    public static final Color PINK = new Color(255, 175, 175);
    public static final Color ORANGE = new Color(255, 200, 0);
}