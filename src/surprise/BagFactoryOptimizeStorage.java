package surprise;

public class BagFactoryOptimizeStorage implements IBagFactory {

	@Override
	public IBag makeBag(String type) {
		switch (type) {
			case "FIFO":
				return new FIFOBag();
			case "LIFO":
				return new LIFOBag();
			case "RANDOM":
				return new RandomBag();
			default:
				System.out.println("We cannot recognize this type of bag");
				break;
			}
		return null;
	}
}
	

