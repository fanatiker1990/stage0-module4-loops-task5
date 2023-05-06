package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        for (int x = 0; x < sideLength; x++) {
            StringBuilder line = new StringBuilder();
            for (int y = 0; y < sideLength; y++) {
                if ((x == 0||x == sideLength - 1)||(y == 0 || y == sideLength - 1)) {
                    line.append("8");
                } else {
                    line.append(" ");
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        Square s = new Square();
        s.printSquareFrom8s(8);
    }
}
