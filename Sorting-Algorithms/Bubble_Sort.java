public class Bubble_Sort {
    public static void bubbleSort(int array[]){
        int n = array.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(array[j + 1] < array[j]){
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {64, 25, 12, 22, 11};
        bubbleSort(array);
        for(int num : array){
            System.out.print(num + " ");
        }
    }
}
