
public class cwh_ch6_Multidimensional_Arrays {
public static void main(String[] args) {
	
	// int []marks; //it is a 1-D array
	
	 // it is a 2-D array
	int [][]flats =new int [2][3];
	flats[0][0]=101;
	flats[0][1]=102;
	flats[0][2]=103;
	flats[1][0]=201;
	flats[1][1]=202;
	flats[1][2]=203;
	
	//Displaying the 2-d array (for loop)
	
	System.out.println("printing 2-D array using for loop");
	System.out.println(flats.length);
	for(int i=0 ;i<flats.length;i++)
	{
		for(int j=0;j<flats[i].length;j++)
		{
			System.out.print(flats[i][j]);
			System.out.println(" ");
		}
		System.out.println("");
	}
	
	
	
}
}