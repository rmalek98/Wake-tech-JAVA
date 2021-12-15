import java.util.Scanner;

public class RPSGame {

    // 1 is Rock
    // 2 is Paper
    // 3 is Scissors

    int rock = 1;
    int paper = 2;
    int scissors = 3;
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Add print statement to welcome User to the game
        System.out.println("welcome to Rock Paper Scissors game!");

        // Add print statement prompting User to enter 1, 2, or 3 (explain which each number represents)
        System.out.print("Enter number from 1 to 3" + "\n1 -> Rock" +"\n2 -> Paper" + "\n3 -> Scissors" + "\nEnter #: ");

        // User scnr.nextInt() to collect user input, save it as an int variable called choice
        int choice = scnr.nextInt();

	    int computerChoice = (int)(Math.random() * 3)+1;// Complete this line using Math.Random() to generate a int
                             // In the range 1-3
        playGame(choice, computerChoice);
        
        scnr.close();
    }


    public static void playGame(int choice, int computerChoice) {

        

	//Print statements for User choice
        if (choice == 1) {
            System.out.println("User chose Rock");
        } else if (choice == 2) {
            System.out.println("User chose Paper");
        } else {
            System.out.println("User chose Scissors");
        }

	//Print statements for Computer choice
	if (computerChoice == 1) {
            System.out.println("Computer chose Rock.");
        } else if (computerChoice == 2) {
            System.out.println("Computer chose Paper.");
        } else {
            System.out.println("Computer chose Scissors.");
        }

	// Determining the Winner 	
        if (computerChoice == choice) {
            System.out.println("It's a tie!");
        } else if (computerChoice == 1 && choice == 2) {
            System.out.println("Paper beats rock, Player wins!");
        } else if (computerChoice == 2 && choice == 1) {
            System.out.println("Paper beats rock, Player loses!");
        } else if (computerChoice == 2 && choice == 3) {
            System.out.println("Scissors beats rock, Player wins!");
        } else if (computerChoice == 3 && choice == 2) {
            System.out.println("Scissors beats paper, Player loses!");
        } else if (computerChoice == 1 && choice == 3) {
            System.out.println("Rock beats Scissors, Player loses!");
        } else if (computerChoice == 3 && choice == 1) {
            System.out.println("Rock beats Scissors, Player wins!");
        }

    }

}
