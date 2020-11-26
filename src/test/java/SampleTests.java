import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTests {

	@Test
	public void test1() {
		System.out.println("test1 Passed");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2() {
		System.out.println("test2 failed");
		Assert.assertTrue(false);
	}
}
