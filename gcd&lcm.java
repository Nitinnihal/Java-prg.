import java.util.*;
public class gcd&lcm
{
    
    public static void main(String[] args) 
    {
      Scanner scn = new Scanner(System.in);
      int num1 = scn.nextInt();
      int num2 = scn.nextInt();
      int a = num1;
      int b = num2;
      int R = 0;
      while(num1 % num2 > 0)
      {
          R = num1 % num2;
          num1 = num2;
          num2 = R;
      }
      int lcm = (a * b) / R;
      System.out.println(R);
      System.out.println(lcm);
    }
}