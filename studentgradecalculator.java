import java.util.Scanner;

public class studentgradecalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Take input from the user that how many subject he/she have
        System.out.println("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        //Now we will initialize an array to hold marks and variables for the total marks
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        //Now we will take input from user for each subject to calculate total marks
        for (int i=0; i < numSubjects; i++){
            System.out.println("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();

            //Now we will check if the marks eneterd are within the valid range
            if (marks[i] < 0 || marks[i] > 100){
                System.out.println("Invalid marks entered. please enter the value between 0 and 100.");
                return; // exit if invalid input
            }

            totalMarks += marks[i];
        }

        //Calculate total percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        //Now we will determine grade based on average percentage
        String grade;
        if (averagePercentage >= 90){
            grade = "A";
        }else if (averagePercentage >= 80){
            grade = "B";
        }else if (averagePercentage >= 70){
            grade = "C";
        }else if (averagePercentage >= 60){
            grade = "D";
        }else if (averagePercentage >= 50){
            grade = "E";
        }else {
            grade = "F";
        }

        // Now we will display the results
        System.out.println("\n--- Student Grade Summary ---");
        System.out.println("Total Marks: " + totalMarks + "/" + (numSubjects * 100));
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " +grade);

        //Now we will close the scanner class
        scanner.close();
    }
}