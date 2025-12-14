package ro.info2048.execution_control.do_while_statement;

import java.util.Random;

public class RoadRunner {
    public static final int EDGE = 4;
    static Random random = new Random();
    static int position = random.nextInt(5); // 0-4

    public static void main(String[] args) {
        System.out.println("Initial position: " + position);
        while (checkEdge()) {
            step();
        }
    }

    static boolean checkEdge() {
        if (position > EDGE) {
            System.out.println("CRASH!");
        }
        return EDGE > position;
    }

    static void step() {
        System.out.print(position + " -> ");
        position++;
        System.out.println(position);
    }
}
