package Quiz;

import java.util.List;

import Questions.IQuestion;

public interface IQuizUI {

/**
* Creates a quiz out of a set of questions * @param questions a list of questions
* @return the quiz object
*/
public IQuiz createQuiz(List<IQuestion> questions);
/**
* takeQuiz will go through all of the questions, * handle user input, and check the answers
* @param the quiz to be taken
*/
public void takeQuiz(IQuiz quiz);
}