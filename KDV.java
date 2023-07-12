import java.util.Scanner;
public class KDV {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double kdv = 0;

        System.out.print("Ürün tutarını giriniz = ");
        double price = inp.nextDouble();
        if (price > 0 && price < 1000) {
            kdv = 0.18;
        } else if (price > 1000) {
            kdv = 0.08;
        } else{
            System.out.println("Geçersiz Tutar Girdiniz!");
        }
        System.out.println("KDV Tutarı = " + (price * kdv));
        System.out.println("KDV'li Fiyat = " + (price + price * kdv));
    }
}
