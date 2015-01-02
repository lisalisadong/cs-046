package gradebook2;

// BlueJ project: lesson7/gradebook2

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
     * in a completely filled array.
     * @return a filled array of the total for each student.
     */
    public double[] totalsForAllStudents()
    {
        // YOUR CODE HERE
        // Implement this method.
    	double[] gradesSum = new double[numStudents];
    	for (int i = 0; i < numStudents; i ++)
    	{
    		for (double score : grades[i])
    		{
    			gradesSum[i] = gradesSum[i] + score;
    		}
    	}
    	return gradesSum;
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