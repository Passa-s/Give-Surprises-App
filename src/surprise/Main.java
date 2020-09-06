package surprise;

public class Main {

	public static void main(String[] args) {
		
		BagFactoryOptimizeStorage test = new BagFactoryOptimizeStorage();
		IBag fifoBag = test.makeBag("FIFO");
		
		for (int i = 0 ; i < 5; i++) {
			fifoBag.put(GatherSurprises.gather());
		}
		
		GiveSurpriseAndHug surprise1 = new GiveSurpriseAndHug("FIFO", 1);
		
		GiveSurpriseAndApplause surprise2 = new GiveSurpriseAndApplause("LIFO", 3);
		
		GiveSurpriseAndSing surprise3 = new GiveSurpriseAndSing("RANDOM", 5);
		
		// FIFO
		surprise1.put(GatherSurprises.gather(10));
		System.out.println(surprise1);
		surprise1.giveAll();
		
		for (int i = 0; i < 5; i++) {
			surprise1.put(GatherSurprises.gather());
		}
		System.out.println(surprise1);
		for (int i = 0; i < 5; i++) {
			surprise1.give();;
		}
		
		// LIFO
		surprise2.put(GatherSurprises.gather(15));
		System.out.println(surprise2);
		surprise2.giveAll();
		
		// RANDOM
		surprise3.put(GatherSurprises.gather(5));
		System.out.println(surprise3);
		surprise3.giveAll();
		
		
		
		
	}

}
