package ps1.hw01_20_string_replace;

//hw01_09
/*
 * complete the code to replace the first occurence of 'a' with an 'x'
 */
public class ReplacePrinter
{
    public static void main(String[] args)
    {
        String course = "Udacity"; //do not modify this line in any way

        //complete the code to replace the first occurrence of 'a' with an 'x'
        
        course = course.replace('a', 'x');
        System.out.println(course);
    }
}