package linkedLists;

public class DoubleLinkNode<T> {

	private T content;
	private DoubleLinkNode<T> prev, next;
	
	public DoubleLinkNode(T item) {
		content = item;
		prev = null;
		next = null;
	}
	
	public T getContent() {
		return content;
	}
	
	public void setContent(T c) {
		content = c;
	}
	
	public DoubleLinkNode<T> getNext() {
		return next;
	}
	
	public void setNext(DoubleLinkNode<T> n) {
		next = n;
	}
	
	public DoubleLinkNode<T> getPrevious() {
		return prev;
	}
	
	public void setPrevious(DoubleLinkNode<T> p) {
		prev = p;
	}

}
