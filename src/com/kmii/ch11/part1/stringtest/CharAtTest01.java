package com.kmii.ch11.part1.stringtest;

public class CharAtTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Korea oop program";
		
		System.out.println(str.charAt(3)); //문자열중에서 원하는 한글자만 반환해주는 메서드 / korea중 인덱스 3에 해당하는 'e' 출력 
		
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			// System.out.println(str.charAt(i));
			if(str.charAt(i)=='o') {
				System.out.println("문자열 내에 소문자o가 포함되어 있습니다.");
				count++;
			}
			
		}
		System.out.println(str + "문자열 내에 소문자 'o'가 " + count + "번 포함되어 있습니다.");
	}

}
