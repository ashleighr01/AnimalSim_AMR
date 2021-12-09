import java.util.*;

public class Application {

	public static void main(String[] args) {
		
		//Testing the Location class
		System.out.println("***************************");
		System.out.println("      Location Tests       ");
		System.out.println("***************************");
		
		Location location = new Location (1, 2);
	
		System.out.println("The X-Coordinate for 'location' is: " + location.getxCoord());
		System.out.println("The Y-Coordinate for 'location' is: " + location.getyCoord());
		location.setxCoord(2);
		System.out.println("The X-Coordinate for 'location' has been updated. " + location.getxCoord());
		location.setyCoord(4);
		System.out.println("The Y-Coordinate for 'location has been updated. " + location.getyCoord());

		location.update(2, 4);
		System.out.println("The updated coordinates are: " + Arrays.toString(location.getCoordinates()));
		
		System.out.println("The Y-Coordinate will be lowered 5 units. Equaling -1");
		location.setyCoord(-1);
		System.out.println("Did the coordinate update? " + Arrays.toString(location.getCoordinates()));
		
		//Testing the Animal class
		System.out.println("***************************");
		System.out.println("      Animal Tests       ");
		System.out.println("***************************");
		
		//Animal ani = new Animal();
		System.out.println("A copy could not be instantiated for the Animal class.");
		
		//Testing the Goldfinch class
		System.out.println("***************************");
		System.out.println("      Goldfinch Tests       ");
		System.out.println("***************************");
		
		Goldfinch goldie = new Goldfinch(12032, new Location (2, 5), 7.5);
		
		System.out.println(goldie.toString());
		System.out.println("Turns out Goldie's wing span is larger than recorded...");
		goldie.setWingSpan(11.5);
		System.out.println("I guess we will keep Goldie's wing span at " + goldie.getWingSpan());
		
		System.out.println("Time for Goldie to walk a little.");
		goldie.walk(1);
		System.out.println(goldie.toString());
		
		System.out.println("Now Goldie will fly!");
		goldie.fly(new Location (7, 9));
		System.out.println(goldie.toString());
		
		System.out.println("Is it Goldie's time to eat? "); 
		goldie.eat();
		System.out.println("Maybe it's time for Goldie to sleep? ");
		goldie.sleep();
		
		System.out.println(goldie.toString());
		
		Goldfinch lola = new Goldfinch(3362, new Location (10, 28), 8.9);
		System.out.println("Meet Lola the Goldfinch.");
		lola.sleep();
		lola.fly(new Location (14, 26));
		
		//Testing the BrownBear class
		System.out.println("***************************");
		System.out.println("      BrownBear Tests       ");
		System.out.println("***************************");
		
		BrownBear bearry = new BrownBear(131, new Location (10, 8), "European");
		
		System.out.println(bearry.toString());
		System.out.println("Bearry has a different simID. ");
		bearry.setSimID(-101);
		System.out.println(bearry.getSimID() + " will work just fine instead.");
		
		System.out.println("I thought Bearry was a Himalayan subspecies...");
		bearry.setSubSpecies("Himalayan");
		System.out.println("Well I guess Bearry's subspecies is " + bearry.getSubSpecies());
		
		System.out.println("Bearry is taking a walk now.");
		bearry.walk(3);
		System.out.println(bearry.toString());
		
		System.out.println("Bearry has hit water. Time to swim.");
		bearry.swim(2);
		System.out.println(bearry.toString());
		
		System.out.println("Is it Bearry's time to eat? "); 
		bearry.eat();
		System.out.println("Maybe it's time for Bearry to sleep? ");
		bearry.sleep();
		
		System.out.println(bearry.toString());
		
		BrownBear thom = new BrownBear(2019, new Location(3, 8), "Grizzly");
		System.out.println("Meet Thom the Grizzly bear.");
		thom.eat();
		thom.sleep();
		thom.swim(2);
		
		//Testing Generics
		System.out.println("***************************");
		System.out.println("      Generics Tests       ");
		System.out.println("***************************");
		
		ArrayList<Animal> zoo = new ArrayList<Animal> ();
		zoo.add(bearry);
		zoo.add(goldie);
		zoo.add(thom);
		zoo.add(lola);
		
		for (int i = 0; i < zoo.size(); i++) {
			System.out.println(zoo.get(i).toString());
		}
	}

}
