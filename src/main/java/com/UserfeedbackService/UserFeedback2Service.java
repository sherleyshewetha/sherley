package com.UserfeedbackService;
import com.userfeedback2.UserFeedback2;
import java.util.List;


public interface UserFeedback2Service {
	
	
	public UserFeedback2 createUserFeedback(UserFeedback2 Userfeedback);
	
	
	public List<UserFeedback2> generateUserFeedbackByItem(String item);
	
	
	
}