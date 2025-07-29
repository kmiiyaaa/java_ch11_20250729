package com.kmii.ch11.part1.stringtest;

public class JuminNumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String juminString = "990725-1234567"; 
		// 성별 1900년 1:남자, 2:여자, 2000년생 3:남자 , 4:여자
		
		char gender = juminString.charAt(7); // 인덱스는 0부터 시작! 
		
		switch (gender) {
		case '1':  // char타입의 문자1 , 숫자아님
		case '3':   
			System.out.println("남자");
			break;
		case '2':  
		case '4':  
			System.out.println("여자");
			break;
		}
		
		}
			
		}
		

	


