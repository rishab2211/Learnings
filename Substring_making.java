public class Substring_making {
    public static String Substring(String str, int si, int ei) {// si=starting index , ei=ending index
        String newSubstring = "";
        for (int i = si; i <= ei; i++) {
            newSubstring += str.charAt(i);
        }
        return newSubstring;
    }

    public static void main(String args[]) {
        String str = "RISHABubcoudhcbwhcbwyc";
        System.out.print(Substring(str, 1, 4));// starting index=1 & ending index=4

    }

}
