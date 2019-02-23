package HeroOefening;

import java.util.Arrays;

public class HeroMainApp {

	public static void main(String[] args) {


		Hero Superman = new ArmoredHero("Clark Kent", 86);
		Hero hero2 = new Energizer();
		Hero MethaMorpho = new ShapeShifter("Bob Haney", 54 );
		Hero hero4 = new Tank();

		
		AllTheHeroes DCGang = new AllTheHeroes();
		
		DCGang.addSuperHero(Superman);
		DCGang.addSuperHero(hero2);
				
		System.out.println(Arrays.toString(DCGang.heroes));
	}

}
