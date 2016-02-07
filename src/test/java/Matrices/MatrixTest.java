package Matrices;

import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {
	@Test
	public void one() {
		Matrix m = new Matrix(4, 4);
		m.rotate();
		int[][] expected = {
				{3,2,1,0},
				{3,2,1,0},
				{3,2,1,0},
				{3,2,1,0}
		};
		for(int i=0;i<expected.length;i++){
			Assert.assertArrayEquals(expected[i], m.getGrid()[i]);
		}
	}
	@Test 
	public void square(){
		int[][] test = {
				{0,1,1,0},
				{0,0,0,1},
				{0,1,0,1},
				{0,0,0,0}
		};
		Matrix m = new Matrix(test);
		m.square();
		int[][] expected = {
				{0,1,0,2},
				{0,0,0,0},
				{0,0,0,1},
				{0,0,0,0}
		};
		for(int i=0;i<expected.length;i++){
			Assert.assertArrayEquals(expected[i], m.getGrid()[i]);
		}
	}
}
