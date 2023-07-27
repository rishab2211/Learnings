public class bubble_sort {
    public static void bubble_sorting(int arr[]) {
        int swaps = 0;// used to store and calculate number of swaps
        for (int turns = 0; turns < arr.length - 1; turns++) {// for the length of an array n the number of turns to
                                                              // sort array is n-1
            for (int swap = 0; swap < arr.length - 1 - turns; swap++) {// swap = number of element -1 - number of turns
                                                                       // already happened,
                                                                       // as the greatest element is already sorted and
                                                                       // put at the end of array
                if (arr[swap] > arr[swap + 1]) {
                    int temp = arr[swap];
                    arr[swap] = arr[swap + 1];
                    arr[swap + 1] = temp;
                    swaps++;// variable swap will be updated everytime swapping happened
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print(swaps);
    }

    public static void main(String args[]) {
        int arr[] = { 5, 7, 3, 9, 4, 2, 1, 0, 8 };
        bubble_sorting(arr);

    }

}