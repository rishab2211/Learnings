import java.util.Scanner;

public class linear_search {
    public static void lin_search(int arr[], int key) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == key) {
                System.out.print("the key " + key + " found at " + i + "th position");
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 12, 92, 63, 49, 50, 62, 73, 86, 9, 99 };
        System.out.print("enter the key : ");
        int key = sc.nextInt();
        sc.close();// used to resolve source leak problem in system
        lin_search(arr, key);
    }

}
