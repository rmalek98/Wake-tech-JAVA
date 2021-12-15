import java.util.Scanner;

public class ITSC1212Lab4 {
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //String name = scnr.nextLine();
        //System.out.println("Welcome to ITSC1212 " + name);

        //System.out.println("Welcome to ITSC" + 1212 + " " + name);

        // String name = scnr.nextLine();
        // name.toUpperCase();
        // System.out.println("Welcome to ITSC1212 " + name);   //LAB 4 Q 10

        // String name = scnr.nextLine();
        // System.out.println("Welcome to ITSC1212 " + name.toUpperCase());

        // String name = scnr.nextLine();
        // name = name.toUpperCase();
        // System.out.println("Welcome to ITSC1212 " + name);  

        ///////////////
        /////Part A////
        ///////////////

        String welcomeMessage = "Welcome to ITSC1212";
        String name = " Malek";
        String nameWelcome = welcomeMessage + name.toUpperCase();

        //int messageLength = name.length(); // for testing. 

        System.out.println(nameWelcome + "\nThe length of this message is: " + nameWelcome.length() + 
        "\nThe word 'to' is located at index: " + nameWelcome.indexOf("to"));

        ///////////////
        /////Part B////
        ///////////////

        //System.out.println((int) (Math.random()*9+1));

        ///////////////
        /////Part C////
        ///////////////

        
    }
    
}

//A
//length() ----> Returns the length of the String object as an integer, and we always count from 1
//indexOf(String str) ----> Returns the index where the String str starts in the current String, or returns -1 if it is not found
//toUpperCase() ----> Returns the current String in all caps
//equals(String str) ----> Tests if the current String is the same as str

//B
//Math.random() ----> generates a pseudorandom number between 0.0 and 1.0
//Math.abs(int) ----> returns the absolute value of an int value. If the argument is not negative, the argument is returned.
//Math.sqrt(double) ----> returns the correctly rounded positive square root of a double value
//Math.pow(double, double) ----> returns the value of the first argument raised to the power of the second argument

// 0 to 0.99999999999
// always 0
// 0 to 4
// 0 to 1
// 0 to 9

//C