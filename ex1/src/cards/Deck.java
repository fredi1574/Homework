package cards;

public class Deck {

	private Card[] deck;
	private int numOfCards;

	// 1st deck constructor, creates 'num' series of cards (all different four suits
	// for each series)
	public Deck(int num) {
		numOfCards = num * 4;
		deck = new Card[numOfCards]; // creates an array of card objects

		for (int i = 0, j = 0; i < numOfCards; i += 4, j++) {
			deck[i] = new Card(j, 0);
			deck[i + 1] = new Card(j, 1);
			deck[i + 2] = new Card(j, 2);
			deck[i + 3] = new Card(j, 3);
		}
	}

	// 2nd deck constructor, creates a new deck by taking 'num' cards from the top
	// of another existing deck
	public Deck(Deck from, int num) {
		int numToTake = num;
		if (from.getNumCards() < num) {
			deck = new Card[from.deck.length];
			emptyDeck(from, 0);
		}

		else {
			deck = new Card[num];
			int i = 0;
			while (numToTake > 0) {
				deck[i++] = from.takeOne();
				numOfCards++;
				numToTake--;
			}
		}
	}

	// 3rd deck constructor, creates a new deck combined from two existing decks
	public Deck(Deck first, Deck second) {
		deck = new Card[first.getNumCards() + second.getNumCards()];

		// takes cards by alternating between the two existing decks.
		for (int i = 0; i < deck.length - 2 || deck.length > getNumCards(); i += 2) {
			
			// if deck 2 is empty, the remaining cards are taken from deck 1
			if (second.getNumCards() == 0) {
				numOfCards += first.getNumCards();
				emptyDeck(first, i);
			
			// if deck 1 is empty, the remaining cards are taken from deck 2
			} else if (first.getNumCards() == 0) {
				numOfCards += second.getNumCards();
				emptyDeck(second, i);
			
			//if both decks still have cards, takes one from each
			} else {
				deck[i] = first.takeOne();
				deck[i + 1] = second.takeOne();
				numOfCards += 2;
			}
		}
	}

	// takes all of the remaining cards from the target deck and puts them in the current deck 
	private void emptyDeck(Deck targetDeck, int i) {
		while (targetDeck.getNumCards() != 0) {
			deck[i++] = targetDeck.takeOne();
		}
	}

	// returns the number of cards in the current deck
	public int getNumCards() {
		return numOfCards;
	}
	
	// removes a single card and returns it to the chosen deck
	public Card takeOne() {
		if (deck.length == 0) {
			return null;
		}
		Card helpCard = deck[getNumCards() - 1];
		deck[getNumCards() - 1] = null;
		numOfCards--;
		return helpCard;
	}

	// returns a formatted string of all the cards in the chosen deck
	public String toString() {
		String str = "[";
		for (int i = 0; i < getNumCards() - 1; i++) {
			str += deck[i].toString() + ", ";
		}
		return str + deck[getNumCards() - 1].toString() + "]";
	}

	
	// sorts the chosen deck in ascending order
	public void sort() {
		Card helpCard;

		for (int i = 0; i < getNumCards() - 1; i++)
			for (int j = 0; j < getNumCards() - i - 1; j++)
				if (deck[j].compareTo(deck[j + 1]) > 0) {
					helpCard = deck[j];
					deck[j] = deck[j + 1];
					deck[j + 1] = helpCard;
				}
	}
}