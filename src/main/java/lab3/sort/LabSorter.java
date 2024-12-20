package lab3.sort;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.swap;


public class LabSorter {

    /**
     * Метод для сортировки массива целых чисел.
     *
     * @param source исходный массив для сортировки.
     * @return отсортированный массив
     */
    public int[] sort(int[] source) {
        int[] array = new int[0];{
            boolean sorted = false;
            int temp;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        sorted = false;
                    }
                }
            }
        }
        return array;
    }
}