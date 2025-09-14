import java.util.Scanner;

public class EnterNoUntilMultipleOf10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            int num=sc.nextInt();
             if(num % 10==0){
            break;}
        
        System.out.println(num);}
        while(true);
               
        
    }
}
//got error of curly breces , andi cant given {}after if()