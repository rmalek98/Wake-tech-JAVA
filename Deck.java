public class Deck {

    //drawCard method
    public Card drawCard() {

        //generate 2 random numbers to determine value of card from 1-13, and suit from 1-4
        int value = (int) (Math.random() * 13) + 1;
        int suit = (int) (Math.random() * 4) + 1;
        //declare string suit not initalized
        String suitString = "";

        //if/else to examine the second random number (1-4) and based on the based on the number generated, initialize suit to a different value (“Spades”, “Clubs”, “Hearts”, “Diamonds”).
        if (suit == 1) {
            suitString = "Spades";
        } else if (suit == 2) {
            suitString = "Clubs";
        } else if (suit == 3) {
            suitString = "Hearts";
        } else if (suit == 4) {
            suitString = "Diamonds";
        }

        //return a new card object with the value and suit
        return new Card(value, suitString);
    }
    
}


