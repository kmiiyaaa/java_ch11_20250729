package com.kmii.ch11.part1;

import java.util.Date;

public class ToStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object ob =  new Object();
		System.out.println(ob.toString());  // 오버라이딩 하지 않고 쓰면 - 일종의 16진수로 된 해시코드 같은것 나온다
		
		//오버라이딩 해서 쓰면
		Member member1 = new Member();  // id값 : null값 / member 안에있는 id값이 null값인지 확인
		Member member2 = new Member("Tiger");  // id값 : Tiger
		System.out.println(member2.toString()); // Tiger
		System.out.println(member1.id); // null
		
		
		Date date = new Date();
		System.out.println(date.toString());  //Date 클래스안에 오버라이딩 되어서 해시코드 가 아닌 날짜,시간이 찍힘

	}

}
