package bigPersonUML;

public class BigPersonMainApp {

		public static void main(String[] args)  {
			Address gamerAddress = new Address("Aaishove", 17, "Ramskapelle");
			House gamerHouse = new House(gamerAddress);
			
			Gamer gamer = new Gamer();
			Photographer photographer = new Photographer();
			
			
			
			Hobby printen = new printen3D();
			Hobby gaming = new Gaming();
			Hobby photoshop = new Photoshopping();
			
			photographer.addHobby(photoshop);
			gaming.setLocation(gamerAddress);
			System.out.println(printen.toString());
		
			gamerHouse.getHobbyRoom().setHobby(printen);
			gamer.addHobby(printen);
			gamer.setNickName("jg007");
			
			Pet Marcel = new Dog("Marcel",1,5.0);
			Pet Sasha = new Cat("Sasha", 8,4);
			
			
			gamer.addPet(Marcel);
			gamer.addPet(Sasha);
			
			gamer.setHouse(gamerHouse);
			System.out.println(gamer);
			printen.setLocation(gamerAddress);
			gamer.showMyHobbies();
			
			System.out.println(gamer.getHouse());
		}	
}
