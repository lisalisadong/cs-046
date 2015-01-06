package ps9.manager2;

public class ManagerTester
{
   public static void main(String[] args)
   {
       Manager boss = new Manager("Honcho", 500000, 400000);
       
       System.out.println(boss.getSalary());
       System.out.println("Expected: 900000.0");
       
       boss.setSalary(600000);
       System.out.println(boss.getSalary());
       System.out.println("Expected: 1000000.0");
   }
}