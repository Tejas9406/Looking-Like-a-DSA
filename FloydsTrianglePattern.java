public class FloydsTrianglePattern {
   
    public static void fun (int line){
         int counter=1;
        for(int i=1;i<=line;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+counter);
                counter++;

            }
            System.out.println();
           
            }
        }
    
    public static void main(String[] args) {
        fun(5);
       
    }
    }