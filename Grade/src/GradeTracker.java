import java.util.Scanner;
import java.io.*;

public class GradeTracker{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
// number of students
        System.out.print("Enter number of students: ");
        int TotalStudents = scan.nextInt();
                
// creating array
        int[] grades = new int[TotalStudents];
        
// entering grades
        System.out.println("Enter grades for " + TotalStudents + " students in integer :");
        for (int i = 0; i < TotalStudents; i++){
            System.out.print("Grade for student " + (i + 1) + ": ");
            grades[i] = scan.nextInt();
        }
        
// calculations (highest lowest average)
        int highest = grades[0], lowest = grades[0], sum = 0;
        for (int grade : grades) {
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
            sum += grade;
        }
        double average = (double) sum / TotalStudents;

// display
        System.out.print("\n\n--- Grade Summary ---");
        System.out.print("\nHighest grade : " + highest);
        System.out.print("\nLowest grade : " + lowest);
        System.out.print("\nAverage grade : " + average);
//scanner close
        scan.close();
    }
}