
public class Goldfinch extends Animal implements Flyable, Walkable {

	private double wingSpan;
	
	public Goldfinch() {
		super();
		wingSpan = 9.0;
	}
	
	public Goldfinch(int simID, Location l, double ws) {
		super(simID, l);
		this.wingSpan = ws;
		
	}

	public double getWingSpan() {

		return wingSpan;
		
		
	}

	public void setWingSpan(double wingSpan) {
		if (wingSpan <= 11.0 && wingSpan >= 5.0) {
			this.wingSpan = wingSpan;
		} else {
			System.out.println(new InvalidWingspanException(wingSpan + ": this wing span is out of range."));
		}
		
	}

	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}

	@Override
	public void walk(int direction) {
		
	
		
		int newX = location.getxCoord() + direction;
		int newY = location.getyCoord() + direction;
		
		location.update(newX, newY);
		setLocation(new Location (newX, newY));
		
	}
	

	@Override
	public void fly(Location l) {
		
		setLocation(l);
		getLocation();
				
		
	}

}
