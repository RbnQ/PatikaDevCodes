import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        double number1, number2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.print("İşlem seçin: +, -, *, / => ");
        char operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("İlk sayıyı giriniz");
        number1 = input.nextDouble();

        System.out.println("İkinci sayıyı giriniz");
        number2 = input.nextDouble();

        switch (operator) {

            // performs addition between numbers
            case '+' -> {
                result = number1 + number2;
                System.out.println(result);
            }

            // performs subtraction between numbers
            case '-' -> {
                result = number1 - number2;
                System.out.println(result);
            }

            // performs multiplication between numbers
            case '*' -> {
                result = number1 * number2;
                System.out.println(result);
            }

            // performs division between numbers
            case '/' -> {
                result = number1 / number2;
                System.out.println(result);
            }
        }
    }
}
