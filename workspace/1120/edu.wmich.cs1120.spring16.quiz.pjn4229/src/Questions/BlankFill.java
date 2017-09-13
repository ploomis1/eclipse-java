package Questions;

public class BlankFill extends Question{
	
	//constructors
	private String answers;
	private String question;
	
	public BlankFill(String questionText,String answer){
		this.question=questionText;
		this.answers=answer;
		
		//calls question constructor to set the questionTest vairable
	}
	
	@Override
	public String getQuestion() {//abstract
		// TODO Auto-generated method stub
		String questions=question+"\nFill in the blank";
		//add" \nFill in the blank" to question text
		return questions;
	}

	@Override
	public String getAnswer() {//abstract
		// TODO Auto-generated method stub
		return answers;
	}

	@Override
	public boolean checkAnswer(String answer) {//abstract
		
		if (answer.equals(answers)){
			return true;
		}
		else{
			return false;
		}
		// TODO Auto-generated method stub
		//return false;
	}
	
	

}
