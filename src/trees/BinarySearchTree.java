package trees;

public class BinarySearchTree<T extends Comparable<? super T>> {
	
	private BinaryTreeNode<T> rootNode;
	private int length;
	
	public BinarySearchTree() {
		length = 0;
		rootNode = null;
	}
	
	public void insert(T item) {
		if (item == null) {
			throw new IllegalArgumentException();
		} 
		if (length == 0) {
			rootNode = new BinaryTreeNode<T>(item);
		} else {
			insertRecursor(item, rootNode);
		}
		length++;
	}
	
	private void insertRecursor(T item, BinaryTreeNode<T> cursor) {
		if (item.compareTo(cursor.getContent()) < 1) {
			if (cursor.getChildLeft() == null) {
				cursor.setChildLeft(new BinaryTreeNode<T>(item));
			} else {
				insertRecursor(item, cursor.getChildLeft());
			}
		} else {
			if (cursor.getChildRight() == null) {
				cursor.setChildRight(new BinaryTreeNode<T>(item));
			} else {
				insertRecursor(item, cursor.getChildRight());
			}
		}
	}
	
	public void remove(T item) {
		if (length == 0) {
		} else if (length == 1) {
			if (item.equals(rootNode.getContent())) {
				rootNode = null;
			}
		} else {
			BinaryTreeNode<T> node = rootNode, parent = null;
			while ((node != null) && (item.compareTo(node.getContent()) != 0)) {
				if (item.compareTo(node.getContent()) < 1) {
					parent = node;
					node = node.getChildLeft();
				} else {
					parent = node;
					node = node.getChildRight();
				}
			}
		}
	}
	
	public boolean isEmpty() {
		return (length == 0);
	}

}
