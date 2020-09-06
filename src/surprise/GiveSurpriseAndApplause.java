package surprise;

public class GiveSurpriseAndApplause extends AbstractGiveSurprises{

	GiveSurpriseAndApplause(String containerType, int waitTime) {
		super(containerType, waitTime);
	}
	@Override
	public void giveWithPassion() {
		System.out.println("Loud applause to you... For it is in giving that we receive! ");
	}
}
