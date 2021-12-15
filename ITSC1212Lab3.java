import java.awt.Color;

public class ITSC1212Lab3 {
    public static void main(String[] args) {
        //World w = new World(100, 100);
        //Turtle tom = new Turtle(w);
        //tom.forward();

                            //////////////////////////// PART B ////////////////////////////
        //when deleting the "w" the build faild 

        // the size of the window got smaller because we assigend 100*100  insted of the default 640*480

        // World w = new World(500, 500);
        // Turtle tom = new Turtle(100,250,w);
        // tom.forward();
        // //Moves tom forward 100 pixels 
        // tom.turn(270);
        // tom.penUp();
        // //Turns tom so it faces left, then moves the pen up
        // tom.forward(50);
        // //Moves tom forward 50 pixels
        // tom.turn(180);
        // tom.penDown();
        // tom.forward();
        // //Turns tom around so he faces right, puts the pen down, and draws a line 100 pix long

        // tom.penUp();
        // tom.forward(50);
        // tom.penDown();
        // tom.forward();
        // //Spaces Tom and move 50 pix long
        // tom.turn(-270);
        // // Turns tom right
        // tom.forward();
        // //Moves tom forward by 100 pix
        // tom.turn(-270);
        // tom.forward();

        // tom.turn(90);
        // tom.forward();
        // tom.turn(90);
        // tom.penUp();
        // tom.forward(150);
        // tom.penDown();

        // tom.setHeading(180);
        // tom.forward();
        // tom.setHeading(0);
        // tom.penUp();
        // tom.forward();
        // tom.penDown();
        // tom.setHeading(140);
        // tom.forward(55);
        // tom.setHeading(45);
        // tom.forward(55);
        // tom.setHeading(180);
        // tom.forward();

                                   
                        //////////////////////////// PART C ////////////////////////////
        
        World w = new World(500, 500);
        Turtle tom = new Turtle(w);
        tom.hexagon(0);

        tom.turnRight();
        tom.setColor(Color.CYAN);
        tom.setPenWidth(6);
        tom.hexagon(100);
        
        tom.turn(100);
        tom.setColor(Color.GREEN);
        tom.hexagon(90);

        tom.turn(-100);
        tom.setColor(Color.MAGENTA);
        tom.hexagon(50);
        
        tom.turn(180);
        tom.setColor(Color.BLACK);
        tom.hexagon(30);

       

    }
}


