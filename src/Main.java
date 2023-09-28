import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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

        System.out.println("Введите имя:");
        String inputName = scanner.nextLine();
        if (inputName.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        int[] myArray = {10, 17, 30, 41, 52, 63, 72, 80, 91, 99};
        System.out.println("Элементы массива кратные 3:");
        List<Integer> result =
                Arrays.stream(myArray)
                        .filter(x -> x % 3 == 0)
                        .boxed()
                        .collect(Collectors.toList());
        System.out.println(result);
    }
}