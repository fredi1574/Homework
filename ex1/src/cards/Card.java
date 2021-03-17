package cards;

public class Card {

    private int num;
    private int suit;

    // card constructor
    public Card(int num, int suit) {
        this.num = num;
        this.suit = suit;
    }

    //returns the card number
    public int getNum() {
        return num;
    }

    // returns the card's suit's numerical value
    public int getSuit() {
        return suit;
    }

    // returns the card as a string, combining its numerical value and suit
    public String toString() {
        switch (suit) {
            case 0:
                return num + "C";
            case 1:
                return num + "D";
            case 2:
                return num + "H";
            case 3:
                return num + "S";
        }
        throw new IllegalStateException("Invalid Card");
    }

    //compares two cards' values
    public int compareTo(Card other) {///fix this
        if (num == other.num) {
            if (suit == other.suit) {
                return 0;
            }
            return Math.max(suit, other.suit) == suit ? 1 : -1;
        }
        return Math.max(num, other.num) == num ? 1 : -1;
    }
}
