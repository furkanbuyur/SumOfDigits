import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, a = 0, b = 0;


        System.out.print("Enter a number : ");
        number = sc.nextInt();

        while (number != 0) {
            a = number % 10;
            b += a;
            number /= 10;
        }
        System.out.println("Sum of Digits : " + b);
        System.out.println("Happy New Year...Now run the program again ;)");
    }
}
