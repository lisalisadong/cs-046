package ps8.windowGlass;

public class WindowShapeTester
{
   public static void main(String[] args)
   {
       WindowShape shape = new WindowShape(10, 20);
       System.out.printf("%.2f\n",shape.area());
       System.out.println("Expected: 239.27");
       
       shape = new WindowShape(100.0, 300.0);
       System.out.printf("%.2f\n", shape.area());
       System.out.println("Expected: 33926.99");    
       
       System.out.printf("%.2f\n", WindowShape.area(10.0, 20));
       System.out.println("Expected: 239.27");
       
       System.out.printf("%.2f\n", WindowShape.area(100, 300.0));
       System.out.println("Expected: 33926.99");
       
       System.out.printf("%.2f\n", WindowShape.area(100, 100));
       System.out.println("Expected: 13926.99");
       
   }
}