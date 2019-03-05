package HeroOefening;

import java.util.Arrays;

public class AllTheHeroes {

	Hero[] heroes;
	
	

	public AllTheHeroes() {
		super();
		this.heroes = new Hero[0];
	}

	public void addSuperHero(Hero hero) {
		Hero[] temp = copyIntoLongerArray(heroes);
		temp[heroes.length] = hero;
		heroes = temp;
	}

	public void removeSuperHero(Hero hero) {
		for (int i = 0; i < heroes.length - 1; i++) {
			if (heroes[i].equals(hero)) {
				removeIndex(i);
			}
		}

	}

	private void removeIndex(int i) {
		heroes = removeTheElement(heroes,i);
		
	}

	private boolean isSuperHeroPresent(Hero hero) {
		for (Hero el : heroes) {
			if (el.equals(hero)) {
				return true;
			}
		}
		return false;
	}

	private Hero[] copyIntoLongerArray(Hero[] copy) {
		Hero[] temp = Arrays.copyOf(copy, copy.length + 1);
		return temp;
	}

	public static Hero[] removeTheElement(Hero[] arr, int index) {

		if (arr == null || index < 0 || index >= arr.length) {
			return arr;
		}
		
		Hero[] anotherArray = new Hero[arr.length - 1];
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i == index) {
				//do nothing
			} else {
				anotherArray[k++] = arr[i];
			}			
		}
		return anotherArray;
	}
}
