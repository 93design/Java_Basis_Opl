package HeroOefeningInDeKlas;

import java.util.Arrays;

public class HeroMainApp {

	public static void main(String[] args) {
		
		
		AllTheHeroes DCsquad = new AllTheHeroes();
		
		
		Hero hulk = new Tank("bruce banner", 40);
		Hero superman = new ArmoredHero("clark Kent");
		Hero batman = new ShapeShifter("Bruce Wayne", 40);
		Hero robin = new Engergizer("robin", 25);
		Hero mage = new Magician("mage", 28);
		
		DCsquad.addSuperHero(hulk);
		System.out.println(Arrays.toString(DCsquad.heroes));
		DCsquad.addSuperHero(batman);
		DCsquad.addSuperHero(superman);
		DCsquad.addSuperHero(mage);
		
		System.out.println(Arrays.toString(DCsquad.heroes));
		
		
		
	
		
	}

	
	private void print(Hero[] heroArray) {
		
	}
	
	private void printHeader() {
		
		
	}

	private void fancyLines() {
		System.out.println("-------------------------------");	}	
}
