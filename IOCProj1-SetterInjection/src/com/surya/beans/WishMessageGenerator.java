package com.surya.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date; // ctrl + shift + O :: To import pkg.

	// alt+shift+s,r ---> To select setters :: To get setter methods
	public void setDate(Date date) {
		this.date = date;
	}

	// b.method
	public String generateWishMessage(String user) {
		// get current hour of the day
		int hour = date.getHours();
		if (hour < 12)
			return "GM :: " + user;
		else if (hour < 16)
			return "GA::" + user;
		else if (hour < 20)
			return "GE::" + user;
		else
			return "GN::" + user;

	}

}
