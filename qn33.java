// 3. WAP to enter ‘n’ numbers from command line and find 
// minimum, maximum, average, and standard deviation of these list of 
// numbers. 
import java.util.*;


public class qn33{
    public static void main(String[] args)
    {

        int max=0;
        int min=0;
        int sum=0;
        double average;


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
    
}
}