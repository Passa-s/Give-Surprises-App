package surprise;
import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise{

	private String minionName;
	private static int minionCount;
	private static ArrayList<String> minionNames =  new ArrayList<String>(Arrays.asList("Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"));
	
	MinionToy(String minionName) {
		this.minionName = minionName;
	}
	
	@Override
	public void enjoy() {
		System.out.println("I have received " + this.minionName + " as my minion!");
	}
	
	@Override
	public String toString() {
		return "The minion's name is: " + this.minionName + "";
	}
	
	public static MinionToy generate() {
		if (MinionToy.minionCount == MinionToy.minionNames.size()) {
			MinionToy.minionCount = 0;
		}
		return new MinionToy(minionNames.get(MinionToy.minionCount++));
	}
	
}
