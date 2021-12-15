 import java.util.Scanner;

public class MagpieDriver{
/**
 * Create a Magpie, give it user input, and print its replies.
 */
    public static void main(String[] args) {
        MagPie maggie = new MagPie();

        System.out.println(maggie.getGreeting());
        Scanner in = new Scanner(System.in);
        String statement = in.nextLine();

        while (!statement.equalsIgnoreCase("Bye")) {
            System.out.println(maggie.getResponse(statement));
            statement = in.nextLine();
        }
        System.out.println("Goodbye!");
    }
}