public class Merge_Sort {
    public static void mergeSort(int array[]) {
        int n = array.length;
        if (n < 2) { 
            return;
        }
        int mid = n / 2;
        int left[] = new int[mid];
        int right[] = new int[n - mid];
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, n - mid);
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    public static void merge(int array[], int left[], int right[]){
        int leftSize = left.length, rightSize = right.length;
        int i = 0, j = 0, k = 0;
        while(i < leftSize && j < rightSize){
            if(left[i] < right[j]){
                array[k++] = left[i++];
            }
            else{
                array[k++] = right[j++];
            }
        }
        while(i < leftSize){
            array[k++] = left[i++];
        }
        while(j < rightSize){
            array[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int array[] = {64, 25, 12, 22, 11};
        mergeSort(array);
        for(int num : array){
            System.err.print(num + " ");
        }
    }
}
