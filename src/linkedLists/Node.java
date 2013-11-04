package linkedLists;

class Node<T> {
	
	private T content;
	private Node<T> next;
	
	public Node(T item) {
		content = item;
		next = null;
	}
	
	public T getContent() {
		return content;
	}
	
	public void setContent(T c) {
		content = c;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
	public void setNext(Node<T> n) {
		next = n;
	}

}
