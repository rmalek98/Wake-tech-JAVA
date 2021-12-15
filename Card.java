public class Card {

    //Fields
    private int value;
    private String suit;

    //Constructors - initialize fields

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }   

    //Methods
    // Getters for suit and value
    public String getSuit() {
        return suit;
    }

    public int getValue(boolean isBalackJack) {
        if (!isBalackJack){
        return value;
        } else {
            if (value == 1){
                return 11;
            } else if (value > 10){ 
                return 10;
            } else {
                return value;
            }
        }
    }

    


    //declareCard method
    public String declareCard(){
        if (this.value == 11){
            return "the Jack of " + suit;
        } else if (this.value == 12){
            return "the Queen of " + suit;
        } else if (this.value == 13){
            return "the King of " + suit;
        } else if (this.value == 1){
            return "the Ace of " + suit;
        } else {
            return "the " + value + " of " + suit;
        }
    }


    
}
