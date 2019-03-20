package garage;

import java.util.Arrays;


/**
 * The class represents a garage of vehicles. 
 *  @author Jamie Goegebeur
 */
public class ProtoGarage {
	class ProtoCar extends Car {
		private boolean wrapped = true;
		public ProtoCar(Color white) {
			setColor(white);
		}

		@Override
		public void accelerate(double value) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void slowDown(double value) {
			// TODO Auto-generated method stub
			
		}
		
		public  boolean getWrapped() {
			
			return wrapped;
		}
	
	}
	
	private static final int MAX = 100;
	
	public Moveable[] vehicles = new Moveable[MAX];
	
	private int counter = 0;
	
	/**
	 * Adds a vehicle to the garage. 
	 * 
	 * @param vehicle The vehicle. 
	 * @throws GarageFullException Failed to add because the garage is full. 
	 * @throws VehicleAlreadyInGarageException  Failed to add the vehicle because it is already in the garage.
	 */
	public void addVehicle(Moveable vehicle) throws GarageFullException, VehicleAlreadyInGarageException	{
		if(counter>MAX-1){
			throw new GarageFullException("De garage is volzet.");
		} else {
			if(isVehiclePresent(vehicle)){
				throw new VehicleAlreadyInGarageException("Het voertuig zit reeds in de garage.");
			} else {
				int freePosition = nextFreePosition();
				vehicles[freePosition] = vehicle;
				counter++;					
			}
		}
	}
	
	private boolean isVehiclePresent(Moveable vehicle){
		boolean found = false;
		for(int i=0;i<MAX && !found;i++){
			if(vehicles[i]!=null
					&& vehicles[i].hashCode()==vehicle.hashCode()
					&& vehicles[i].equals(vehicle)){
				found = true;
			}
		}
		return found;
	}
	
	private int nextFreePosition(){
		boolean freePositionFound = false;
		int freePosition = MAX;
		for(int i=0;i<MAX && !freePositionFound;i++){
			if(vehicles[i]==null){
				freePositionFound = true;
				freePosition = i;
			}
		}
		return freePosition;
	}
	
	/**
	 * Removes the vehicle from the garage. 
	 * 
	 * @param vehicle The vehicle. 
	 */
	public void removeVehicle(Moveable vehicle){
		for(int i=0;i<MAX;i++){
			if(vehicles[i]!=null 
					&& vehicles[i].hashCode()==vehicle.hashCode()
					&& vehicles[i].equals(vehicle)){
				vehicles[i]=null;
				counter--;
			}
		}
	}
	
	/**
	 * Gets the vehicle on the index. 
	 * 
	 * @param index The index. 
	 * @return The vehicle. 
	 */
	public Moveable getVehicleElement(int index){
		return vehicles[index];
	}
	
	/** Clears the garage. */
	public void clear(){
		vehicles = new Moveable[MAX];
		counter = 0;
	}
	
	/**
	 * Get the size. 
	 * 
	 * @return The size. 
	 */
	public int getSize(){
		return counter;
	}

	@Override
	public String toString() {
		return "Garage [vehicles=" + Arrays.toString(vehicles) + ", counter="
				+ counter + "]";
	}
	public void printGarage() {
		int count = 1;
		for (Moveable v: vehicles) {
			if (v !=null) {
				if(v instanceof ProtoCar) {
					System.out.print("| ProtoCar " + ((ProtoCar) v).getWrapped()+ " | ");
				} else {
					System.out.print("| " + v.toString() + " |");

				}
								if (count %4 == 0) {
					System.out.println();
				}
				count++;
			}
			
		}
	}
	
	public void protoCars(int amount) {
		for(int i= 0; i < amount; i++) {
			ProtoCar proto = new ProtoCar(Color.WHITE);
			try {
				addVehicle(proto);
			} catch (GarageFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (VehicleAlreadyInGarageException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
