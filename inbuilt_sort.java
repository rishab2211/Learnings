import java.util.Arrays;//imports packages useful for operations of array
import java.util.Collections;//package contains code of reversing array

public class inbuilt_sort {
    public static void sorting(Integer arr[]) {// sorting with inbuilt method , this can only sort on ascending order

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseSorting(Integer arr1[]) {
        Arrays.sort(arr1, Collections.reverseOrder());// used to sort array in ascending order then reverse it
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");

        }

    }

    public static void sortInrange(Integer arr2[]) {// we have to make the the argument an object
        Arrays.sort(arr2, 0, 5);// used to sort an array from starting index to ending index
        // , in this case we are sorting from index 0
        // to 5
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");

        }
    }

    public static void main(String args[]) {
        Integer arr[] = { 4, 5, 2, 6, 9, 3, 7, 1, 0, 8 };// in order to use collection package we have to change the
                                                         // datatype from int to Integer and hence make it an object
        sorting(arr);
        System.out.println();
        reverseSorting(arr);
        System.out.println();
        sortInrange(arr);

    }

}
