package prog.AutoQA.Lessons_2;

import java.util.Collections;

public class Main {
    private enum Direction {
        UP {
            public int step() { return 1; }
        },
        DOWN {
            public int step() { return -1; }
        };

        public abstract int step();
    }

    private void draw(int height, int size, Direction direction) {
        if(height == size) direction = Direction.DOWN;
        System.out.println(String.join("", Collections.nCopies(size, "*")));
        if(direction == Direction.DOWN && size == 1) return;
        draw(height, size + direction.step(), direction);
    }

    public void consoleDrawTriangle (int height) {
        draw(height, 1, Direction.UP);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.consoleDrawTriangle(5);
    }
}

