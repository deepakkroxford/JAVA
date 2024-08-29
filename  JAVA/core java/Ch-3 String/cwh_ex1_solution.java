import java.util.Scanner;
public class cwh_ex1_solution {
public static void main(String[]args) {
	
	float total = 0;
	System.out.println("WELCOME TO THE CBSE PERCENTAGE MAKER");
	Scanner input = new Scanner(System. in);
	System.out.println("Enter Total marks of the subject (Eg: - 100, 80):");
	int total_marks = input.nextInt();
	System.out.print("Enter Marks Of Subject 1:");
	float s1 = input .nextFloat();
	total = total + s1;
	System.out .print("Enter Marks Of Subject 2:");
	float s2 = input .nextFloat();
	total = total + s2;
	System.out.print("Enter Marks Of Subject 3:");
	float s3 = input .nextFloat();
	total = total + s3;
	System.out.print("Enter Marks Of Subject 4:");
	float s4 = input .nextFloat();
	total = total + s4;
	System.out.print("Enter Marks Of Subject 5:");
	float s5 = input .nextFloat();
	total = total + s5;
	float grandTotal = total * 100 / (total_marks*5);
	System.out.println("Your total Percentage = " + grandTotal + " percent");
	
}
}
