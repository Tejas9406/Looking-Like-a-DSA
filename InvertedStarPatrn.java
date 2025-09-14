public class InvertedStarPatrn {
    public static void main(String[] args) {
       int n=5;
        for(int i=0;i<=n;i++)//outer loop for howmuch time line to be printed
        {
            for(int j=4;j<=n-i+1;j++)//inner loop for no.of times to print,here i times running
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
   

