public class insertion_sort {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];// storing 2nd element of array and 1st element of unsorted array in a temporary
                              // variable
            int prev = i - 1;// element assumed to be sorted already
            while (prev >= 0 && arr[prev] > curr) {// checking condition if last element of sosrted array is greater
                                                   // than first element of unsorted element and so on
                arr[prev + 1] = arr[prev];// pushing the array with one element ahead
                prev--;
            }
            arr[prev + 1] = curr;// inserting the element at right index
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 2, 6, 9, 3, 7, 1, 0, 8 };
        insertionSort(arr);
    }
}
