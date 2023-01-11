import java.util.*;
    
    public class digitofnum
    {
    
    public static void main(String[] args)
    {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int temp = n;
       int count = 0;
       
       while(temp > 0)
       {
         temp = temp/10;
         count++;
       }
       int divisor = (int)Math.pow(10, count - 1);
       while(divisor > 0)
       {
           int q = n/divisor;
           System.out.println(q);
           n = n % divisor;
           divisor = divisor/10;
       }
    }
    }