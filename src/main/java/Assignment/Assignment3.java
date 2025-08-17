package Assignment;

import java.util.Scanner;

public class Assignment3 {
    public static char getGrade(int marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else return 'F';
    }
    public static String getMessage(char grade) {
        if (grade == 'A' || grade == 'B') return "Well done";
        else if (grade == 'C' || grade == 'D') return "Needs improvement";
        else return "Failed";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        char grade = getGrade(marks);
        String message = getMessage(grade);
        System.out.println(grade + " : " + message);
    }
}
