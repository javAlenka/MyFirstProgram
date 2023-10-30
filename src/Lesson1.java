import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson1 {
//1. Задать массив целых чисел длинной 10 элементов.
//2. Отсортировать числа в массиве
//3. Вывести на экран результат/
//4. Сделать возможность наполнения массива с клавиатуры*.
    public static void main(String[] args) {
        int[] num = new int[10];
        System.out.println("Введите 10 чисел:");
        for (int i = 0; i < num.length; i++) {
            Scanner scanner = new Scanner(System.in);
            num[i]=scanner.nextInt();
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }
}