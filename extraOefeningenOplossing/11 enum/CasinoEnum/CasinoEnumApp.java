package CasinoEnum;

public class CasinoEnumApp {

	public static void main(String[] args) {
	
		
		Table game23 = new Table(); 
		
		Player jamie = new Player(485);
		Player atilla = new Player(125);
		
		
		jamie.showTotalChipValue();
		//jamie.printChips();
		jamie.printChipAmout();
	}

}
