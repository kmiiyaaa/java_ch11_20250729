package com.kmii.ch11.part1.stringtest;

public class AsciItTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'H';
		
		if (ch>=65 && ch<=90) { //대문자 A아스키코드값 65 , Z 90    // 이조건에 맞을때마자 count값올리면 - 영문자숫자값만 올라감
			System.out.println(ch + "는 영문자 대문자 입니다.");
			
		}else if (ch>=97 && ch<=122) {
			System.out.println(ch + "는 영문자 소문자 입니다.");
		} {
			System.out.println(ch + "는 영문자 대문자가 아닙니다.");
		}

	}

}
