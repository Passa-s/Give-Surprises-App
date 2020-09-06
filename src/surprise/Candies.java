package surprise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise{

	private String typeOfCandies;
	private int noOfCandies;
	private static ArrayList<String> candiesType = new ArrayList<String>(Arrays.asList("chocolate", "jelly", "fruits", "vanilla"));
	private static Random randomNumberGenerator = new Random();
	
	Candies(int noOfCandies, String typeOfCandies) {
		this.typeOfCandies = typeOfCandies;
		this.noOfCandies = noOfCandies;
	}
	
	@Override
	public void enjoy() {
		System.out.println("WOW! I have received " + this.noOfCandies + " " + this.typeOfCandies + " candies!");
	}
	
	public static Candies generate() {
		return new Candies(Candies.randomNumberGenerator.nextInt(50), Candies.candiesType.get(Candies.randomNumberGenerator.nextInt(Candies.candiesType.size())));
	}
	
	@Override
	public String toString() {
		return "I have received " + this.noOfCandies + this.typeOfCandies + " candies.";
	}
	
}
