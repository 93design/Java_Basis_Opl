package ZooOktober;

import java.util.Arrays;

public class Zoo {

	
	private Monkey[] monkeys;
	private Giraffe[] giraffes;
	private Wolf[] wolfs;
	private  int maxAmount = 20;
	private String name;
	
	public Zoo() {	
		this.monkeys = new Monkey[0];
		this.giraffes = new Giraffe[0];
		this.wolfs = new Wolf[0];
	}
	
	public Zoo(int maxAmount) {	
		this.maxAmount = maxAmount;
		this.monkeys = new Monkey[0];
		this.giraffes = new Giraffe[0];
		this.wolfs = new Wolf[0];
	}
	
	
	public Zoo(int amount,String name) {
		this.monkeys = new Monkey[amount];
		this.giraffes = new Giraffe[amount];
		this.wolfs = new Wolf[amount];
	}
	
	public void addMonkey(Monkey monki) {
		monkeys = Arrays.copyOf(this.monkeys, this.monkeys.length + 1);
		monkeys[this.monkeys.length-1] = monki;
	}

	public void printZoo() {
	
		for (int i = 0; i < monkeys.length; i++) {
			
			System.out.println(" number= " + i + "type = monkey, name = " + monkeys[i].getName());
		}
		
		for (int i = 0; i < giraffes.length; i++) {
			
			System.out.println(" number= " + i + "type = giraffe, name = " + giraffes[i].getName());
		}
		
	}

	public void addGiraffe(Giraffe giraf) {
		giraffes = Arrays.copyOf(this.giraffes, this.giraffes.length + 1);
		giraffes[this.giraffes.length-1] = giraf;
		
	}
	
	
}
