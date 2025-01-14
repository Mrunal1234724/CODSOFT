import java.util.Scanner;

public class gradecalculatorrr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Total number of subjects
        int numSubjects = 5;
        int[] marks = new int[numSubjects];
        

        // Input marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
        }

        //Calculate total marks
        int totalMarks = 0;
        for (int mark : marks) {
        totalMarks += mark;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;
   
        // Grades determination 
        char grade;
        if (averagePercentage >= 85) {
            grade = 'A';
        } else if (averagePercentage >= 70) {
            grade = 'B';
        } else if (averagePercentage >= 60) {
            grade = 'C';
        } else if (averagePercentage >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

         // Display results
         System.out.println("\nResults:");
         System.out.println("Total Marks: " + totalMarks);
         System.out.println("Average Percentage: " + averagePercentage + "%");
         System.out.println("Grade: " + grade);

         //close the scanner object
         scanner.close();
    }
}

