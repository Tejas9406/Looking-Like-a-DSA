import java.util.*;

public class BinomealCoefficient {// formula of BC=factN/factR*FactOf(R-N)[See on google if need]
  public static int Fn1(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact *= i;// fact=fact*i;
    }
    return fact;
  }

  public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter n:");
            int n=sc.nextInt();
          int factOfN=  Fn1(n);
          System.out.println("Enter r:");
            int r=sc.nextInt();
          int factOfR=  Fn1(r);
          int N_R=n-r;
          int factOfN_R= Fn1(N_R);
       
       int FinalBC=factOfN/(factOfR*factOfN_R);
          System.out.println("Factorial of n="+n+" ="+factOfN);
          System.out.println("Factorial of r="+r+" ="+factOfR);
          System.out.println("Factorial of R-N="+N_R+" ="+factOfN_R);
         System.out.println("Binomial Coeficient of "+n+" & "+r+" ="+FinalBC);
        }
}
