package trees;

public class BinaryTreeNode<T> {
	
	private T content;
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
	
	public void setChildLeft(BinaryTreeNode<T> node) {
		childL = node;
	}
	
	public void setChildRight(BinaryTreeNode<T> node) {
		childR = node;
	}

}
