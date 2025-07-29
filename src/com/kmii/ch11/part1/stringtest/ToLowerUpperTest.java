package com.kmii.ch11.part1.stringtest;

public class ToLowerUpperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "KOREA";
		String str2 = "japan";
		String str3 = "JAPAN";
		
		System.out.println(str1.toLowerCase()); //  모두 소문자로 변경
		System.out.println(str1);  // 원본을 건드리진 않았다 -> 새로 저장해서 써야함
		System.out.println(str2.toUpperCase()); // 모두 대문자로 변경 - 원본은 수정하지 않음
		str2 = str2.toUpperCase(); //대문자로 변환 후 overwrite(덮어쓰기) , 선언전에는 다르다고 나오고 선언후에는 같다고 나온다.
		
		
		if(str2.equals(str3)) {
			System.out.println("두 문자열은 같다");
		} else {
			System.out.println("두 문자열은 다르다");
		}
		
		

	}

}
