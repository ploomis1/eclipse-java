package Questions;

public class ShortAns extends Question {
	//constructors
	private String answers;
	private String question;

	public ShortAns(String questionText, String answer) {
		
		this.question=questionText;
		this.answers=answer;
		// TODO Auto-generated constructor stub
	}
	//requirments 4.a.ii-4.a.iv.apply
	
	
	@Override
	public String getQuestion() {//abstract
		// TODO Auto-generated method stub
		String questions=question+"\nType in a one word answer";
		//Type in a one word answer
		return questions;
	}

	@Override
	public String getAnswer() {//abstract
		// TODO Auto-generated method stub
		return answers;
	}

	@Override
	public boolean checkAnswer(String answer) {//abstract
		// TODO Auto-generated method stub
		
		if(answer.equals(this.answers)){
			return true;
		}
		
		else{
			return false;
		}
		
		//return false;
	}
	
	
	
	

}
