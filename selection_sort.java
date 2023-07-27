public class selection_sort {
    public static void ascending_order(int arr[]) {
        int swaps = 0;
        for (int i = 0; i < arr.length - 1; i++) {// this loop represents number of turns loop has to iterate the array
            int minPos = i; // this represents the current index of element which is being compared with
                            // oher
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {// this condition helps to put greatest element at the last position and
                                           // hence give sorted ascending order array
                    minPos = j;// if current element is greater than the ahead element then replace it with
                               // ahead element index
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
            swaps++;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println("swaps : " + swaps);
    }

    public static void descending_order(int arr[]) {// this code is same expect the if condition in this block of code
                                                    // this will give descending order array
        int swaps = 0;
        for (int i = 0; i < arr.length - 1; i++) {// this loop represents number of turns loop has to iterate the array
            int minPos = i; // this represents the current index of element which is being compared with
                            // oher
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] < arr[j]) {// this condition helps to put greatest element at the last position and
                                           // hence give sorted descending order array
                    minPos = j;// if current element is greater than the ahead element then replace it with
                               // ahead element index
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
            swaps++;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println("swaps : " + swaps);
    }

    public static void main(String args[]) {
        int arr[] = { 3, 6, 2, 7, 9, 4, 5, 1, 0 };
        ascending_order(arr);
        descending_order(arr);
    }

}
