package Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Questions.BlankFill;
import Questions.IQuestion;
import Questions.ShortAns;
import Questions.TrueFalse;
import Quiz.IQuiz;
import Quiz.QuizUI;

public class main {
	public static int getUserChoice(Scanner in){
		int choice =0; do{
		System.out.println("Program Menu"); 
		System.out.println("0. Take Quiz"); 
		System.out.println("1. Exit"); 
		System.out.print("Please choose an option: "); 
		try{
		choice=Integer.parseInt(in.nextLine()); 
		}
		catch(NumberFormatException e){
		System.out.println("Please enter only a number."); 
		choice = -1;
		}
		}
		while(choice != 0 && choice != 1); 
		return choice;
		}
		public static void main(String[] args){
		List<IQuestion> questions = new ArrayList<IQuestion>(); 
		questions.add(new BlankFill("The cat _____ the rat.", "ate")); 
		questions.add(new TrueFalse("1 is less than 2", true));
		questions.add(new ShortAns("What color is snow?", "white")); 
		QuizUI qUI = new QuizUI();
		IQuiz myQuiz = qUI.createQuiz(questions); 
		if(myQuiz==null)
		return;
		Scanner scanner = new Scanner(System.in); 
		while(getUserChoice(scanner)!=1){
			
			myQuiz.reset();
			qUI.takeQuiz(myQuiz);
		}
		
		}

}
