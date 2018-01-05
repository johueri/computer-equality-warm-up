		import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class ComputerTestEquality {

	@Test
	public void assertThatTwoObjsAreAliases() {
		Computer underTest = new Computer("make", "model", 0);
		Computer underTest2 = new Computer("make", "mmodel", 0);
		underTest = underTest2; //creates an Alias
		boolean check = (underTest ==underTest2);
		assertEquals(check, true);
		
	}
	@Test
	public void assertObjEqualsMehtodWorksAsExpected() {
		Computer underTest = new Computer("make", "model", 0);
		Computer underTest2 = new Computer("make", "mmodel", 0);
		boolean check = underTest.equals(underTest2);
		assertEquals(check, false);
	}
}
