package gradebook4;

import java.util.Arrays;

public class GradeBookDemo
{
    public static void main(String[] args)
    {
        GradeBook book = new GradeBook("./predefined/txt/grades.txt");
        String studentComment0 = book.teacherCommentForStudent(0);
        String studentComment1 = book.teacherCommentForStudent(1);
        String studentComment2 = book.teacherCommentForStudent(2);
        
        System.out.println("  Teacher comment for student 0: ");
        System.out.println(studentComment0);
        System.out.println("  Teacher comment for student 1: ");
        System.out.println(studentComment1);
        System.out.println("  Teacher comment for student 2: ");        
        System.out.println(studentComment2);
    }
}
