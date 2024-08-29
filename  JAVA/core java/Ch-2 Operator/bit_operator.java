
public class bit_operator {
  public static void main(String[] args) {

    /*
     * Bitwise operators are used to performing the manipulation of individual bits
     * of a number. They can be used with any integral type (char, short, int,
     * etc.). They are used when performing update and query operations of the
     * Binary indexed trees.
     * 
     * 1. Bitwise OR (|)
     * 
     * This operator is a binary operator, denoted by ‘|’. It returns bit by bit OR
     * of input values, i.e., if either of the bits is 1, it gives 1, else it shows
     * 0.
     * working: if any bit is 1 so bitwise operator gives the result as 1
     * a = 5 = 0101 (In Binary)
     * b = 7 = 0111 (In Binary)
     * 
     * 
     * Bitwise OR Operation of 5 and 7
     * 0101
     * | 0111
     * ________
     * 0111 = 7 (In decimal)
     * 
     * 2. Bitwise AND (&)
     * 
     * This operator is a binary operator, denoted by ‘&.’ It returns bit by bit AND
     * of input values, i.e., if both bits are 1, it gives 1, else it shows 0.
     * 
     * Example:
     * 
     * a = 5 = 0101 (In Binary)
     * b = 7 = 0111 (In Binary)
     * 
     * Bitwise AND Operation of 5 and 7
     * 0101
     & 0111
     * ________
     * 0101 = 5 (In decimal)
     * 
     * 
     * 3.Bitwise XOR (^)
     * 
     * This operator is a binary operator, denoted by ‘^.’ It returns bit by bit XOR
     * of input values, i.e., if corresponding bits are different, it gives 1, else
     * it shows 0.
     * 
     * Example:
     * 
     * a = 5 = 0101 (In Binary)
     * b = 7 = 0111 (In Binary)
     * 
     * Bitwise XOR Operation of 5 and 7
     * 0101
     ^ 0111
     * ________
     * 0010 = 2 (In decimal)
     * 
     * 4. Bitwise Complement (~)
     * 
     * This operator is a unary operator, denoted by ‘~.’ It returns the one’s
     * complement representation of the input value, i.e., with all bits inverted,
     * which means it makes every 0 to 1, and every 1 to 0.
     * 
     * Example:
     * 
     * a = 5 = 0101 (In Binary)
     * 
     * Bitwise Complement Operation of 5
     * 
     * ~ 0101
     * ________
     * 1010 = 10 (In decimal)
     * 
     * 5.leftshift (<<)
     * In left shift we have to move left side 
     * int a =9
     * 9<<1 that 1 represent we have to move one bit left side
     * 9<<2 that 2 reoresent we have to move two bit left side
     *  
     * --------------1001 and we done the operation left shift 9<<1 1 time 
     * -------------10010 and we shift the bit one time in left side
     * 
     * 6. Rightshift (>>)
     * In the rigth shift we have to move rigth side 
     * 9>>1 so here 1 represnt we have to move right side 1 bit 
     * 
     * --------------1001 ans we want to perform the right shift one time 9>>1
     * ---------------100  and after shifting right side the bit look like 
     */

    int a = 9; // 1001 -> 9 can representaion in binary numbers
    int b = 10; // 1010 -> 10 representation in binary numbers

    System.out.println(a | b); //if any bit is on so it return 1
    System.out.println(a & b); // if both bit is one so it return 1 else 0
    System.out.println(a ^ b); // if both bit is one so it return 0 else 1

    System.out.println(~a);  //it just make a complement of the bit
    System.out.println(~b);

    System.out.println(a<<1); //shift the left side
    System.out.println(a>>1); //shift the right side

    System.out.println(b<<1); 
    System.out.println(b>>1);




  }
}
