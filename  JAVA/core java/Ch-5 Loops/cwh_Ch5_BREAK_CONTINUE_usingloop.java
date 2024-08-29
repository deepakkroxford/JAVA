package firstproject;

public class cwh_Ch5_BREAK_CONTINUE_usingloop {
public static void main(String[] args) {
	
	//BREAK AND CONTINUE USING LOOP
	
//	for(int i=0;i<5;i++)
//	{
//		System.out.println(i);
//		System.out.println("java is great");
//		if(i==3)
//		{
//			System.out.println("ending the loop");
//			break;
//		}
//	}
	
//	int i=0;
//	while(i<5)
//	{
//	System.out.println(i);
//	System.out.println("java is great");
//	if(i==2)
//	{
//		System.out.println("loop is ending");
//		break;
//	}
//	i++;
//	}
	
	// CONTINUE
	
	for(int i =0;i<50;i++)
	{
		if(i==3)
		{
			System.out.println("continue the loop");
			continue;
		}
		System.out.println(i);
		System.out.println("java is great");
		
	}
	
	
}
}
