package assignment3;

import java.io.IOException; 
import java.util.Scanner; 
public class Main { 
public static void main(String[] args) throws IOException { // TODO Auto-generated method stub 

Scanner keyboard = new Scanner(System.in); 
IController control = new Controller(keyboard); 

control.readInput("input.txt");
//control.showMenu();
String response = ""; 
boolean quitFlag = false; 
while (!quitFlag) { 
control.showMenu();
System.out.println("Please choose an option");
response = keyboard.nextLine(); 

switch (response) { 
case "1": control.displayCollection(); break; 
case "2": control.checkoutMaterials(); break; 
case "3":
quitFlag = true; break; 
} } 
keyboard.close(); 
}}
