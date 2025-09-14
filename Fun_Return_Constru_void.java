import java.util.*;
public class Fun_Return_Constru_void {
    public static void Calcul(int a,int b)// Parameters\formal params
    {
        System.out.println(a+b);  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Calcul(a,b);// Arguments\Actual parms
       

    }
}
// callByValue=only sends copy of variable,when data's work done java deletes its memory(in java)
// callByRefferance= sends orignal variable,used (in C++) 