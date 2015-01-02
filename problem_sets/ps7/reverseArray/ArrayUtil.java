package ps7.reverseArray;

//
// Complete the method in this class. It returns a string with the elements of the array
// in reverse order separated by a space. If the array looks like this [1, 2 ,3 ,4], your
// output will look like this 4 3 2 1
//
public class ArrayUtil
{
  /**
   * Returns a string with the elements of the array in reverse order separated by a space
   * @param values the array to reverse
   * @return the string containing the elements in reverse order
   */
  public String inReverse(int[] values)
  {
      String message ="";
      for (int value : values) //finish the loop header
      {
          // TODO: concatenate the elements to message in reverse order
    	  message = value + " " + message;
      }
      return message;
  }
}