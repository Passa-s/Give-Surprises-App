package surprise;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {

	private IBag bag;
	private int waitTime;
	
	AbstractGiveSurprises(String bagType, int waitTime) {
		BagFactoryOptimizeStorage bagFactory = new BagFactoryOptimizeStorage();
		this.bag = bagFactory.makeBag(bagType);
		this.waitTime = waitTime;
	}
	
	@Override
	public String toString() {
		return "The used bag is: " + this.bag + "";
	}
	
	public void put(ISurprise newSurprise) {
		this.bag.put(newSurprise);
	}
	
	public void put(IBag surprises) {
		this.bag.put(surprises);
	}
	
	public void put(ArrayList<ISurprise> surprises) {
		for (int i = 0; i < surprises.size(); i++) {
			this.bag.put(surprises.get(i));
		}
	}
	
	public ISurprise give() {
		if (this.bag.isEmpty()) {
			return null;
		}
		giveWithPassion();
		this.bag.takeObject().enjoy();
		return this.bag.takeOut();
	}
	
	public ArrayList<ISurprise> giveAll() {
		if (this.bag.isEmpty()) {
			return null;
		}	
		ArrayList<ISurprise> surprises = new ArrayList<ISurprise>();
		int initialSize = this.bag.size();
		
		for (int i = 0; i < initialSize; i++) {
			try {
				surprises.add(give());
				TimeUnit.SECONDS.sleep(this.waitTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return surprises;
	}
	
	public boolean isEmpty() {
		return this.bag.isEmpty();
	}
	
	abstract void giveWithPassion();
	
	
}
