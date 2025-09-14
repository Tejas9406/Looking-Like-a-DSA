import java.util.*;
public class HollowREctPractice {

    public static void hollowRect(int TotalRows,int TotalCols){
        for(int i=1;i<=TotalRows;i++){
            for(int j=1;j<=TotalCols;j++){
                if(i==1||i==TotalRows||j==1||j==TotalCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
        
            }
            System.out.println();

        }
    }
    public static void hollowRect2(int TotalRows,int TotalCols){
        for(int i=1;i<=TotalRows;i++){
            for(int j=1;j<=TotalCols;j++){
                if(i==1||i==TotalRows||j==1||j==TotalCols){
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
        System.out.println("Enter Rows:");
        int rows=sc.nextInt();
        System.out.println("Enter Cols:");
        int cols=sc.nextInt();
        hollowRect(rows, cols);
        hollowRect2(rows, cols);
    }
}
