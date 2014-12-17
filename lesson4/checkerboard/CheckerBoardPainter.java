package checkerboard;

public class CheckerBoardPainter
{
    /**
     * Spaces are red if one of the coordinates is even and the other is odd
     * Spaces are blue if both coordinates are even
     * Spaces are blue if both coordinates are odd
     * 
     * @return 1 for red spaces and 0 for blue
     * @param row the row of the space to paint
     * @param col the column of the space to paint. 
     */
    public int getColor(int row, int col)
    {
        //To do!
    	return (row + col) % 2;
    }
}