import java.util.Scanner;

import static java.lang.Math.pow;

public class BMI {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Kilonuzu 'kg' olarak giriniz = ");
        float kilo = inp.nextFloat();

        System.out.print("Boyunuzu 'm' olarak giriniz = ");
        float boy = inp.nextFloat();

        System.out.println("Boy kilo endeksiniz = " + kilo/pow(boy,2));
    }
}
