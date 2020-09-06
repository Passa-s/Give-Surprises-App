package surprise;
import java.util.Random;	
import java.util.ArrayList;

public class FortuneCookie implements ISurprise{
	
	private static Random randomNumberGenerator = new Random();
	private String joyMessage;
	
	FortuneCookie(String message) {
		this.joyMessage = message;
	}
	
	@Override
	public void enjoy() {
		System.out.println("I have received a fortune cookie with the following message: " + this.joyMessage);
	}
	
	@Override
	public String toString() {
		return "The fortune cookie message is: " + joyMessage + "";
	}
	
	public static FortuneCookie generate() {
		ArrayList<String> messages = new ArrayList<>();
		messages.add("About time I got out of that cookie.");
		messages.add("Your heart will skip a beat.");
		messages.add("A new romance is in the future.");
		messages.add("Ignore previous cookie.");
		messages.add("I cannot help you, for I am just a cookie.");
		messages.add("Help! I'm being held prisoner in a Chinese bakery.");
		messages.add("You don't have to be faster than the bear, just faster than the slowest guy.");
		messages.add("Ask not what your fortune cookie can do for you, but what you can do for the fortune cookie.");
		messages.add("Enjoy yourself while you can.");
		messages.add("If you read this, you are not illiterate.");
		messages.add("Three can keep a secret if you get rid of two.");
		messages.add("This cookie is never gonna give you, never gonna let you down.");
		messages.add("People are naturally atracted to you.");
		messages.add("No snowflake in an avalanche never feels responsible.");
		messages.add("RUN!.");
		messages.add("You laugh now, wait till you get home.");
		messages.add("Don't panic.");
		messages.add("Never do anything halfway. Your future will be....");
		messages.add("It could be better, but it's good enough.");
		messages.add("Pass the bill to the person on your left.");
		
		return new FortuneCookie(messages.get(FortuneCookie.randomNumberGenerator.nextInt(20))); 
	}
	
}
