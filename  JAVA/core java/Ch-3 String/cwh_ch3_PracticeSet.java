public class cwh_ch3_PracticeSet {
public static void main(String[]args) {
	
	// write a program to convert upper string to lower string
	String a = "DEEPAK KUMAR SINGH";
	System.out.println(a);
	String lstring=a.toLowerCase();
	System.out.println(lstring);
	
	// write a java program to replace space with underscore
	
	String name="My name is Aman Singh";
	name=name.replace( " ", "_"); //this is the method to replace the string 
	System.out.println(name);
	
	/*problem 3
	 * write a java program to fill in a letter template
	 * which looks like below
	 * letter = "Dear <|name|>,Trans a lot"
	 * Replace <|name|> with a string (some name)
	 */
	
	String letter ="Dear <|name|>, Thanks a lot";
	letter = letter.replace( "<|name|>", "Deepak");
	System.out.println(letter);
	
	/*problem 4
	 * Write a java program to detect double and triple spaces
	 * in the string
	 */
	
	String c ="Hi  how are   you";
	System.out.println(c.indexOf("  "));
	System.out.println(c.indexOf("   "));
	
	/*problem 5
	 * Write a program to format the following letter using
	 * escape sequence character
	 * letter = "Dear Deepak, This java Course is nice Thanks"
	 */
	 String myletter ="Dear Deepak,\n\t This java Course is Nice.\n Thanks!";
	 System.out.println(myletter);
	
}
}
