import java.util.*;

public class ConsecutiveIntegerChecking {
    public static void main (String args[])
    {
        Scanner pepeg = new Scanner (System.in);
        System.out.println ("First number: ");
        int num1 = pepeg.nextInt();
        System.out.println ("Second number: ");
        int num2 = pepeg.nextInt();
        System.out.println ("Greatest Common Divisor is " + consecutiveCheck(num1,num2) );
        
    }
    
   public static int consecutiveCheck(int m, int n) 
   {
        int t;

        if (m < n) {
            t = m;
        } else {
            t = n;
        }

        while (true) 
        {
            if (m % t == 0) 
            {
                if (n % t == 0) 
                {
                    return t;
                }
            }
            t--;
        }
    }
}