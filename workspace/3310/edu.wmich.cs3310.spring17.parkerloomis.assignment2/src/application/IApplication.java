package application;

import lists.IList;
import stacks.IStack;

public interface IApplication { /**
* Reads the binary file "input.bin" and returns each line * as an element in an IList
* @return an IList containing the input.
*/
public IStack readInputFile(); /**
* Writes the reversed string to the binary file "output.bin" * @param output
*/
public void writeOutputFile(IList output); /**
* Prints out the input and output strings to the screen. * @param input the input string
* @param object2 the output string
*/

default public void printToScreen(Object object, Object object2){ System.out.println("The reverse of string \""+object+"\" is \""+object2+"\".");
      }   
/**
* Reverses the String parameter.
* @param s the String to be reversed * @return the reversed string
*/
public String reverseString(String s);
}