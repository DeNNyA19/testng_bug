import org.testng.annotations.Test;

public class TestParallel2 {

	@Test
	public void test1() {
		System.out.println("Test 1.2 started");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Test 1.2 finished");
	}

	@Test
	public void test2() {
		System.out.println("Test 2.2 started");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Test 2.2 finished");
	}
}