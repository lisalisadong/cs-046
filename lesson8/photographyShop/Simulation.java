package photographyShop;

// DON'T LOOK AT THIS TOO HARD
// This class reads the story and sends the manager information 
// about what happens next. You don't need to learn how Patterns
// and matchers work. They are tools for reading complicated 
// strings and breaking them into pieces. 
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Simulation
{
    
    private static final Pattern meetingPattern = Pattern.compile("^GiveOutAssignments$");
    private static final Pattern newAssignmentPattern = Pattern.compile("([0-9]+) (.*)");
    private static final Pattern hirePattern = Pattern.compile("Photographer (.*)");

    public static void main(String[] args) throws FileNotFoundException 
    {
        System.out.println("This program creates a simulation and reads a story. \n"
            + "As it reads the stories, it calls the corresponding methods in the Simulation");
        Manager manager = new Manager();
        try
        {
            Scanner in = new Scanner(new File("./lesson8/photographyShop/story.txt"));
            
            while (in.hasNextLine())
            {
                String line = in.nextLine();

                Matcher meetingMatcher = meetingPattern.matcher(line);
                Matcher assignmentMatcher = newAssignmentPattern.matcher(line);
                Matcher hireMatcher = hirePattern.matcher(line);
                if (hireMatcher.find())
                {
                    String photographer = hireMatcher.group(1);
                    manager.hire(photographer); // Time to hire a photographer.
                }
                else if (meetingMatcher.find())
                {
                    manager.giveOutAssignments(); // Time to give out assignments.
                }
                else if (assignmentMatcher.find())
                {
                    int priority = Integer.parseInt(assignmentMatcher.group(1));
                    String description = assignmentMatcher.group(2);
                    manager.newAssignment(priority, description); // Found another assignment.
                }
            }
            manager.checkPortfolio(); // Marks the end of the story
        } 
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
    } 
}