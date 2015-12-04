package Matrices;

import org.junit.Test;

public class MatrixTest {
	@Test
	public void one(){
		Matrix m = new Matrix(4, 4);
		System.out.println(m.toString());
		m.rotate();
		System.out.println();
		System.out.println(m.toString());
	}
}
