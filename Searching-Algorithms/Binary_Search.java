public class Binary_Search{
    public static int binarySearch(int array[], int target){
        int left = 0;
        int right = array.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(array[mid] == target){
                return mid;
            } else if(array[mid] > target){
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11};
        int target = 7;
        int result = binarySearch(array, target);
        
        if(result == -1){
            System.out.println("Element not found in array");
        } else{
            System.out.println("Element found at index " + result);
        }
    }
}