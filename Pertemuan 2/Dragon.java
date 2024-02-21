public class Dragon {
    int x, y, width, height;

    void moveLeft() {
        x -= 1;
        if (x < 0 || x > width) {
            detectCollision(x, y);
        }
    }

    void moveRight() {
        x += 1;
        if (x < 0 || x > width) {
            detectCollision(x, y);
        }
    }

    void moveUp() {
        y -= 1;
        if (y < 0 || y > height) {
            detectCollision(x, y);
        }
    }

    void moveDown() {
        y += 1;
        if (y < 0 || y > height) {
            detectCollision(x, y);
        }
    }

    void printPosition() {
        System.out.println("Dragon sedang berada di (x,y) : (" + x + ", " + y + ")");
    }

    void detectCollision(int x, int y) {
        System.out.println("Game Over");
    }
}
