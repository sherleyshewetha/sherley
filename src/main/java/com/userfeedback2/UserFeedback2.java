package com.userfeedback2;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class UserFeedback2 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private String Userfeedback;
	private int ratingValue;
	private String user;
	private String item;
	private int userID;
	
	public UserFeedback2() {
		super();
	}
	
	public UserFeedback2(String Userfeedback, int ratingValue, String item, String user) {
		super();
		this.user = user;
		this.item = item;
		this.Userfeedback = Userfeedback;
		this.ratingValue = ratingValue;
	}
public String getUser() {
		return user;
	}

public void setUser(String user) {
		this.user = user;
	}

public String getItem() {
		return item;
	}
public void setItem(String item) {
		this.item = item;
	}

public String getUserFeedback() {
		return Userfeedback;
	}

public void setUserFeedback(String Userfeedback) {
		this.Userfeedback = Userfeedback;
	}

 public int getRatingValue() {
		return ratingValue;
	}
public void setRatingValue(int ratingValue) {
		this.ratingValue = ratingValue;
	}
	
}
