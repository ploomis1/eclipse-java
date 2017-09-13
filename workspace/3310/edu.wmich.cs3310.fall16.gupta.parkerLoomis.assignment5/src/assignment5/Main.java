package assignment5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		readFile();

	}

	public static void readFile() throws FileNotFoundException {

		BinaryTree<String> tree = new BinaryTree<String>();
		@SuppressWarnings("resource")
		Scanner fileScanner = new Scanner(new File("hw5cs3310F16data.txt"));// Scanner to read file
																			

		while (fileScanner.hasNext()) {
			String instruction = fileScanner.next();
			System.out.println(instruction);

			if (instruction.equals("Preorder")) {
				tree.preOrderTraversal();
				/*
				 * calls the preorder method
				 */
				System.out.println("\n");// adds a line to make it look nicer for the user
				
			} else if (instruction.equals("Inorder")) {
				tree.inOrderTraversal();
				/*
				 * calls the inorder method
				 */
				System.out.println("\n");
			}

			else if (instruction.equals("Postorder")) {
				tree.preOrderTraversal();
				/*
				 * calls the postorder method
				 */
				System.out.println("\n");
			} else if (instruction.equals("Insert:")) {
				String add = fileScanner.nextLine();
				System.out.println("Adding" + add);// shows user what is going on
				System.out.println();
				String[] parts = add.split(",");
				tree.insert(parts[0]);
				/*
				 * calls the insert method
				 */

			} else if (instruction.equals("Search:")) {// searches the tree
				String searchThis = fileScanner.nextLine();
				System.out.println("Search for " + searchThis);// shows user what is going on
				System.out.println("Found the node " + tree.search(searchThis));
				/*
				 * calls the search method
				 */
				System.out.println("");
			} else if (instruction.equals("Delete:")) {
				String delete = fileScanner.nextLine();
				System.out.println("Deleteing" + delete);// shows user what is going on
				tree.delete(delete);
				/*
				 * calls the delete method
				 */
				System.out.println("");
			}

		}
		System.out.println();
		System.out.println("Here is the tree");
		System.out.println(tree.toString());
	}
}
