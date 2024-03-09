package org.sandeep.dsa.tree.pojo;

public class Node {
	public int key;
	public Node left, right;
	public Node(int item) {
		key = item;
		left = right = null;
	}
}
