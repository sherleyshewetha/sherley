package com.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.userfeedback2.UserFeedback2;
import com.UserfeedbackService.UserFeedback2Service;

@RestController

public class FeedbackRestController {
@Autowired

private UserFeedback2Service service;
@PostMapping ("/Userfeedback")
public UserFeedback2 createUserFeedback(@RequestBody UserFeedback2 Userfeedback) {
	
	return service.createUserFeedback(Userfeedback);
}


@GetMapping("/Userfeedback/{item}")


public List<UserFeedback2> generateUserFeedbackByItem(@PathVariable("item") String item) {
	
	return service.generateUserFeedbackByItem(item);
}

}


