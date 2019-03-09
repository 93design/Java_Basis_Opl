package DeckEnum;

import java.util.Arrays;

public class Deck {
	
	Card[] cards = new Card[52];
	
	
	public Deck() {
		super();
		makeDeck();
		
	}
	private void makeDeck() {
		SuitType[] suits = SuitType.values();
		Value[] values = Value.values();
		int cardCount = 0;
		for(SuitType suit: suits) {
			for(Value value: values) {
				cards[cardCount++] = new Card(suit,value);
			}
		}
	}
	
	public Card[] getDeck( ) {
		return cards;
	}
	
	public void printDeck() {
		System.out.println(Arrays.toString(cards));
	}
	
	
	
	

}
