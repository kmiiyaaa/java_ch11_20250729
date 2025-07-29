package com.kmii.ch11.part1.stringtest;

public class ReplaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "길동이는 순신이보다 키가 큽니다. 하지만 순신이가 길동이보다 말을 잘합니다." ;  // 길동 -> 유신
		// str.replace("길동", "유신");  //원본은 수정하지 않음.
		String replaceStr = str.replace("길동", "유신"); // 새로운 변수로 저장
		System.out.println(replaceStr);
	
	}

}
