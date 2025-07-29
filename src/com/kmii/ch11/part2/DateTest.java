package com.kmii.ch11.part2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date nowTime = new Date();  // 현재시간 가져오기
		System.out.println(nowTime.toString());  // 현재시간을 문자열로 저장한것
		
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String date2 = dateFormat1.format(nowTime);
		System.out.println(date2);
		String date3 = dateFormat2.format(nowTime);
		System.out.println(date3);
		
		// nowTime.누르고 get메서드 에서 원하는것만 추출해서 출력도 가능
		System.out.println(nowTime.getTime()+(2*60*60*1000)); // 현재시각기준으로 2시간후
		long newTime = nowTime.getTime()+(2*60*60*1000);
		nowTime.setTime(newTime);
		System.out.println("지금부터 2시간 후 : " + nowTime);
	}

}
