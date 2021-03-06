package linkedLists;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import linkedLists.DoubleLinkedList;
import linkedLists.ListInterface;

import org.junit.Test;

public class DoubleLinkedTests {

	String tstString = "Another Testing String.";
	ListInterface<String> tstList;
	public static final int ITERATIONS = 25;
	
	@Test
	public void tstAddGet() {
		//set up test
		tstList = new DoubleLinkedList<>();
		String[] tstStrings = new String[ITERATIONS];
		String tstResult = null;
		//change data
		for (int i = 0; i < ITERATIONS; i++) {
			tstStrings[i] = "Item number " + i;
			tstList.add(i+1, tstStrings[i]);
		//test changes
			for (int j = i; j >= 0; j--) {
				tstResult = tstList.get(j);
				assertTrue("Results not equal at item " + j
						+ " with " + (i+1) + "elements (" + tstStrings[j] + tstResult + ")",
						tstStrings[j].equals(tstResult));
			}
		}
		//teardown
	}
	
	@Test
	public void tstAddRemove() {
		//set up test
		tstList = new DoubleLinkedList<>();
		String[] tstStrings = new String[ITERATIONS];
		String tstResult = null;
		//change data
		for (int i = 0; i < ITERATIONS; i++) {
			tstStrings[i] = "Item number " + i;
			tstList.add(tstStrings[i]);
			tstResult = tstList.remove(tstList.getLength() - 1);
		//test changes
			assertTrue("Results not equal at iterations " + i, tstStrings[i].equals(tstResult));
		}
		//teardown
	}
	
	@Test
	public void tstLength() {
		//set up test
		tstList = new DoubleLinkedList<>();
		String[] tstStrings = new String[ITERATIONS];
		//change data
		for (int i = 0; i < ITERATIONS; i++) {
			tstStrings[i] = "Item number " + i;
			tstList.add(tstStrings[i]);
		//test changes
		}
		assertTrue("", (tstList.getLength() == ITERATIONS));
		//teardown
	}
	
	@Test
	public void tstEmpty() {
		//set up test
		tstList = new DoubleLinkedList<>();
		//change data
		tstList.add(tstString);
		tstList.remove(0);
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
