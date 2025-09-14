import java.util.*;

public class DecimalToBinary {

    public static void DecToBin(int num) {
int pow=0;
int BinNum=0;
while(num>0){
    int Remainder=num%2;
    BinNum=BinNum+(Remainder*(int)Math.pow(10,pow));
    pow++;
    num/=2; //num=num/2;
}
System.out.println(BinNum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Decimal No.:");
        int number=sc.nextInt();
        DecToBin(number); 
    }
}