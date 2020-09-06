package surprise;
import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {
	
	private static ArrayList<ISurprise> surprisesList = new ArrayList<ISurprise>();
	private static Random randomSurpise = new Random();
	
	private GatherSurprises() {
		
	}
	
	public static ISurprise gather() {
		ISurprise surprise = null;
		switch (GatherSurprises.randomSurpise.nextInt(3)) {
			case 0:
				surprise = FortuneCookie.generate();
				break;
			case 1:
				surprise = Candies.generate();
				break;
			case 2:
				surprise = MinionToy.generate();
				break;
			default:
				break;
		}
		return surprise;
	}
	
	public static ArrayList<ISurprise> gather(int n) {
		GatherSurprises.surprisesList.clear();
		for (int i = 0; i < n ; i++) {
			GatherSurprises.surprisesList.add(gather());
		}
		return GatherSurprises.surprisesList;
	}
	
}
