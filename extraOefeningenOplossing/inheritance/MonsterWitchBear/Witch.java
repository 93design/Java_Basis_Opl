package MonsterOefening;

public class Witch extends MagicMonster {
	private String name;
	
	public Witch() {
		this("",0,0);
	}
	
	public Witch(int hitPoints) {
		this("",hitPoints,0);
	}
	
	public Witch(int hitPoints, int magicPoints) {
		this("",hitPoints,magicPoints);
	}
	
	public Witch(String name, int hitPoints, int magicPoints) {
		super(50, 5);
		this.name = name;
		this.setHitPoints(hitPoints);
		this.setMagicPoints(magicPoints);
	}
	
	public int fireBallAttack() {		
		if (this.useMP(5)) {
			return 5;
		} else {
			return 0;
		}
		
	}
	
	
	

}
