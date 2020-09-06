package surprise;
import java.util.ArrayList;
import java.util.Random;
public class RandomBag implements IBag {

	private ArrayList<ISurprise> surpriseList;
	private Random randomGen;
	
	RandomBag() {
		this.surpriseList = new ArrayList<ISurprise>();
		this.randomGen = new Random();
	}
	
	@Override
	public String toString() {
		return "The RANDOM surprise bag contains:\n " + surpriseList + ". ";
	}
	@Override
	public void put(ISurprise newSurprise) {
		this.surpriseList.add(newSurprise);	
	}
	@Override	
	public void put(IBag bagOfSurprises) {
		int initialSize = bagOfSurprises.size();
		for (int i = 0; i < initialSize; i++) {
			surpriseList.add(bagOfSurprises.takeOut());
		}
	}
	@Override	
	public ISurprise takeOut() {
		ISurprise surpriza = surpriseList.get(this.randomGen.nextInt(surpriseList.size()));
		surpriseList.remove(surpriza);
		return surpriza;
	}
	@Override
	public ISurprise takeObject() {
		ISurprise surpriza = surpriseList.get(this.randomGen.nextInt(surpriseList.size()));
		return surpriza;
	}
	@Override	
	public boolean isEmpty() {
		if (this.surpriseList.size() == 0) {
			return true;
		}
		return false;
	}
	@Override	
	public int size() {
		return this.surpriseList.size();
	}
	
	
		
}
