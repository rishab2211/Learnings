public class String_builder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'd'; ch++) {
            sb.append(ch);
        }
        sb.toString();
        System.out.print(sb);

    }

}
