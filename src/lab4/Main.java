package lab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Введите А");
            double a = input.nextDouble();

            System.out.println("Введите В");
            double b = input.nextDouble();

            System.out.println("Введите С");
            double c = input.nextDouble();
            Triagle triagle = new Triagle(a,b,c);

            triagle.toShowInfo();

            System.out.println(triagle.getPerimetr());

            /*triagle.showDegree();*/
        }catch (Exception e){
            System.err.println(e.getMessage());
        }


    }
}
