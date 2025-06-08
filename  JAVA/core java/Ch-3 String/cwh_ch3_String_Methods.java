
public class cwh_ch3_String_Methods {
public static void main(String[]args) {
//	Scanner sc =new Scanner(System.in);
//	String st= sc.nextLine();
//	System.out.println(st);
//	
	/*
	 * this is the way we take input from the user
	 */
	 
	String a="Aman singh";
	int value=a.length();
	System.out.println(value);
	/*x
	 * so if you want to print the length of string
	 * so we have to do name.length()
	 */
	String lstring=a.toLowerCase();
	System.out.println(lstring);
	/*
	 * so in this case we change the string upper case to lower case
	 * for example ->> Aman singh change in  to aman singh
	 */
	
	 String ustring=a.toUpperCase();
	 System.out.println(ustring);
	/*
	 * upstring is a name of string we can write any other name as per our choice
	 * so in this case we change the string lower case to upper case
	 * for example -->> Aman singh change in to AMAN SINGH
	 */
	
	String b = "     Deepak   ";
	System.out.println(b);
	/*
	 * in this case we print the string with space
	 */
	 System.out.println(b.trim());
	/*
	 * in this case we use trim() method to avoid the spaces
	 */
	
	String c = "DEEPAK";
	System.out.println(c.substring(1));
	/*
	 * in this case we use name.substring(1)
	 * so it remove the 1 index and print after that
	 * like = we got the output->> EEPAK
	 */
	System.out.println(c.substring(1,4));
	/*
	 * so in this method  we are doing the start and end operation
	 * so  start will included but end is not included
	 * so we giving the start 1 and end is 4
	 * so our output is EEP
	 * 
	 */
	System.out.println(c.startsWith("ar"));
	/*
	 * so in this method it return true or false
	 * it check the given string start with ar or not 
	 * so in this case it no start with ar so our output is false
	 * 
	 */
	System.out.println(c.endsWith("PAK"));
	/*
	 * so in this method it is opposite to start with end
	 * it check the the string is ends with given condition
	 * and give the output true or false
	 * so in our case it is true
	 */
	System.out.println(c.charAt(0));
	/*
	 * in this method it print the specific given index
	 * we are give the index 0
	 * so our output is D
	 */
	System.out.println(c.indexOf("P"));
	/*
	 * so in this method it return the index number 
	 *  of the given string
	 */
	System.out.println(c.equalsIgnoreCase("deepak"));
	/*
	 * in this method it check the given string is match 
	 * or not.it does not check it is lower or upper case
	 * if it is same it return same
	 */
	
	System.out.println("I am escape sequence \n i am backslash n ");
	
	
	
	
	
}
}
