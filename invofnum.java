import java.util.*;

public class invofnum	// inverse of a number with its position pepcoding question.
{
    public static void main(String[] args)
{
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int inv = 0;
    int count = 0;
    while(n > 0)
    {
        int r = n % 10;
        count++;
        n = n/10;
        
        inv = inv + ((int)Math.pow(10,r - 1)*count);
    }
    System.out.println(inv);
}
}