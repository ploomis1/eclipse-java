package Quiz;

import java.util.List;
import java.util.Scanner;

import Questions.IQuestion;

public class QuizUI implements IQuizUI {
	
	private List<IQuestion> q;

	public QuizUI() {
		// TODO Auto-generated constructor stub
	}
	//create defualt 

	@Override
	public IQuiz createQuiz(List<IQuestion> questions) {
		
		//for()
		q=questions;
		IQuiz quiz=new Quiz();
		//System.out.println(questions.get(0).getQuestion());
		
		//questions.get
	
		//what?
		// TODO Auto-generated method stub
		return quiz;
	}

	@Override
	public void takeQuiz(IQuiz quiz) {
		//System.out.println("y");
		//runs complete quiz from here
		/**
		* takeQuiz will go through all of the questions, * handle user input, and check the answers
		* @param the quiz to be taken
		*/	
		Quiz qu=new Quiz();
		Scanner kbd=new Scanner(System.in);
		int i=0;
		do{
			
			/**qu.setQuestionNumber();
			System.out.println(quiz.getCurrentQuestion().getQuestion());
			String ans1 =kbd.nextLine();
			if(quiz.checkAnswer(ans1)==true){
				System.out.println("Correct");
				qu.setCorrect();
			}
			else{
				//quiz.
				System.out.println("Incorrect");
				qu.setWrong();
			}*/
			//quiz.checkAnswer(ans1);
		//IQuestion hello=q.;
			//System.out.println("y");
			//System.out.println(q.get(i));
		IQuestion hello=	q.get(i);
		System.out.print(hello.getQuestion());
		
		String ans =kbd.nextLine();
		System.out.println(ans);
			if(hello.checkAnswer(ans)==true){
				System.out.println("Correct");
				qu.setCorrect();
			}
			else{
				//quiz.
				System.out.println("Incorrect");
				qu.setWrong();
			}
			
			i++;
		}while (i<q.size());
	
		System.out.println("You got "+qu.getCorrect()+" correct and "+qu.getWrong()+" incorrect");
		
		//what?
		
		// TODO Auto-generated method stub
		
	}

}
