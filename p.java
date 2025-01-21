import java.util.Arrays;

public class p {

    public static void main(String[] args) {
        int arr[] = {2, 3, 6, 7, 9};
        int brr[] = {1, 4, 8, 10};
        int k =5;
        int ans [] = new int [arr.length+brr.length];
            
       int j=0;
    //    for(int i=0;i<arr.length;i++){
    //        ans [j++] =arr[i];
    //    }  
    //    System.out.println();
    //    for(int i =0;i<brr.length;i++)
    //    {
    //        ans[j++]=brr[i];
    //    }

    int x =0;

    for (int i = 0; i < ans.length ; i++) {
            
        if(j<arr.length)
        {
        ans[j++] = arr[i];
        }
        else if(x<brr.length)
        {
            ans[j++] = brr[x++];
        }
       
    }


    for (int i : ans) {
        System.out.println(i);
    }
       
       Arrays.sort(ans);
       System.out.println(ans[k-1]);
      
   
    }
}