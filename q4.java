// 4. WAP to calculate sum of all the numbers divisible by 3 from 0 to n. Print the sum.

import java.lang.*;
import java.util.*;

public class q4
{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number\n");
        int x;
        int sum=0;
        x=s.nextInt();
        int [] arr = new int[ x+1 ] ;
        for(int i=0;i<=x;i++)
        {
            arr[i]=i;
        }

        for(int i=0;i<=x;i++)
        {
            if(arr[i]%3==0)
            {
                sum=sum+arr[i];
            }
        }
        System.out.println("The sum of all the numbers starting from 1 to "+x+"divisible by 3 is = "+sum);}
}