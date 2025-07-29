package com.kmii.ch11.part1;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer int1 = new Integer("1000"); // 이방법은 추천하지 않는다
		System.out.println(int1.intValue()+1000);
		
		
		Integer int2 = 100;
		
		
		int a = Integer.parseInt("1000"); //문자열 숫자를 진짜 숫자로 바꾸기 "1000" -> 1000

	}

}
