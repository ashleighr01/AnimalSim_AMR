

public class Location {

	private int xCoord;
	private int yCoord;
	
	public Location() {
		xCoord = 0;
		yCoord = 0;
	}
	
	public Location (int x, int y) {
		this.xCoord = x;
		this.yCoord = y;
		
		try {
			setxCoord(xCoord);
			setyCoord(yCoord);
		}
		catch (InvalidCoordinateException e) {
			System.out.println(xCoord + ": " + e.getMessage());
			System.out.println(yCoord + ": " + e.getMessage());
		}
	}
	
	public int getxCoord() {
	
		return xCoord;
		
	}

	public void setxCoord(int xCoord) {
		if (xCoord < 0) {
			System.out.println( new InvalidCoordinateException("X-Coordinate is invalid!"));
		} else {
			this.xCoord = xCoord;
		}			
		
	}

	public int getyCoord() {
		return yCoord;	
	}

	public void setyCoord(int yCoord) {
		if (yCoord < 0) {
			System.out.println( new InvalidCoordinateException("Y-Coordinate is invalid!"));
		} else {
			this.yCoord = yCoord;
		}
		
	}

	public void update(int x, int y) {
		if (x >= 0 && y >= 0) {
			x = xCoord;
			y = yCoord;
		}
		
	}
	
	public int[] getCoordinates() {
		
		int [] coordinates = {this.xCoord, this.yCoord};
		
		return (coordinates);
		
	}

	@Override
	public String toString() {
		return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	}
}
