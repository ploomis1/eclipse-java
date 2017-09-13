package main;

//Binary Search Tree implementation
class BST<E extends Comparable<E>> {
private BSTNode<E> root; // Root of the BST
private int nodecount; // Number of nodes in the BST

// constructor
BST() { root = null; nodecount = 0; }

// Reinitialize tree
public void clear() { root = null; nodecount = 0; }

// Insert a record into the tree.
// Records can be anything, but they must be Comparable
// e: The record to insert.
public void insert(E e) {
 root = inserthelp(root, e);
 nodecount++;
}

// Remove a record from the tree
// key: The key value of record to remove
// Returns the record removed, null if there is none.
public E remove(E key) {
 E temp = findhelp(root, key); // First find it
 if (temp != null) {
   root = removehelp(root, key); // Now remove it
   nodecount--;
 }
 return temp;
}

// Return the record with key value k, null if none exists
// key: The key value to find
public E find(E key) { return findhelp(root, key); }

// Return the number of records in the dictionary
public int size() { return nodecount; }
