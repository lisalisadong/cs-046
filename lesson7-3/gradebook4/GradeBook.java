package gradebook4;

// BlueJ Project: Lesson7/GradeBook4
    
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeBook
{
    private ArrayList<String> students;
    private int numStudents;
    private ArrayList<String> topics;
    private int numTopics;
    private double[][] grades;

    public GradeBook(String file)
    {
        students = new ArrayList<String>();
        topics = new ArrayList<String>();
        readScoresFromFile(file);
    }
    
    public String teacherCommentForStudent(int studentIndex)
    {
        // YOUR CODE HERE
        // What would a personalized comment look like for the student
        // at studentIndex? 
        // You can use the students instance variable to get the student
        // names, for example: 
        String studentName = students.get(studentIndex);
        // You can use the topics variable to get the topic names, for example
        String firstTopic = topics.get(0);
        
        // There are many right answers here so I won't try to grade you 
        // on this question. 
        // Check out GradeBookDemo.java (It is visible in the bluej project
        // and visible in another tab in the Udacity IDE) to find out how the
        // teacherCommentForStudent method is called. 
        
        // When you test run this program, the GradeBookDemo will run
        // and will print out student comments for three students. What do
        // you think of the comments your program generated?
        
        // You can look at grades.txt to check that a comment makes sense
        // for a student. The students names are listed first, 
        // then the topic names
        // then the grades. 
        // Each row has one student's grades for each topic. 
        // The first row holds the first student's grades (in this case, the 
        // First student should be Tom). 
        String best = "";
        String worst = "";
        String comment1 = "";
        String comment2 = "";
        for (int i = 0; i < numTopics; i ++)
        {
        	if (grades[studentIndex][i] >= 9)
        	{
        		best = best + topics.get(i) + ", ";
        	}
        	if (grades[studentIndex][i] < 6)
        	{
        		worst = worst + topics.get(i) + ", ";
        	}
        }
        if (!best.equals(""))
        {
        	comment1 = "You did very well on " + best.substring(0, best.length() - 2) + "! ";
        }
        if (!worst.equals(""))
        {
        	comment2 = "You should study harder on " + worst.substring(0, worst.length() - 2) + ".";
        }
        if (best.equals("") && worst.equals(""))
        {
        	comment2 = "You are doing well. However I believe you could do better if you study harder.";
        }
        
        return studentName + ": " + comment1 + comment2;
    }

    /**
     * Adds up all the scores for one student and returns the result.
     * Only works for a valid student index.
     * @param studentIndex the row for the student whose total you want.
     * @return the sum of that student's scores, or -1 if the index is bad.
     */
    public double totalForStudent(int studentIndex)
    {
        if (studentIndex < 0 || studentIndex >= numStudents)
        {
            return -1;
        }
        double sum = 0;
        for (int j=0; j < numTopics; j++)
        {
            sum = sum + grades[studentIndex][j];
        }
        return sum;
    }

    /**
     * Calculates the totals for all the students and returns the results
     * in a completely filled array. The order of the totals matches the
     * order of the names in studentNames.
     * @return a filled array of the total for each student.
     */
    public double[] totalsForAllStudents()
    {
        double[] totals = new double[numStudents];
        for (int student = 0; student < numStudents; student++)
        {
            totals[student] = totalForStudent(student);
        }
        return totals;
    }

    /**
     * Calculates the column totals (the sum of of all students'
     * scores for one topic) for all topics in a completely filled array.
     * The order of the topcs matches the order of the topic names in
     * topicNames.
     * @return a filled array of the total for each topic.
     */
    public double[] totalsForAllTopics()
    {
        double[] topicTotals = new double[numTopics];
        for (int topic = 0; topic < numTopics; topic++)
        {
            double topicTotal = 0;
            for (int student = 0; student < numStudents; student++)
            {
                topicTotal = topicTotal + grades[student][topic];
            }
            topicTotals[topic] = topicTotal;
        }
        return topicTotals;
    }

    // This method reads the scores from the file. Don't look inside.
    private void readScoresFromFile(String file)
    {
        try
        {
            Scanner in = new Scanner(new FileReader(file));
            Scanner firstLineScanner = new Scanner(in.nextLine());
            while (firstLineScanner.hasNext())
            {
                students.add(firstLineScanner.next());
            }
            Scanner secondLineScanner = new Scanner(in.nextLine());
            while (secondLineScanner.hasNext())
            {
                topics.add(secondLineScanner.next());
            }

            numStudents = students.size();
            numTopics = topics.size();
            grades = new double[numStudents][numTopics];
            for (int i = 0; i < numStudents; i++)
            {
                for (int j = 0; j < numTopics; j++)
                {
                    grades[i][j] = in.nextDouble();
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found: " + file);
        }
    }
}