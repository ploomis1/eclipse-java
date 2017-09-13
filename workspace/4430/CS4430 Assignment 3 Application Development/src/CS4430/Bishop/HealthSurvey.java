package survey;

import java.util.ArrayList;

public interface HealthSurvey {
    
    public void createSurvey(String surveyName,String[][] survey);

	public boolean submit(String[][] att);
		
	public ArrayList<String> retrieveByNumber(int dataNum);
	
}
