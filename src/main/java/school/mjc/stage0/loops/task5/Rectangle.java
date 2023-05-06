package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {

        for (int x = 0; x < height; x++) {
            StringBuilder line = new StringBuilder();
            for (int y = 0; y < length; y++) {
                if ((x == 0 || x == height - 1) || (y == 0 || y == length - 1)) {
                    line.append("8");
                } else {
                    line.append(" ");
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        Rectangle s = new Rectangle();
        s.printRectangleFrom8s(5, 5);
    }
}
