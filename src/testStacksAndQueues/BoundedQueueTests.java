package testStacksAndQueues;

import static org.junit.Assert.*;

import org.junit.Test;

import boundedStacksAndQueues.*;
import unboundedStacksAndQueues.QueueInterface;

public class BoundedQueueTests {

	String tstString = "Some test String.";
	
	@Test
	public void tstAddHeadItem() {
		//set up test
		QueueInterface tstQueue = new BoundedQueue();
		String tstResult = null;
		//change data
		try {
			tstQueue.add(tstString);
			tstResult = (String)tstQueue.head();
		} catch(QueueOverflowException e) {
			fail("Unexpected QueueOverflowException encountered");
		}
		//test changes
		assertTrue("Item not correct", tstString.equals(tstResult));
		//teardown
	}
	
	@Test
	public void tstOverflow() {
		//set up test
		QueueInterface tstQueue = new BoundedQueue(2);
		try {
			tstQueue.add(tstString);
			tstQueue.add(tstString);
		} catch(QueueOverflowException e) {
			fail("Unexpected QueueOverflowException encountered");
		}
		//change data
		try {
			tstQueue.add(tstString);
		//test changes
			fail("No expected QueueOverflowException");
		} catch(QueueOverflowException e) {}
		//teardown
	}

	
	@Test
	public void tstEmpty() {
		//set up test
		QueueInterface tstQueue = new BoundedQueue();
		try {
			tstQueue.add(tstString);
		//change data
			tstQueue.remove();
		//test changes
		} catch(QueueOverflowException e) {
			fail("Unexpected QueueOverflowException encountered");
		}
		assertTrue("Queue not registering empty", tstQueue.isEmpty());
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
