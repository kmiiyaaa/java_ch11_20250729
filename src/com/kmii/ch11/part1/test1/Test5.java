package com.kmii.ch11.part1.test1;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5. 다음 문자열에서 알파벳의 개수를 출력하는 프로그램을 작성하시오. (hint : 아스키 코드값 활용)
		//"Hello123, Java456"   for문돌려한글자씩 빼고 , 아스키 코드값 A~Z 65~90 (대문자) 문자 하나씩 빼서 아스키 코드값이  ~인지?
		//		char값이..? 
		
		 String str = "Hello123, Java456";
	        int count = 0;

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);   // 한글자씩 - char
	            int ascii = (int) ch;      // 

	            // 대문자 A~Z 또는 소문자 a~z 아스키코드값
	            if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
	                count++;
	            }
	        }

	        System.out.println("알파벳 개수: " + count);

	}

}
