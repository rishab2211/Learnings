public class StringCompression {
    public static void compression1(String str) {// MY OWN WRITTEN CODE AND APPROACH HAVING TIME COMPLEXITY O(n) where n
                                                 // is the lenth of the string
        for (char ch = 'a'; ch <= 'z'; ch++) {
            Integer count = 0;
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == ch) {
                    count++;

                }

            }

            if (count == 0) {
                continue;
            } else if (count == 1) {
                System.out.print(ch);
            } else {
                System.out.print(ch + count.toString());
            }
        }
    }

    public static String compression2(String str) {
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if (count > 1) {
                newstr = count.toString(i);
            }
        }
        return newstr;

    }

    public static void main(String args[]) {
        String str = "aaaaabbbbcccdddeeff";
        compression1(str);
        System.out.println();
        System.out.print(compression2(str));

    }

}
