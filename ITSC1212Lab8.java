import java.util.Scanner;
import java.awt.Color;

public class ITSC1212Lab8 {
    
    static int randomX = (int) (Math.random() *100) *5;
    static int randomY = (int) (Math.random() *100) *5;
    static World w = new World(500,500);

    public static void main(String[] args) throws InterruptedException{

        //int randomX = ((int) (Math.random() *100)) *5; // generate a random multiple of 5 from 0-500
        //int randomY = ((int) (Math.random() *100)) *5;

        Turtle tom = new Turtle(randomX, randomY, w);

        tom.setVisible(false);

        Scanner scnr = new Scanner(System.in);

        //tom.setVisible(false);
      
        System.out.println("Enter A guess for the X position of Tom:");
        int guessX = scnr.nextInt();

        System.out.println("Enter A guess for the Y position of Tom:");
        int guessY = scnr.nextInt();

        // testing
        System.out.println("Testing coordinates:(" + guessX + ", " + randomX + ")");
        System.out.println("Testing coordinates:(" + guessY + ", " + randomY + ")");

        while (guessX != randomX || guessY != randomY) {
            while (guessX != randomX){
            
                if(guessX > randomX){
                    System.out.println("Your guessX is greater than Random value");
                }
                if(guessX < randomX){
                    System.out.println("Your guessX is less than Random values");
                }
                colorGuessX(guessX); 
                System.out.println("Enter a new guess for X");
                guessX = scnr.nextInt();

                if(guessX == randomX){
                    System.out.println("your guess is correct for X");
                }

            }

            while (guessY != randomY){
                
                if(guessY > randomY){
                    System.out.println("Your guess Y is greater than Random value");
                }
                if(guessY < randomY){
                    System.out.println("Your guess Y is less than Random values");
                }
                
                System.out.println("Enter a new guess for Y");

                colorGuessY(guessY); 
                guessY = scnr.nextInt();

                if(guessY == randomY){
                    System.out.println("your guess is correct for Y");
                }
            }
        }
        System.out.println("You found the Turtle!!!!!");
        tom.setVisible(true);
        scnr.close();

           
    }

// PART B

    public static void colorGuessY(int y) {
        Turtle jen = new Turtle(w);
        jen.penUp();
        jen.setVisible(false);
        jen.setPenColor(Color.black);
        if (y > randomY) {
          for (int i = y; i <= 500; i++ ) { 
            jen.moveTo(0,i);
            jen.penDown();
            jen.setHeading(90);
            jen.forward(499);
            jen.penUp();
            
          }
        } else {
          for (int i = y; i >= 0; i--) { 
            jen.moveTo(0, i);
            jen.penDown();
            jen.setHeading(90);
            jen.forward(499);
            jen.penUp();
            
            
          }
        }
      
    
      }
          
      public static void colorGuessX(int x) throws InterruptedException {
        Thread.sleep(10);
        Turtle jen = new Turtle(w);
        jen.penUp();
        
        jen.setVisible(false);
        jen.setPenColor(Color.black);
        if (x > randomX) {
          for (int i = x; i <= 500; i++) {
            jen.moveTo(i, 0);
            jen.penDown();
            jen.setHeading(180);
            jen.forward(500);
            jen.penUp();
            
          }
        } else {
          for (int i = x; i >= 0; i--) {
            jen.moveTo(i, 0);
            jen.penDown();
            jen.setHeading(180);
            jen.forward(499);
            jen.penUp();
            
            
          }
        }  
      }
}

/*   //////////////////

while loop is typically used when you don’t know how many times the loop will execute.

// QA 12a; because we don't know how many times it needs to execute
//      b; if we use and they both should be correct 


*/   //////////////////