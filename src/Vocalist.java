/*% should this extend performer? %*/
public class Vocalist {
	public void saying() {
		String key = "G";
		int unionid = 1191;
		{
			System.out.println("Vocalist asked to perform  : " + "key \t"
					+ unionid);
		}
		// Volume range add
		for (int i = 0; i < 10; i++) {
			// asked to perfrom at 5 specific volume
			if (i == 5) {
				System.out
						.println("I sing in the key of - [key] - at the volume [volume] - [union id]   i.e. I sing in the key of – G –  at the volume 5 - 1245 ");
			}
		}

}
}