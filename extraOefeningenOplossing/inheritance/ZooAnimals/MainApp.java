package ZooOefening;

public class MainApp {
	
	public static void main(String[] args) {
		

		Zoo zoo = new Zoo();
		
		Animal monkey1 = new Monkey();
		Animal monkey2 = new Monkey();
		Animal monkey3= new Monkey();
		
		Animal giraffe1 = new Giraffe();
		Animal giraffe2 = new Giraffe();
				
		Animal bear1 = new Bear();
		Animal bear2 = new Bear();
		Animal bear3 = new Bear();

		monkey3.setName("King louis");
		
		bear1.setName("test");
		bear2.setAge(30);
		
		bear1.setAge(25);
		bear1.setName("Balu");
		bear1.setWeight(150);		
		
		zoo.addAnimal(bear1);
		zoo.addAnimal(bear2);
		zoo.addAnimal(bear3);
		zoo.addAnimal(monkey1);
		zoo.addAnimal(monkey2);
		zoo.addAnimal(monkey3);
	
		zoo.printZoo();
		
		
	
	}

	
}
