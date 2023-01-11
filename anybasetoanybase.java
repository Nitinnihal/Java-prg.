import java.util.*;
  
  public class anybasetoanybase
  {
    public static void main(String[] args) 
  {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b1 = scn.nextInt();
      int b2= scn.nextInt();
      int x = ans(n, b1);
      int y = realans(x, b2);
       System.out.println(y);
   } 
   public static int ans(int n, int b1)
   {
      int num = 0, R = 0, count = 0;
      while(n > 0)
      {
        R = n % 10;
        n = n / 10;
        num = num + R * (int)Math.pow(b1, count);
        count++;
      }
     return num;   
   }
   
   public static int realans(int x, int b2)
   {
       int count = 0, R = 0, finalans = 0;
       while(x > 0)
       {
           R = x % b2;
           x = x / b2;
           finalans = finalans + R * ((int)Math.pow(10,count));
           count++;
       }
     return finalans; 
   }
  }