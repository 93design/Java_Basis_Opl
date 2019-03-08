package EdibleApp;

public class TestEdible {
	public static void main(String [] args) {
		
		Tiger tiger1 = new Tiger();
		Chicken chicken1 = new Chicken();
		Apple apple1 = new Apple();
		Banana banana1 = new Banana();
		
		//optie 1
		String banaeatMethode = banana1.howToEat();
		System.out.println(banaeatMethode);
		
		//optie2 
		System.out.println(apple1.howToEat());
		
		Edible apple2 = new Apple("Granny");
		Edible apple3 = new Apple("Goldstar");
		
		Edible chicken2 = new Chicken();
		
	
		Edible banana2 = new Banana();
		Edible banana3 = new Banana();
		
		
		
		
		Edible[] edibles = new Edible[5];
		
		
		edibles[0] = apple2;
		edibles[1] = apple3;
		edibles[2] = chicken2;
		edibles[3] = banana2;
		edibles[4] = banana3;
		
		
		
		
		
		
		
		for (Edible el: edibles) {
			if(el instanceof Apple) {
				System.out.println(((Apple) el).getName());
				Apple appleTemp = (Apple) el;
			}
		}
	}

}
