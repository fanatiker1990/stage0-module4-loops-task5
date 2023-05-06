package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int averageNum = Math.round(sideLength / 2);
        for (int x = 0; x < sideLength; x++) {
            StringBuilder line = new StringBuilder();
            for (int y = 0; y < sideLength; y++) {
                if (x == averageNum || y == averageNum) {
                    line.append("8");
                } else {
                    line.append(" ");
                }
            }
            System.out.println(line);
        }
    }
}
