package Quiz;

import java.util.List;

import Questions.IQuestion;

public class Quiz implements IQuiz {
	private int questionNumber;
	private boolean started;
	private boolean completed;
	private IQuestion question;
	private IQuestion nextQuestion;
	private int correct;
	private int wrong;
	private List<IQuestion> q;
	private IQuestion ans;
	

	public Quiz() {
		this.started=true;
		
		
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setQuestions(List<IQuestion> questions) {
		q=questions;
		
		question=questions.get(questionNumber);
		nextQuestion=questions.get(questionNumber+1);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IQuestion> getQuestions() {
		// TODO Auto-generated method stub
		
		
		return q;
	}

	@Override
	public int getNumberOfQuestions() {
		// TODO Auto-generated method stub
		
		
		return q.size();
	}

	@Override
	public boolean isStarted() {
		// TODO Auto-generated method stub
		return started;
	}

	@Override
	public boolean isCompleted() {
		if (questionNumber==q.size()-1){
			
		}
		else{
			completed=false;
		}
	
		// TODO Auto-generated method stub
		return completed;
	}

	@Override
	public boolean hasNextQuestion() {
		// TODO Auto-generated method stub
		
		if(questionNumber==q.size()-1){
			return false;
		}
		
		else{
			return true;
		}
			
		
		//return true;
	}

	@Override
	public IQuestion getNextQuestion() {
		// TODO Auto-generated method stub
		//from question class
		return nextQuestion;
	}

	@Override
	public IQuestion getCurrentQuestion() {
		// TODO Auto-generated method stub
		
		
		//from question class
		return question;
	}

	@Override
	public String getCurrentAnswer() {
		// TODO Auto-generated method stub
		
		//from question class
		return q.get(questionNumber).getAnswer();
	}

	@Override
	public boolean checkAnswer(String answer) {
		// TODO Auto-generated method stub
		boolean ans =q.get(questionNumber).checkAnswer(answer);
		//compare from question class
		return ans;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
		//reset which question we are on and 
		this.completed=false;
		this.questionNumber=0;
		this.wrong=0;
		this.correct=0;
		this.started=false;
	}

	@Override
	public int getQuestionNumber() {
		// TODO Auto-generated method stub
		
		
		return questionNumber;
	}
	public void setQuestionNumber(){
		this.questionNumber+=1;
	}
	
	public void setCorrect(){
		correct+=1;
	}
	public void setWrong(){
		this.wrong+=1;
	}
	public int getCorrect(){
		return correct;
	}
	public int getWrong(){
		return wrong;
	}

}
