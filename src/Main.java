import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;


class HelloWorld {


    public static long factorialUsingForLoop(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {

        System.out.print("Beginning value: \n");
        Scanner scan = new Scanner(System.in);
        int begnumber = scan.nextInt();
        System.out.print("Ending value: \n");
        int endnumber = scan.nextInt();
        System.out.print("Step: \n");
        int step = scan.nextInt();
        System.out.print("Accuracy: \n");
        int acc = scan.nextInt();
        System.out.print("  x  |  cos(x) \n");
        System.out.print("--------------- \n");
        while (begnumber <= endnumber) {
            double ans = 0;
            for (int i = 0; i <= acc; i++) {
                ans = ans + (pow(-1, i) * pow(begnumber * PI / 180, 2 * i) / factorialUsingForLoop(2 * i));
            }
            System.out.print(begnumber + ",   " + ans + "\n");
            begnumber = begnumber + step;
        }


    }

}