
public class CanIKeepKidsQuiet {
	public static void main (String args[]){
		int gumballs;
		int kids;
		int gumballsPerKid;
		
		gumballs = 140;
		kids = 15;
		gumballsPerKid = gumballs / kids;
		
		boolean Quiet = gumballs % kids == 0;
		
		System.out.println("Can I keep kids quiet?");
		System.out.println(Quiet);
	}
}
