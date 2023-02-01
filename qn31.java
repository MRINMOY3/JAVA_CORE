//1. WAP to find the largest among 3 numbers user entered nos. at 
//the command prompt using Java.
import java.lang.*;
import java.util.*;

public class qn31
{
    public static void main(String [] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter three numbers \n");
        double x,y,z;
        x=s1.nextDouble();
        y=s1.nextDouble();
        z=s1.nextDouble();
        double max=0;
        if( x >= y && x >= z)
            System.out.println(x + " is the largest number.");

        else if (y >= x && y >= z)
            System.out.println(y + " is the largest number.");

        else
            System.out.println(z + " is the largest number.");
    }
}