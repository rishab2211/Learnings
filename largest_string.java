public class largest_string {
    public static String largest(String str[]) {
        String large = str[0];
        for (int i = 1; i < str.length; i++) {
            if (large.compareTo(str[i]) < 0) {// if large is smaller than the string at ith index of str
                large = str[i];
            }
        }
        return large;
    }

    public static void main(String args[]) {
        String string[] = { "mango", "apple", "pappaya", "pomegranate" };
        System.out.print("the largest string in the array is :" + largest(string));

    }

}
