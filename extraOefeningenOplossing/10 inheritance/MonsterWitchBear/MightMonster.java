package MonsterOefening;

public class MightMonster extends Monster{
	
	private int ragePoints;
	private int maxRP;
	
	public MightMonster(int maxRP,int maxHP) {
		super(maxHP);
		this.maxRP=maxRP;
	}
	public int getRagePoints() {
		return ragePoints;
	}
	public void setRagePoints(int ragePoints) {
		this.ragePoints = ragePoints;
	}
	
	public void restoreRP(int h) {
		if(ragePoints < maxRP)
		this.ragePoints+=h;
	}
	
	public boolean useRP(int d) {		
		if (ragePoints > d && ragePoints > 0) {
			ragePoints -=d;
			return true;
		} else {
			System.out.println("not enough ragePoints to use this rageMove");
			return false;
		}
	}
	
	
}

