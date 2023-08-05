public class Shortest_path {
    public static double CalculatingShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {

            int dir = path.charAt(i);
            if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'W') {
                x--;
            }

        }
        int X2 = x * x;
        int Y2 = y * y;
        double shortestPath = Math.sqrt(X2 + Y2);// calculating the shortest path from origin with the help of
                                                 // distance formula =sqrt((x2^2-x1^2)+(y2^2-y1^2))

        return shortestPath;

    }

    public static void main(String args[]) {
        String path = "NNWWNNEENNWW";
        double result = CalculatingShortestPath(path);
        System.out.print("the shortest path from origin is : " + result);

    }
}