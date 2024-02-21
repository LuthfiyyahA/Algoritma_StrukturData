public class DragonMain {
    public static void main(String[] args) {
        Dragon naga = new Dragon();
        naga.x = 10;
        naga.y = 10;
        naga.width = 10;
        naga.height = 10;

        naga.printPosition();
        naga.moveLeft();
        naga.moveUp();
        naga.printPosition();
        naga.moveRight();
        naga.moveDown();
        naga.printPosition();
        naga.moveDown();
    }
}
