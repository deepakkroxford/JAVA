import java.util.Scanner;

public class one_D_array_user_input {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array");
    int size = sc.nextInt();
    int[] marks = new int[size];//here we take size input from user

    // input
    System.out.println("enter the element");
    for (int i = 0; i < size; i++) {
      marks[i] = sc.nextInt();
      // here we take input in index so it is most important point
    }

    // output
    System.out.println("the entered element is  ");
    for (int i =0; i <size; i++) {

      System.out.println(marks[i]);// this is the way to print the element

    }

    //for finding max element 
    int max = marks[0];
    for(int i = 0; i<size;i++)
    {
      if(max<marks[i]) 
      // if max less than marks[i] element so we make max=marks[i] element
      {
        max=marks[i];
      }
    }
    System.out.println("the max element is ");
    System.out.println(max);

  }
}
