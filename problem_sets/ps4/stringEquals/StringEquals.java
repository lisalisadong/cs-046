package ps4.stringEquals;

/**
 *
 * Complete this method to determine if the string parameter instructor is the same as
 * your Udacity instructor, Cay Horstmann
 */
public class StringEquals
{
   private String firstName = "Cay";
   private String lastName = "Horstmann";

   /**
    * Determines if the instructor given is the instructor in this course, Cay Horstmann
    * @param instructor the name to check
    * @return true if the instructor is Cay Horstmann. False otherwise
    */
   public boolean isMyInstructor(String instructor)
   {
       //fullName contains Cay Horstmann
       String fullName = firstName + " " + lastName;
       // your code goes here
       return instructor.equals(fullName);
   }
}