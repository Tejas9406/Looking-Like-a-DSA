import java.util.*;
public class ContinueSt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter Your Number:");
            int num=sc.nextInt();
            if (num%10==0){
                continue;
            }
           System.out.println("Your Num was:"+num); 
       }
            while(true);
        
    }
}
