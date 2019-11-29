package HeroOefeningInDeKlas;

import java.util.Arrays;

public class AllTheHeroes {

	public Hero[] heroes;

	public AllTheHeroes() {
		heroes = new Hero[4];
	}

	public void addSuperHero(Hero heroInput) {
		if (isHeroTypePresent(heroInput)) {
			System.out.println("type reeds aanwezig");
		} else {
			for (int i = 0; i < heroes.length; i++) {
				if (heroes[i] == null) {
					heroes[i] = heroInput;
					if (i == heroes.length) {
						System.out.println("team is reeds vol");
					}
					break;
				}
			}
		}
	}

	public void removeSuperHero(Hero heroInput) {
		for (int i = 0; i < heroes.length; i++) {
			if (heroes[i].equals(heroInput)) {
				for (int j = i; j < heroes.length - 1; j++) {
					heroes[j] = heroes[j + 1];
				}
			}
		}
		heroes = Arrays.copyOf(heroes, heroes.length - 1);
	}

	public boolean isHeroTypePresent(Hero heroIn) {
		String test = heroIn.getClass().getSimpleName();
		System.out.println(test);
		for (int i = 0; i < heroes.length; i++) {
			if (heroes[i] != null && heroes[i].getClass().equals(heroIn.getClass())) {
				return true;
			}
		}

		return false;
	}
}
