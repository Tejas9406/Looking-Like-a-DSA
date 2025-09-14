import java.util.*;
public class Factorial {
   public static int Fn1(int num){
     
        int fact=1;
        for(int i =1;i<=num;i++){
          fact*=i;//fact=fact*i;
          
   }return fact;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Num:");
            int num=sc.nextInt();
          int fact=  Fn1(num);
        
          System.out.println("Factorial of "+num+" ="+fact);
        }
}
