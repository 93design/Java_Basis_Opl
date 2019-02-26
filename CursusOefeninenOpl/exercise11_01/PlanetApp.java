package be.intecbrussel.basis.exercise11_01;

public class PlanetApp {

		public static void main(String[] args) {
			
			Planet[] planets = Planet.values();
			
			double totalSolarWeight = 0;
			
			for (Planet planet: planets) {
				totalSolarWeight +=planet.getWeigth();
			}
			
			System.out.println("all the planets in the solar system weight " +totalSolarWeight + " times the earth");
			System.out.println("in kg =" + totalSolarWeight * 5.9E24);
			
		}
}
