package Pearls;

import org.junit.Assert;
import org.junit.Test;


public class PartitionTest {
	@Test
	public void simpleTest(){
		int[] set = {1,1,1,2};
		Assert.assertEquals(false, Partition.isEven(set));
	}
	@Test
	public void simplasdeTest(){
		int[] set = {3,1,1,2,2,1};
		Assert.assertEquals(true, Partition.isEven(set));
	}
	
	
}
