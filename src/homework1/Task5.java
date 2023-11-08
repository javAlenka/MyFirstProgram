package homework1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task5 {
    // Написать код для зеркального переворота массива (1,2,3,4) -> (4,3,2,1).
        public static void main(String[] args) {
            int[] originalArray = {1, 2, 3, 4};
            Deque<Integer> deque = new ArrayDeque<>(); //двусторонняя очередь
            // Заполняем очередь Deque элементами из исходного массива
            for (int i : originalArray) {
                deque.add(i); // каждый элемент добавляется в конец очереди с помощью метода add
            }

            // Создаем новый массив и извлекаем элементы из очереди в обратном порядке
            int[] reversedArray = new int[originalArray.length];
            int index = 0;
            while (!deque.isEmpty()) {   //проверяем,что очередь не пуста
                reversedArray[index++] = deque.removeLast();//удаление с конца очереди
            }
            System.out.print("Зеркально перевернутый массив: ");
            for (int i : reversedArray) {
                System.out.print(i + " ");
            }
        }
    }

