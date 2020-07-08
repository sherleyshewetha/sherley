package com.UserfeedbackService.Service;


import com.userfeedback2.UserFeedback2;
import com.UserfeedbackService.UserFeedback2Service;
import com.userfeedbackItemRep.UserFeedbakItemRep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserfeedbackserviceImplementation implements UserFeedback2Service {
	
@Autowired
private UserFeedbakItemRep rep;

@Override
public UserFeedback2 createUserFeedback (UserFeedback2 Userfeedback) {
	
	return rep.save(Userfeedback);
}

@Override
public List<UserFeedback2> generateUserFeedbackByItem(String item) {
	
	return rep.displayByItem(item);
}

}