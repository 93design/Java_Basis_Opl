package DeckEnum;

public enum SuitType {

	DIAMONDS("Diamonds"),HEARTS("Hearts"),CLUBS("Clubs"),SPADES("Spades");
	
	
	private String name;
	
	SuitType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
