// 3. WAP to enter ‘n’ numbers from command line and find 
// minimum, maximum, average, and standard deviation of these list of 
// numbers. 
import java.util.*;
import java.lang.Math;


public class qn303{
    public static void main(String[] args)
    {

        double max=0;
        double min=0;
        double sum=0;
        double average=0;

        double std=0;
        double standard_deviation=0;


        System.out.println("Argument count: " + args.length);
        for (int i = 0; i < args.length; i++) 
        {
          System.out.println("Argument " + i + ": " + args[i]);
          max=Integer.parseInt(args[0]);
          min=Integer.parseInt(args[0]);
          if(Integer.parseInt(args[i])>max)
          {
            max=Integer.parseInt(args[i]);
          }
          if(Integer.parseInt(args[i])<min)
          {
            min=Integer.parseInt(args[i]);
          }
          sum+=Integer.parseInt(args[i]);
        }

        average=(sum/args.length);

        for(int i=0;i<args.length;i++)
        {
            std+=Math.pow((Integer.parseInt(args[i])-average),2);
			System.out.println("\n The Standard mean = "+std);
        }
		System.out.println("\n The Standard mean = "+std);
        standard_deviation=Math.pow(std,0.5);
		System.out.println(std);
        System.out.println("Max number = "+max+"\nMin number = "+min+"min\n"+"Sum of numbers = "+sum+"\n Average = "+average+" The standard deviaiton = "+ standard_deviation);
    
}
}