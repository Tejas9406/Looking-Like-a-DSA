import java.util.Scanner;

public class hollwoRectangle {
    public static void HalloRect(int rows,int cols){
  for(int i=1;i<=rows;i++){
    for(int j=1;j <=cols;j++){
        if(i==1||i==rows||j==1||j ==cols){
            System.out.print("*");
        }
        else{
          System.out.print(" ");  
        }
    }
    System.out.println();
  }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter rows:");
        int Rows=sc.nextInt();
        System.out.println("Entter cols:");
        int Cols=sc.nextInt();
        HalloRect(Rows, Cols);
    }
}
