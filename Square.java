import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find its square:");
        double number = scanner.nextDouble();
        double square = number * number;
        System.out.println("The square of " + number + " is: " + square);
        scanner.close();
    }
}
