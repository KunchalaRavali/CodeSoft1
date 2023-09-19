package codeSoft;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Subjects : ");
		int subjects = sc.nextInt();
		
		int marks[] = new int[subjects];
		
		int totalMarks =0;
		for(int i=0; i<subjects ; i++) {
			System.out.println("Enter your Marks for Subject : " + i);
			marks[i] = sc.nextInt();
			 if (marks[i] < 0 || marks[i] > 100) {
	                System.out.println("Invalid marks. Marks should be between 0 and 100.");
	            }
			 else {
				 totalMarks += marks[i];
			 }
	        }
		double average =  (double) totalMarks/subjects;
		System.out.println(average);
		 String grade;
	        if (average >= 90) {
	            grade = "A+";
	        } else if (average >= 80) {
	            grade = "A";
	        } else if (average >= 70) {
	            grade = "B";
	        } else if (average >= 60) {
	            grade = "C";
	        } else if (average >= 50) {
	            grade = "D";
	        } else {
	            grade = "F";
	        }
	        
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Percentage: " + average + "%");
	        System.out.println("Grade: " + grade);
		}
		
}
