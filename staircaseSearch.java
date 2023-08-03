public class staircaseSearch {
    public static int staircaseSearching(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix[0].length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.print("the key " + key + " is found at the position " + "(" + row + "," + col + ")");
                return 1;
            } else if (matrix[row][col] > key) {
                col--;
            } else {
                row++;
            }
        }
        System.out.print("not found !!");
        return 0;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        staircaseSearching(matrix, 37);
    }

}
