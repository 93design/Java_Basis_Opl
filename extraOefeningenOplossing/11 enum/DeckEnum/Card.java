package DeckEnum;

public class Card {
	
	private SuitType suit;
	private Value value;
	
	public Card() {
		
	}

	public Card(SuitType suit, Value value) {
		super();
		this.suit = suit;
		this.value = value;
	}

	@Override
	public String toString() {
		return value + " of " + suit;
	}

	
	
	
	
	
	

}
