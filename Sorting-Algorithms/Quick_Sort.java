public class Quick_Sort {
    public static void quickSort(int array[]){
        int n = array.length;
        if(n <= 1){
            return;
        }
        int pi_index = partition(array);
        quickSort();

    }

    public static int partition(int array[]){
        int n = array.length;
        int pivot = array[0];
        int i = 1;
        int j = 1;
        while(j < n){
            if(array[j] < pivot){
                swap(array[i], array[j]);
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        i--;
        swap(array[i], array[0]);
        return i;
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = a;
    }
}
