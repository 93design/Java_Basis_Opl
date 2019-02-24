package MonsterOefening;

public abstract class Monster {

	private int hitPoints;
	private int maxHP;
	
	public Monster(int maxHP) {
		
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getMaxHP() {
		return maxHP;
	}

	protected void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}
	
	public void heal(int h) {
		while (hitPoints <maxHP) {
			this.hitPoints+=h;
		}		
	}
	
	public void takeDamage(int d) {
		this.hitPoints-=d;
	}
}
