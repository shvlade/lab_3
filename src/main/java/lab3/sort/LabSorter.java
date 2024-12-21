package lab3.sort;


public class LabSorter {

    /**
     * Метод для сортировки массива целых чисел.
     *
     * @param source исходный массив для сортировки.
     * @return отсортированный массив
     */
    public int[] sort(int[] source) {
        int len = source.length;
        for (int right = len - 1; right >= 1; right--) {
            for (int left = 0; left < right; left++) {
                if(source[left] > source[left +1]){
                    int temp = source[left];
                    source[left] = source[left +1];
                    source[left +1] = temp;
                }
            }
        }
        return source;
    }
}