package ps6.reverseOrderPrint;

import java.util.ArrayList;
public class ArrayListPrinter
{
   public static void main(String[] args)
   {
       ArrayList<String> cities = new ArrayList<String>();
       cities.add("Chicago");
       cities.add("Dallas");
       cities.add("San Jose");
       cities.add("Seattle");     
       
       ReversePrinter printer = new ReversePrinter();
       printer.reversePrint(cities);
       
       cities.add("Denver");
       printer.reversePrint(cities);
   }
}