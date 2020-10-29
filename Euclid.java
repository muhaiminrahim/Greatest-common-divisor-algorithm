import java.util.*;

public class Euclid
{
    public static void main (String args[])
    {
        Scanner pepeg = new Scanner (System.in);
        System.out.println ("First number: ");
        int num1 = pepeg.nextInt();
        System.out.println ("Second number: ");
        int num2 = pepeg.nextInt();
        System.out.println ("Greatest Common Divisor is " + euclid(num1,num2) );
    }
    
    private static int euclid( int num1, int num2 )
    {
        if (num2 == 0) 
        {
            return num1;
        }
        return euclid(num2,num1%num2);
    }
}