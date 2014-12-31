package ps6.tripPlan;

/**
   This class tests the TripPlan class.
*/
public class TripPlanTester
{
   public static void main(String[] args)
   {
      TripPlan trip = new TripPlan();

      //call the stubs. Code comiles but nothing happens
      trip.addCity("San Jose");
      trip.addCity("Silicon Valley");
      trip.addCity("Denver");
      trip.addCity("Austin");
      trip.removeCity("Denver");
      trip.reverse();

      System.out.println(trip.toString());
      System.out.println("Expected: TripPlan[Austin,Silicon Valley,San Jose]");
   }
}