package com.kmii.ch11.part2;

import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Calendar now = Calendar.getInstance();  // getInstance : static메서드
	
	int year = now.get(Calendar.YEAR);  // 2025
	int month = now.get(Calendar.MONTH) +1;  // 7 , month는 +1 해줘야한다
	int day = now.get(Calendar.DAY_OF_MONTH); // 29
	
	int hour = now.get(Calendar.HOUR);
	int minute = now.get(Calendar.MINUTE);
	int second = now.get(Calendar.SECOND);
	
	System.out.println(year + "년" + month + "월" + day + "일");
	System.out.println(hour + "시 " + minute + "분 "+second + "초");
	
	
	//요일 출력하기
	
	int weekday = now.get(Calendar.DAY_OF_WEEK);
	System.out.println(weekday); //3
	System.out.println(Calendar.TUESDAY); //TUESDAY: 상수값 (3)으로 정의
	
	
	if(weekday == Calendar.TUESDAY) {
		System.out.println("오늘은 화요일 입니다!!!!");
	} else {
		System.out.println("오늘은 화요일이 아닙니다..");
	}
	
		

	}

}
