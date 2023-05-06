package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < height; j++) {
                if ((j >= i && j < height - i && (i < height / 2)) || (j <= i && j > height - i - 2)) {
                    line.append("8");
                } else {
                    line.append(" ");
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        Hourglass s = new Hourglass();
        s.printHourglassOfGivenSize(5);
    }
}
