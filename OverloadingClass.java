
// overloading only depends on parameters,
//if we given different type(int some()-float sum()),
// java will consider it a same function & give Error.
import java.util.*;

public class OverloadingClass {

    void sum(int a) {// insted try:public static int sum(),to not to crate oblect ovr ,
                     // this function need to create object, cuz we dont used static keyword.
                     // we used void cuz not return any value.
        System.out.println("Your Single number is :" + a);
    }

    int sum(int a, int b) {
        return a + b;

    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float a, float b) {// overload by type-float(same name-paras but diff type)
        return a + b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OverloadingClass ovr = new OverloadingClass();
        System.out.println("Enter Value for a:");

        int a = sc.nextInt();
        ovr.sum(a);
        System.out.println("Sum of two nums :" + ovr.sum(a, 3));
        System.out.println("Sum of three nums :" + ovr.sum(a, 2, 3));
        System.out.println("Sum of float nums :" + ovr.sum(2.2f, 2.2f));
    }
}
