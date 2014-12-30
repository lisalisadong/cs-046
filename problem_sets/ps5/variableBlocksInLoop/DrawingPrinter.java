package ps5.variableBlocksInLoop;

//
// Test the blockPrinter method
//
public class DrawingPrinter
{
    public static void main(String[] args)
    {
        Drawings blocks = new Drawings();
        blocks.blockPrinter(2, 4);
        
        blocks.blockPrinter(4, 2);
    }
}
