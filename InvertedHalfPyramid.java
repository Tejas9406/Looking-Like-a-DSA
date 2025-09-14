public class InvertedHalfPyramid {
    public void fn1(int Trows){
        for(int i=1;i<=Trows;i++){
            for(int j=1;j<=Trows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();

        }
    }
    public static void main(String[] args) {
        InvertedHalfPyramid IF=new InvertedHalfPyramid();
        IF.fn1(4);
    }
}
