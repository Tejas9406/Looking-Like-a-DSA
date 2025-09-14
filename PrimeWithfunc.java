import java.util.Scanner;//import java.util.*;

public class PrimeWithfunc {

    public static boolean fun1(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {// i <= num-1;also wrk but it does some,
            if (num % i == 0) {                   //extr stuck leads to more compile time,
                return false;                    //but here we are taking direct root value.
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num to find Primr or not:");
        int b=sc.nextInt();
       System.out.println( fun1(b));
    }

}
