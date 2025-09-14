public class StarPatternRightAngle {
    public static void main(String[] args) {
        for(int i=0;i<=6;i++)//outer loop for howmuch time line to be printed
        {
            for(int j=1;j<=i;j++)//inner loop for no.of times to print,here i times running
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
