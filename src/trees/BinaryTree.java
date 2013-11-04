package trees;

public class BinaryTree<T extends Comparable<? super T>> {
	
	private BinaryTreeNode<T> root;
	
	
	
	public void insert(T item) {
		insert(new BinaryTreeNode<T>(item));
	}
	
	private void insert(BinaryTreeNode<T> newNode) {
		if(root == null) {
			root = newNode;
		} else {
			root.insert(newNode);
		}
	}
	
	public T retrieve(T item) {
		BinaryTreeNode<T> result = retrieve(new BinaryTreeNode<T>(item));
		if(result == null) {
			return null;
		}
		return result.getContent();
	}
	
	private BinaryTreeNode<T> retrieve(BinaryTreeNode<T> key) {
		if(root == null) {
			return null;
		} else if(root.getContent().equals(key.getContent())) {
			return root;
		} else {
			return root.retrieve(key);
		}
	}
	
	public boolean remove(T item) {
		return remove(new BinaryTreeNode<T>(item));
	}
	
	private boolean remove(BinaryTreeNode<T> key) {
		if(root == null) {
			return false;
		} else if(root.getContent().equals(key.getContent())) {
			switch(root.getChildCount()) {
			case 0:
				root = null;
				return true;
			case 1:
				insert(root.getOnlyChild());
			case 2:
				insert(root.getChildLeft());
				insert(root.getChildRight());
			default:
				return false;
			}
		} else {
			return root.remove(key);
		}
	}
	
	public int size() {
		if(root == null) {
			return 0;
		} else {
			return root.size();
		}
	}
	
	public boolean isEmpty() {
		return (root == null);
	}

}
