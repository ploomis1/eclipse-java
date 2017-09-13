package Questions;

public class TrueFalse extends Question {
	
	//constructors
	private boolean answers;
	private String question;

	public TrueFalse(String questionText, boolean answer) {
		
		this.question=questionText;
		this.answers=answer;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getQuestion() {//abstract
		// TODO Auto-generated method stub
		String questions=question+"\nEnter true or false";
		//Enter true or false
		return questions;
	}

	@Override
	public String getAnswer() {//abstract
		
		//should accept true, false, f ,t in lower case upper case or mix
		//use .toLowerCase to do this
		// TODO Auto-generated method stub
	
		String ans= Boolean.toString(answers);
		return ans;
	}

	@Override
	public boolean checkAnswer(String answer) {//abstract
		
		
		if (answer.equals(Boolean.toString(this.answers))){
			return true;
		}
		else{
			return false;
		}
		// TODO Auto-generated method stub
		//return false;
	}
	//Requirments 4.a.ii-4.a.iv.apply
	

}
