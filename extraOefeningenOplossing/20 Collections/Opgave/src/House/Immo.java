package House;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Immo {

	private static Random rand = new Random();
	private HouseType[] hTypes = HouseType.values();

	private List<House> hfsl = new ArrayList<House>();

	public List<House> getHfsl() {
		return hfsl;
	}

	public void setHfsl(List<House> hfs) {
		this.hfsl = hfs;
	}

	public void addHouse(House hfs) {
		hfsl.add(hfs);
	}

	public void generateHouses(int amount) {
		for (int i = 0; i < amount; i++) {
			int p = rand.nextInt(HouseType.values().length) +1;
			HouseType type = hTypes[p - 1];
			addHouse(new House(rPM(p * 100, p * 50), rPM(2 + p, 2 + p), rPM(p * 100_000, p * 50_000), type));
		}
	}

	private int rPM(int target, int plusmin) {
		return target + (rand.nextInt(plusmin * 2) - (plusmin));

	}
}
