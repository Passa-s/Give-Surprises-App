package surprise;

public class GiveSurpriseAndHug extends AbstractGiveSurprises{

	GiveSurpriseAndHug(String containerType, int waitTime) {
		super(containerType, waitTime);
	}
	@Override
	public void giveWithPassion() {
		System.out.println("Best wishes and a big hug! ");
	}
}
