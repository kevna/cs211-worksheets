package trees;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import trees.BinaryTree;

public class BinaryTreeTests {

	String tstString = "Another Testing String.";
	BinaryTree<String> tstList;
	public static final int ITERATIONS = 25;
	
	@Test
	public void tstAddGet() {
		//set up test
		tstList = new BinaryTree<>();
		String[] tstStrings = new String[ITERATIONS];
		String tstResult = null;
		//change data
		for (int i = 0; i < ITERATIONS; i++) {
			tstStrings[i] = "Item number " + i;
			tstList.insert(tstStrings[i]);
		//test changes
			for (int j = i; j >= 0; j--) {
				tstResult = tstList.retrieve(tstStrings[j]);
				assertTrue("Results not equal at item " + j
						+ " with " + i + "elements", tstStrings[j].equals(tstResult));
			}
		}
		//teardown
	}
	
	@Test
	public void tstAddRemove() {
		//set up test
		tstList = new BinaryTree<>();
		String[] tstStrings = new String[ITERATIONS];
		boolean tstResult = false;
		//change data
		for (int i = 0; i < ITERATIONS; i++) {
			tstStrings[i] = "Item number " + i;
			tstList.insert(tstStrings[i]);
			tstResult = tstList.remove(tstStrings[i]);
		//test changes
			assertTrue("Results not equal at iterations " + i, tstResult);
		}
		//teardown
	}
	
	@Test
	public void tstLength() {
		//set up test
		tstList = new BinaryTree<>();
		String[] tstStrings = new String[ITERATIONS];
		//change data
		for (int i = 0; i < ITERATIONS; i++) {
			tstStrings[i] = "Item number " + i;
			tstList.insert(tstStrings[i]);
		//test changes
		}
		assertTrue("failed " + tstList.size(), (tstList.size() == ITERATIONS));
		//teardown
	}
	
	@Test
	public void tstEmpty() {
		//set up test
		tstList = new BinaryTree<>();
		//change data
		tstList.insert(tstString);
		tstList.remove(tstString);
		//test changes
		assertTrue("Not registering as empty", tstList.isEmpty());
		//teardown
	}
	
	public void tst() {
		//set up test
		//change data
		//test changes
		fail("not yet implemented");
		//teardown
	}

}
