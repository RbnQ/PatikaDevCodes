import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz = ");
        int r = inp.nextInt();
        System.out.print("Merkez açıyı giriniz = ");
        int a = inp.nextInt();

        double area = (3.14*r*r*a)/360;

        System.out.println("Daire diliminin alanı = " + area);
    }
}
