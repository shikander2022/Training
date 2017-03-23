
public class Performer {
	/*% use camel case convention for naming variables %*/
	private int performerid;

	public void saying(String name) {
		/*% what if I had multiple performers, I don't want all of their ids to be 324 %*/
		System.out.println("ID performer is : 324 performer " + name);
	}

	/*% java has method overloading so you can have multiple methods name similarly if they take different parameters %*/
	public static void saying1() {
		// System.out.println("ID performer is : 324 performer");
	}

	}
