package com.userfeedbackItemRep;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.userfeedback2.UserFeedback2;


@Repository
public interface UserFeedbakItemRep extends JpaRepository<UserFeedback2, Integer> {
	
	public List<UserFeedback2> displayByItem(String item);

}
