package ps9.manager1;

public class ManagerTester
{
   public static void main(String[] args)
   {
       Manager boss = new Manager("Honcho", 500000, 400000);
       System.out.println(boss.getName());
       System.out.println("Expected: Honcho");
       
       System.out.println(boss.getSalary());
       System.out.println("Expected: 500000.0");
       
       System.out.println(boss.getBonus());
       System.out.println("Expected: 400000.0");
       
       boss.setSalary(600000);
       System.out.println(boss.getSalary());
       System.out.println("Expected: 600000.0");
   }
}