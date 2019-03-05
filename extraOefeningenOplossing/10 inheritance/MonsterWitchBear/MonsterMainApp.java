package MonsterOefening;

import java.util.Random;

public class MonsterMainApp {
	
	public static void main (String[] args) {
		
		Random rand = new Random();
		Witch witch = new Witch("witch", 50,100);		
		Bear bear = new Bear(0, 100, 100);		
		
		System.out.println("Lets Fight");
		int counter = 0;
		
		while (bear.getHitPoints() > 0 && witch.getHitPoints() > 0) {
			if (counter %3 ==0) {
				
			}
			
			int randomNum = rand.nextInt(2)+1;
			
			switch(randomNum) {
			case 1: System.out.println("bear attacks witch");
					witch.takeDamage(bear.bearClawAttack());	
					break;
			case 2: System.out.println("witch attacks bear");
					bear.takeDamage(witch.fireBallAttack());
					break;
			default: break;
			}			
		}
		
		if(bear.getHitPoints() < 0) {			
			System.out.println("bear lost the fight to the witch");
		} else {
			System.out.println("witch lost the fight to the bear");
		}
	}

}
