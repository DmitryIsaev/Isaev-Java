//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные "3".
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
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
