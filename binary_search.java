public class binary_search {
    public static int bin_search(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;// with this method of calculating mid value INTEGER OVERFLOW can happen
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static int Modified_binary_search(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;// with this INTEGER OVERFLOW CAN BE PREVENTED
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 9;
        System.out.println("the index of key is : " + bin_search(arr, key));
        int key1 = 7;
        System.out.print("the index of key is : " + Modified_binary_search(arr, key1));

    }

}
