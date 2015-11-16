package Graphs;

import org.junit.Assert;
import org.junit.Test;

public class AdjacencyMatrixTest {

	@Test
	public void testAdjacencyMatrix() {
		AdjacencyMatrix graph = new AdjacencyMatrix(10);
		graph.addEdge(2, 3);
		graph.addEdge(0, 0);
		Assert.assertEquals(true, graph.isEdge(2, 3));
		Assert.assertEquals(true, graph.isEdge(3, 2));
		Assert.assertEquals(true, graph.isEdge(0, 0));
	}
}
