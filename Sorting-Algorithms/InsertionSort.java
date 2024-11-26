public class InsertionSort {
    public static void insertionSort(int array[]){
        int n = array.length;
        for(int i = 1; i < n; i++){
            int key = array[i];
            int j = i - 1;
            while(j >= 0 && key < array[j]){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int array[] = {64, 25, 12, 22, 11};
        insertionSort(array);
        for(int num : array){
            System.out.print(num + " ");
        }
    }
}
