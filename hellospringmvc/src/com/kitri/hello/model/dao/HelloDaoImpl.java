package com.kitri.hello.model.dao;

import java.util.Calendar;

public class HelloDaoImpl implements HelloDao {

	Calendar calendar;
	
	public void makeCalendar() {
		calendar = Calendar.getInstance();
	}
	
	public String getGreeting() {
		// nullpoint에러 나는 이유는 100퍼센트 .앞에 값이 없어서
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		if(hour > 7 && hour < 12) {
			return "즐거운 아침되세요.";
		} else if(hour >= 12 && hour < 18) {
			return "맛나는 점심되세요.";
		} else {
			return "굿밤되세요.";
		}
	}
	
}
