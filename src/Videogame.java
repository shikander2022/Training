import java.util.Scanner;
public class Videogame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String performer;

		/*% give variables meaningful names such as performerIds %*/
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		/*% use camel case for variable names - scnObj, performerObj, etc %*/
		Scanner scnobj = new Scanner(System.in);
		Performer performerobj = new Performer();
		Performer performerobj1 = new Performer();
		Dancer danceobj = new Dancer();
		Vocalist vocalobj = new Vocalist();
		Audition audobj = new Audition();

		System.out.println("Please Enter Performor ID number: ");
		String name = scnobj.nextLine();
		/*% remember to close your scanner when you are done with it (scnobj.close()) %*/
		performerobj.saying(name);
		// performerobj1.saying(name);
		danceobj.saying(name);
		vocalobj.saying();
		audobj.saying();

	}

}
