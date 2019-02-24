package MonsterOefening;

public class MagicMonster extends Monster{

	private int magicPoints;
	private int maxMP; 
	
	public MagicMonster(int maxMP, int maxHP) {
		super(maxHP);
		this.maxMP = maxMP;
	}
	
	public int getMagicPoints() {
		return magicPoints;
	}
	
	public  void setMagicPoints(int magicPoints) {
		this.magicPoints = magicPoints;
	}
	
	public void restoreMP(int h) {
		if(magicPoints < maxMP) {
			magicPoints+=h;
			if(magicPoints >= maxMP) {
				magicPoints = maxMP;
			}
		}
	}
	
	public Boolean useMP(int d) {
		if (magicPoints > d && magicPoints > 0) {
			magicPoints -=d;
			return true;
		} else {
			System.out.println("not enough magicPoints to ccast this spell");
			return false;
		}		
	}
}
