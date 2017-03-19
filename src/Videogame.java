import java.util.Scanner;
public class Videogame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String performer;

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		Scanner scnobj = new Scanner(System.in);
		Performer performerobj = new Performer();
		Performer performerobj1 = new Performer();
		Dancer danceobj = new Dancer();
		Vocalist vocalobj = new Vocalist();
		Audition audobj = new Audition();

		System.out.println("Please Enter Performor ID number: ");
		String name = scnobj.nextLine();

		performerobj.saying(name);
		// performerobj1.saying(name);
		danceobj.saying(name);
		vocalobj.saying();
		audobj.saying();

	}

}
