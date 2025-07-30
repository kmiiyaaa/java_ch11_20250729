package com.kmii.ch11.part1.test1;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4. "i like chopin" 문자열에서 첫글자만 대문자로 변경하여 출력하는 프로그램을 작성하시오.   index가지고 하기?
		//index 0 -> 대문자, index2-> 대문자. index7-대문자
		// ex) I Like Chopin
		//빈문자열을  만들어서  
		//그다음 나온 애가 공백이면 그다음 나오는애들은 대문자로 바꿔ㅗ숴?  넣은애는이제 안들어가도 되낚 인덱스값을 늘려서 하고
		//다시 공백나오면 대문자로 만들고 그다음 인덱스값을 늘려서 if if-else if-else 하면서 추가
		//charat나오면 배열로? 
		
		String str= "i like chopin";
		String result=""; 
		
		// str = str.toLowerCase(); 만약, 다른문자열에 중간중간 대문자가 있으면 미리 소문자로 만들고 하기 좋음
		
		result += Character.toUpperCase(str.charAt(0)); // 첫값 I지정? 
		
		for (int i = 1; i<str.length();i++) {
			if(str.charAt(i-1) == ' ') { //해당인덱스 전이 공백이면
				result += Character.toUpperCase(str.charAt(i)); //현재 인덱스 대문자로 고치기
			} else { //공백이 아니면
				result += str.charAt(i); //기존글자에 이어붙이기
			}
		}


			System.out.println(result); 

	}

}
