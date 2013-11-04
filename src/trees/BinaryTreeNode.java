package trees;

class BinaryTreeNode<T extends Comparable<? super T>> {
	
	private final T content;
	private BinaryTreeNode<T> childL, childR;
	
	public BinaryTreeNode(T item) {
		content = item;
		childL = null;
		childR = null;
	}
	
	public T getContent() {
		return content;
	}
	
	public BinaryTreeNode<T> getChildLeft() {
		return childL;
	}
	
	public BinaryTreeNode<T> getChildRight() {
		return childR;
	}
	
	public int getChildCount() {
		int result = 0;
		if(!(childL == null)) {
			result++;
		}
		if(!(childR == null)) {
			result++;
		}
		return result;
	}
	
	public BinaryTreeNode<T> getOnlyChild() {
		if(getChildCount() == 1) {
			if(!(childL == null)) {
				return childR;
			}
			if(!(childR == null)) {
				return childL;
			}
		}
		return null;
	}
	
	private void setChildLeft(BinaryTreeNode<T> node) {
		childL = node;
	}
	
	private void setChildRight(BinaryTreeNode<T> node) {
		childR = node;
	}
	
	private BinaryTreeNode<T> getNodePtr(BinaryTreeNode<T> target) {
		if(content.compareTo(target.content) > 0) {
			return getChildLeft();
		} else {
			return getChildRight();
		}
	}
	
	public void insert(BinaryTreeNode<T> newNode) {
		BinaryTreeNode<T> nodePtr = getNodePtr(newNode);
		if(nodePtr == null) {
			if(content.compareTo(newNode.content) > 0) {
				setChildLeft(newNode);
			} else {
				setChildRight(newNode);
			}
		} else {
			nodePtr.insert(newNode);
		}
	}
	
	public BinaryTreeNode<T> retrieve(BinaryTreeNode<T> key) {
		BinaryTreeNode<T> nodePtr = getNodePtr(key);
		if(nodePtr == null) {
			return null;
		} else if(nodePtr.getContent().equals(key.getContent())) {
			return nodePtr;
		} else {
			return nodePtr.retrieve(key);
		}
	}
	
	public boolean remove(BinaryTreeNode<T> key) {
		BinaryTreeNode<T> nodePtr = getNodePtr(key);
		if(nodePtr == null) {
			return false;
		} else if(nodePtr.getContent().equals(key.getContent())) {
			switch(nodePtr.getChildCount()) {
			case 0:
				nodePtr = null;
				return true;
			case 1:
				insert(nodePtr.getOnlyChild());
			case 2:
				insert(nodePtr.getChildLeft());
				insert(nodePtr.getChildRight());
			default:
				return false;
			}
		} else {
			return nodePtr.remove(key);
		}
	}
	
	public int size() {
		int result = 1;
		if(childL != null) {
			result += childL.size();
		}
		if(childR != null) {
			result += childR.size();
		}
		return result;
	}

}
