package school.mjc.stage0.loops.task5;


public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int y = cathetusLength - 1; y >= 0; y--) {
            System.out.println("8".repeat(Math.max(0, cathetusLength - y)));
        }
    }

}
