package ZooOktober;

public class ZooApp {

	public static void main(String args[]) {
		
		
		
		Animal ani1 = new Animal();
		Animal ani2 = new Animal("Marsa", 15, 45, "Britisch Hound");
		
		Monkey apu = new Monkey("apu",15,30,"Oranoetang");
		Monkey apu2 = new Monkey("apu",1,8,"Oranoetang");
		Monkey apu3 = new Monkey("apu",10,5,"Oranoetang");
		Monkey apu4 = new Monkey("apu",22,30,"Oranoetang");
	
		Giraffe giraf = new Giraffe("giffy",40,300,"steppe");
		Giraffe giraf2 = new Giraffe("giffy",40,300,"steppe");
		Giraffe giraf3 = new Giraffe("giffy",40,300,"steppe");
		Giraffe giraf4 = new Giraffe("giffy",40,300,"steppe");
		
		
		//System.out.println(ani1);
		//System.out.println(ani2);
		
		
		Zoo bellewaarde = new Zoo();
		Zoo paradisio = new Zoo(0, "pari daisa");
		//System.out.println(paradisio);
		
		
		paradisio.addMonkey(apu);
		paradisio.addMonkey(apu2);
		paradisio.addMonkey(apu3);
		
		paradisio.addGiraffe(giraf);
		
		
		paradisio.printZoo();
		
		
		
		}
}
