public class one_D_array {
    public static void main(String[] args) {
        /*
         * fist we heve to learn about the 1D array 
         * if we want to enter the marks for any subject so we can easily enter
         * the marks 
         */
       // int marks [] =new int [4]; this is also a valid syntax
        //int [] marks =new int [4];

    
        // initialization the value in the array this is the one way of doing this
        // marks[0]=84;
        // marks[1]=89;
        // marks[2]=79;
        // marks[3]=95;

        int []marks ={84,89,79,95};//we can also make an array and initialize the value

        //now we have to print the entered data and this is one way to print the data 

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println();

    /*
     * so when we have large data so we use for_loop to print this
     * and we can also use while_loop and  do_while_loop
     */
    // for(int i=0;i<=4;i++)
    // {
    //     System.out.println(marks[i]);
    // }
    //int i=0;
    // while(i<4)
    // {
    //     System.out.println(marks[i]);
    //     i++;
    // }
    int i =0;
    do {
        System.out.println(marks[i]);
        i++;
    } while (i<4);




    }
    
}
