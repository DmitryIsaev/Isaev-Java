//Составить алгоритм: если введенное число больше 7, то вывести “Привет”;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        try {
            System.out.println("Введите число:");
            String inputString = scanner.nextLine();
            number = Integer.parseInt(inputString);
            if (number > 7) {
                System.out.println("Привет");
            }
        } catch (NumberFormatException error) {
            System.out.println("Введены буквы вместо чисел");
        }
    }
}