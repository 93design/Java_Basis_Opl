package bigPersonUML;

public class BigPersonMainApp {

		public static void main(String[] args)  {
			Address gamerAddress = new Address("Aaishove", 17, "Ramskapelle");
			House gamerHouse = new House(gamerAddress);
			Gamer gamer = new Gamer();
			
			Hobby printen = new printen3D();
			System.out.println(printen.toString());
		
			gamer.addHobby(printen);
			gamer.setNickName("jg007");
			
			Pet Marcel = new Dog("Marcel",1,5.0);
			Pet Sasha = new Cat("Sasha", 8,4);
			
			
			gamer.addPet(Marcel);
			gamer.addPet(Sasha);
			
			gamer.setHouse(gamerHouse);;
			System.out.println(gamer);
			printen.setLocation(gamerAddress);
			gamer.showMyHobbies();
		}	
}
