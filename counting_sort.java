public class counting_sort {
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {// finding largest value to create an frequency array
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];// +1 because we have to iterate and include 0 index as well
        for (int i = 0; i < arr.length; i++) {// iterating till the largest value times
            count[arr[i]]++; // in this every element taken at the count index itself and keeps updating in
                             // order to get its right frequency in the array
        }
        // sorting
        int j = 0;// making additional iterator index
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {// means this loop will run until the element of an array count containing
                                  // frequencies is greater than 0
                arr[j] = i;// with this the elements at the index of original array is keep updating and
                           // sorting out with the element of the count frequency array
                j++;
                count[i]--;

            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 2, 6, 9, 1, 2, 6, 4, 3, 7, 1, 0, 8 };
        countingSort(arr);
    }

}
