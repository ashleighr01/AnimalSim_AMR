
public class BrownBear extends Animal implements Walkable, Swimmable {

	private String subSpecies;
	
	public BrownBear() {
	
		super();
		subSpecies = "Alaskan";
	}
	
	public BrownBear(int simID, Location l, String subSpecies) {
		
		super(simID, l);
		this.subSpecies = subSpecies;
	}

	public String getSubSpecies() {
		
		return subSpecies;

	}

	public void setSubSpecies(String subSpecies) {
		switch (subSpecies) {
		case "Alaskan":
			subSpecies = "Alaskan";
			break;
		case "Asiatic":
			subSpecies = "Asiatic";
			break;
		case "European":
			subSpecies = "European";
			break;
		case "Grizzly":
			subSpecies = "Grizzly";
			break;
		case "Kodiak":
			subSpecies = "Kodiak";
			break;
		case "Siberian":
			subSpecies = "Siberian";
			break;
		default:
			System.out.println(new InvalidSubspeciesException(subSpecies + ": this subspecies is not valid."));
		}

	}

	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}

	@Override
	public void swim(int direction) {
		
		
		
		int swimX = location.getxCoord() + direction;
		int swimY = location.getyCoord() + direction;
		
		location.update(swimX, swimY);
		setLocation(new Location (swimX, swimY));
		
	}


	@Override
	public void walk(int direction) {
		
		
		
		int newX = location.getxCoord() + direction;
		int newY = location.getyCoord() + direction;
		
		location.update(newX, newY);
		setLocation(new Location (newX, newY));
		
	}

}
