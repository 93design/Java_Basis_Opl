package MonsterOefening;

public class Bear extends MightMonster{
	
	private int holeNumber;
	
	public Bear() {
		this(0,0);
	}
	
	public Bear(int hitPoints) {
		this(0,0,0);
		this.setHitPoints(hitPoints);
	}
	public Bear(int hitPoints, int ragePoints) {
		this(0,hitPoints,ragePoints);	
	}

	public Bear(int holeNumber,int hitPoints, int ragePoints) {
		super(100, 100);
		this.setHitPoints(hitPoints);
		this.setRagePoints(ragePoints);
		this.holeNumber = holeNumber;		
	}
	
	protected int bearClawAttack() {
		if (this.useRP(10)) {
			return 10;
		} else {
			return 0;
		}
	}
}
