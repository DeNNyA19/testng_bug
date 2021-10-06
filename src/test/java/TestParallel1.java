import org.testng.annotations.Test;

public class TestParallel1 {

	@Test
	public void test1() {
		System.out.println("Test 1.1 started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Test 1.1 finished");
	}

	@Test
	public void test2() {
		System.out.println("Test 2.1 started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Test 2.1 finished");
	}
}