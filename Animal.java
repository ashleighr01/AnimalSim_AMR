
public abstract class Animal {

	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	
	public Animal() {
		simID = 0;
		location = new Location (0, 0);
		full = false;
		rested = true;
		
	}
	
	public Animal(int simID, Location l) {
		this.simID = simID;
		this.location = l;
		this.full = false;
		this.rested = true;
	
	}
	
	public int getSimID() {
		return simID;
	}

	public void setSimID(int simID) {
		if (simID < 0) {
			System.out.println(new InvalidSimIDException(simID + ": is not a valid ID."));
		} else {
			this.simID = simID;
		}
		
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public boolean isFull() {
		return full;
	}

	public void setFull(boolean full) {
		this.full = full;
	}

	public boolean isRested() {
		return rested;
	}

	public void setRested(boolean rested) {
		this.rested = rested;
	}

	public boolean eat() {
		double eatNumber = Math.random();
		if (eatNumber <= 0.5) {
			full = false;
			System.out.println("Time to eat.");
			return true;
		} else {
			full = true;
			System.out.println("No food needed.");
			return false;
		}
		
	}
	
	public boolean sleep() {
		double sleepNumber = Math.random();
		if (sleepNumber <= 0.5) {
			rested = false;
			System.out.println("Get some rest.");
			return true;
		} else {
			rested = true;
			System.out.println("Well rested!");
			return false;
		}
	}
}
