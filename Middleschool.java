import java.util.*;

public class Middleschool {
    public static void main (String args[])
    {
        Scanner pepeg = new Scanner (System.in);
        System.out.println ("First number: ");
        int num1 = pepeg.nextInt();
        System.out.println ("Second number: ");
        int num2 = pepeg.nextInt();
        System.out.println ("Greatest Common Divisor is " + middleSchool(num1,num2) );
    }
    
   public static int middleSchool(int m, int n) {
        ArrayList<Integer> primeM = new ArrayList();
        ArrayList<Integer> primeN = new ArrayList();

        while (m % 2 == 0) {
            primeM.add(2);
            m /= 2;
        }

        for (int i = 3; i <= Math.sqrt(m); i += 2) {
            while (m % i == 0) {
                primeM.add(i);
                m /= i;
            }
        }

        while (n % 2 == 0) {
            primeN.add(2);
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                primeN.add(i);
                n /= i;
            }
        }

        if (m > 2) {
            primeM.add(m);
        }

        if (n > 2) {
            primeN.add(n);
        }

        ArrayList<Integer> temp = new ArrayList();
        while (!primeM.isEmpty() && !primeN.isEmpty()) {
            int a = primeM.get(0);
            int b = primeN.get(0);

            if (a == b) {
                temp.add(a);
                primeM.remove(0);
                primeN.remove(0);
            } else if (a < b) {
                primeM.remove(0);
            } else {
                primeN.remove(0);
            }
        }

        if (temp.isEmpty()) {
            return 1;
        }

        int result = temp.remove(0);
        while (!temp.isEmpty()) {
            result = result * temp.remove(0);
        }

        return result;
    }
}
