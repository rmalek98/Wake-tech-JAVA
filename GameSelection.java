import java.util.Scanner;

public class GameSelection {
    public static void main(String[] args) throws InterruptedException {
           
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Welcome to the game selection menu.");
        Thread.sleep(500);
        System.out.println("Please select a game to play.");
        Thread.sleep(500);
        System.out.println("1. BlackJack");
        Thread.sleep(500);
        System.out.println("2. HighLow");
        Thread.sleep(500);
        System.out.println("3. Exit");
        Thread.sleep(500);
        
        int choice = scnr.nextInt();
        
        if (choice == 1){
            BlackJack blackJackGame = new BlackJack();
            blackJackGame.playGame();
        } else if (choice == 2){
            HighLowGame.main(args);
        } else if (choice == 3){
            System.out.println("Thank you for playing!");
        }   
        scnr.close();  
            
         
    }   

}