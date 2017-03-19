import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Testvg {

	@Test
	public void test() {
		Audition au = new Audition();
		int result = au.add(4, 2, 1);
		assertEquals(7, result);
	}

}
