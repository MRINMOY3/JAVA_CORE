//2. WAP to accept 10 numbers from command line and check how 
//many of them are even and how many odd. 
//2. WAP to accept 10 numbers from command line and check how 
//many of them are even and how many odd. 
import java.util.*;
import java.lang.*;

public class qn32{
    public static void main(String[] args)
    {
        int [] arr = new int[13] ;
        int [] evenarray = new int[13] ;
        int count=0;
        arr[0]= Integer.parseInt(args[0]);
        arr[1]= Integer.parseInt(args[1]);
        arr[2]= Integer.parseInt(args[2]);
        arr[3]= Integer.parseInt(args[3]);
		arr[4]= Integer.parseInt(args[4]);
        arr[5]= Integer.parseInt(args[5]);
		arr[6]= Integer.parseInt(args[6]);
        arr[7]= Integer.parseInt(args[7]);
		arr[8]= Integer.parseInt(args[8]);
        arr[9]= Integer.parseInt(args[9]);
		


        for(int i=0;i<10;i++)
        {
            if(arr[i]%2==0)
            {
                evenarray[i]=arr[i];
                count++;
            }
        }
		System.out.println("No of even no = "+count+"No of odd numbers = "+(10-count));
    }
}