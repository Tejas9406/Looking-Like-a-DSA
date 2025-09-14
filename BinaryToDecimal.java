import java.util.*;
//decimalForm=dec+[LastDigit*2toThePowOfThatNum]
public class BinaryToDecimal {
    public static void BinTdeci(int binNum){
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int lastDigit=binNum%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println(decNum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter NUM:");
        int Numb=sc.nextInt();
        BinTdeci(Numb);
        
    }
}
