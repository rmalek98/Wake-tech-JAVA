import java.util.Scanner;

public class HighLowGame {


//main method
 
    public static void main(String[] args) throws InterruptedException{
        
        Deck deck = new Deck();
        Scanner scnr = new Scanner(System.in);

        //add while loop to play game multiple times
       
        int wins = 0;
        int losses = 0;

        //print how many time player has won and lost

         while (true){
            System.out.println("If Would you like to play Enter 1 for yes, 2 for no.");
            int play = scnr.nextInt();
            if (play == 1){
                Card card1 = deck.drawCard();
                System.out.println("The next card is " + card1.declareCard());
                System.out.println("Will the next card be higher or lower? ");
                System.out.println("Enter 1 for lower, 2 for higher.");

                int choice = scnr.nextInt();

                Card card2 = deck.drawCard();
                System.out.println("The next card is " + card2.declareCard());

                //keep track of wins and losses

                boolean higher = card2.getValue(true) > card1.getValue(true);
                if (card1.getValue(true) == card2.getValue(true)){
                    System.out.println("Card values were the same, no winner or loser this round.");
                } else if ((higher && choice == 2) || (!higher && choice == 1)){
                    System.out.println("Winner!!");
                wins++;
                }else {
                    System.out.println("Sorry, your guess was incorrect :(");
                losses++;
                }
            } else {
                System.out.println("You have won " + wins + " times and lost " + losses + " times.");
                System.out.println("Thanks for playing!");
                break;
            }
         }
        scnr.close();
    }

    
}   
