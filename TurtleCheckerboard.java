public class TurtleCheckerboard {
    public static void main(String[] args) {
        World w = new World(500,500);
        Turtle tom = new Turtle(w);
        tom.penUp();
        tom.moveTo(50,50);
        tom.setHeading(0);
        tom.penDown();

        for (int y = 0; y <= 4; y++) {
            for (int x = 0; x < 4; x++){
            tom.drawSquare();
            tom.turn(90);
            tom.penUp();
            tom.forward(100);
            tom.turn(270);
            tom.penDown();
        }
        int axisY = (y * 100 + 50);
        tom.penUp();
        tom.moveTo(50, axisY);
        tom.penDown();
        tom.setVisible(false);
    }
}
}






