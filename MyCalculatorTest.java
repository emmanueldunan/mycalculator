//Emmanuel C. Dunan
//2012-01067
//AB-2L
import static org.junit.Assert.*;

import org.junit.Test;


public class MyCalculatorTest {
	
	
	//test if input is 0
	@Test
	public void test0factorial() {
		MyCalculator mc = new MyCalculator();
		
		int actual = mc.nfactorial(0);
		
		assertEquals("0!",actual,1,0.0);
	}

	//test if input is less than 12
	@Test
	public void testless12factorial() {
		MyCalculator mc = new MyCalculator();
			
		int actual = mc.nfactorial(9);
			
		assertEquals("9!",actual,362880,0.0);
	}
	
	
	//test if input is exactly 12
	@Test
	public void test12factorial() {
		MyCalculator mc = new MyCalculator();
		
		int actual = mc.nfactorial(12);
		
		assertEquals("12!",actual,479001600,0.0);
	}
	
	//test if input is negative. returns -1
	@Test
	public void testnegativefactorial() {
		MyCalculator mc = new MyCalculator();
		
		int actual = mc.nfactorial(-3);
		
		assertEquals("-3!",actual,-1,0.0);
	}
	
	
	//test if input is the first element
	@Test
	public void test1stBinarySearch() {
		int[] array = {1,2,3,4,5};
		MyCalculator mc = new MyCalculator();
		
		int actual = mc.binarySearch(array, 1);
		
		assertEquals("index of 1 is 0",actual,0,0.0);
		
	}
	
	
	//test if input is the middle element
	@Test
	public void testmiddleBinarySearch() {
		int[] array = {1,2,3,4,5};
		MyCalculator mc = new MyCalculator();
		
		int actual = mc.binarySearch(array, 3);
		
		assertEquals("index of 3 is 2",actual,2,0.0);
		
	}
	
	//testt if input is the last element
	@Test
	public void testlastBinarySearch() {
		int[] array = {1,2,3,4,5};
		MyCalculator mc = new MyCalculator();
		
		int actual = mc.binarySearch(array, 5);
		
		assertEquals("index of 5 is 4",actual,4,0.0);
		
	}
}
