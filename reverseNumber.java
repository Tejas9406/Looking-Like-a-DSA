public class reverseNumber {
    public static void main(String[] args) {
     System.out.print("Your reversed no.=");
     
     int num=12345;
    while(num>0)
  {
    int last=num%10;
    System.out.print(+last);
    num/=10;
}}}
