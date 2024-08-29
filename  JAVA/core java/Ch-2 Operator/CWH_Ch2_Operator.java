public class CWH_Ch2_Operator {
	public static void main(String[] args) {
		// Arithmetic operator

		int a = 34;
		// int b = a*6;
		// 4.8%1.1 ---->return decimal remainder

		// Assignment operator

		int b = 24;
		b *= 4; // so this is increase the value of b 4 times
		System.out.println("number is " + b);

		// comparision operators

		System.out.println(6 == 25); // in this case we compare 6 is equal to 25 so its return false
		System.out.println(6 > 4);
		System.out.println(6 < 4);

		// logical operator

		System.out.println(6 > 4 && 6 > 3);
		// in this case we use logical operator so the output is true because the both
		// given condition is true
		// if any get false the output we get is false
		System.out.println(6 > 5 || 6 < 3);
		// in this case we have output is true so in OR operator if any one condition
		// gets true we got true output

		// single equal to = is used for assigning the value
		// double equal to == is used for compare the given value

	}
}
