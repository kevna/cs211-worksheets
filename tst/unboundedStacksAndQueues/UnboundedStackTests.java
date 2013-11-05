package unboundedStacksAndQueues;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import boundedStacksAndQueues.StackException;
import boundedStacksAndQueues.StackOverflowException;
import boundedStacksAndQueues.StackUnderflowException;
import unboundedStacksAndQueues.StackInterface;
import unboundedStacksAndQueues.UnboundedStack;

public class UnboundedStackTests {
	
	String tstString = "Some test String.";

	@Test
	public void tstPushPeekItem() {
		//setup
		StackInterface tstStack = new UnboundedStack();
		String tstResult = null;
		//change data
		try {
			tstStack.push(tstString);
			tstResult = (String)tstStack.peek();
		} catch(StackOverflowException e) {
			fail("failed with StackOverflowException");
		}
		//test changes
		assertTrue("result '" + tstResult + "' not equal to input", tstString.equals(tstResult));
		//teardown
	}
	
	@Test
	public void tstPushPopItem() {
		//setup
		StackInterface tstStack = new UnboundedStack();
		String tstResult = null;
		//change data
		try {
			tstStack.push(tstString);
			tstResult = (String)tstStack.pop();
		} catch(StackException e) {
			fail("failed with StackException");
		}
		//test changes
		assertTrue("result '" + tstResult + "' not equal to input", tstString.equals(tstResult));
		//teardown
	}
	
	//@Test
	public void tstOverflowException() {
		//set up test
		StackInterface tstStack = new UnboundedStack(2);
		//change data
		try {
			tstStack.push(tstString);
			tstStack.push(tstString);
		} catch(StackOverflowException e) {
			fail("StackOverflowException occured early");
		}
		try {
			tstStack.push(tstString);
		//test changes
			fail("no StackOverflowException");
		} catch(StackOverflowException e) {}
		//teardown
	}
	
	@Test
	public void tstUnderflowException() {
		//set up test
		StackInterface tstStack = new UnboundedStack();
		//change data
		try {
			tstStack.pop();
		//test changes
			fail("no StackUnderflowException");
		} catch(StackUnderflowException e) {}
		//teardown
	}
	
	@Test
	public void tstDuplicate() {
		//set up test
		StackInterface tstStack = new UnboundedStack();
		String tstResultOne = null, tstResultTwo = null;
		try {
			tstStack.push(tstString);
		//change data
			tstStack.duplicate();
			tstResultTwo = (String)tstStack.pop();
			tstResultOne = (String)tstStack.pop();
		//test changes
		} catch(StackException e) {
			fail("StackException encountered");
		}
		assertTrue("Duplicate not equal to original", tstResultOne.equals(tstResultTwo));
		//teardown
	}

	@Test
	public void tstExchange() {
		//set up test
		StackInterface tstStack = new UnboundedStack();
		String tstStringTwo = "Another interesting String";
		String tstResultOne = null, tstResultTwo = null;
		try {
			tstStack.push(tstString);
			tstStack.push(tstStringTwo);
		//change data
			tstStack.exchange();
			tstResultOne = (String)tstStack.pop();
			tstResultTwo = (String)tstStack.pop();
		//test changes
		} catch(StackException e) {
			fail("Unexpected StackException encountered");
		}
		assertTrue("Result one not correct", tstResultOne.equals(tstString));
		assertTrue("Result two not correct", tstResultTwo.equals(tstStringTwo));
		//teardown
	}
	
	@Test
	public void tstEmpty() {
		//set up test
		StackInterface tstStack = new UnboundedStack();
		try {
			tstStack.push(tstString);
		//change data
			tstStack.pop();
		//test changes
		} catch(StackException e) {
			fail("Unexpected StackException encountered");
		}
		assertTrue("isEmpty returns false", tstStack.isEmpty());
		//teardown
	}
	
	@Test
	public void tstDepth() {
		//set up test
		int tstCount = 5;
		StackInterface tstStack = new UnboundedStack(); 
		//change data
		try {
		for (int i = 0; i < tstCount; i++) {
			tstStack.push(tstString);
		}
		//test changes
		} catch(StackException e) {
			fail("Unexpected StackException encountered");
		}
		assertTrue("depth not correct", (tstStack.depth() == tstCount));
		//teardown
	}
	
	//@Test
	public void tstSizeof() {
		//set up test
		int tstSize = 4; 
		//change data
		StackInterface tstStack = new UnboundedStack(tstSize);
		//test changes
		assertTrue("Not correct size", (tstStack.sizeof() == tstSize));
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
