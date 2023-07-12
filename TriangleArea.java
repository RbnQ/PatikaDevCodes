import java.util.Scanner;
import static java.lang.Math.sqrt;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double kenar1, kenar2, kenar3;

        System.out.print("1. kenarın uzunluğunu giriniz = ");
        kenar1 = inp.nextDouble();

        System.out.print("2. kenarın uzunluğunu giriniz = ");
        kenar2 = inp.nextDouble();

        System.out.print("3. kenarın uzunluğunu giriniz = ");
        kenar3 = inp.nextDouble();

        double u = (kenar1 + kenar2 + kenar3)/2;
        double area_sq = u * (u - kenar1) * (u - kenar2) * (u-kenar3);
        double area = sqrt(area_sq);

        System.out.println("Alan = " + area);
    }
}
