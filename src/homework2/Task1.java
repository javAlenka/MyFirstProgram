package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    //1. Задать массив целых чисел длинной 5 элементов.
//2. Отсортировать числа в массиве
//3. Вывести на экран результат/
//4. Сделать возможность наполнения массива с клавиатуры*.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5]; // Создаем массив из 5 элементов

        // Заполняем массив с клавиатуры
        System.out.println("Введите 5 целых чисел:");
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }

        // Выводим исходный массив
        System.out.println("Исходный массив:");
        printArray(array);

        // Сортируем массив пузырьковой сортировкой
        bubbleSort(array);

        // Сортируем массив быстрой сортировкой
        quickSort(array, 0, array.length - 1);

        // Выводим отсортированный массив
        System.out.println("Отсортированный массив:");
        printArray(array);

    }

    // Метод для пузырьковой сортировки
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Меняем элементы местами
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                // Если не было обменов, массив уже отсортирован
                break;
            }
        }
    }

    // Метод для быстрой сортировки
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Метод для разделения массива и возврата индекса опорного элемента
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Метод для вывода массива
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

