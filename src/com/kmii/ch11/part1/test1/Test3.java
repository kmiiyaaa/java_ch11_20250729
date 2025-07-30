package com.kmii.ch11.part1.test1;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//"banana" 에서 중복된 문자를 제거하면 "ban" 이 됩니다. 중복으로 나오는 문자를 제거하여 "banana"를 "ban"으로 출력하는 프로그램을 작성하시오. / for문으로 한글자씩 빼서 / charAt/ 문자하나뺐는데 
		// charAt써서 한글짜씩 빼기 for 이용해서 // indexof를써서 문자열이 이안에 있는지 보는것

				String str = "banana";
				String result = "";
				
				for (int i = 0; i < str.length(); i++) {
			       char c = str.charAt(i); // 하나씩 추출되니까 string말고 char,
			       if (result.indexOf(c) == -1) {  //indexOf() : 문자열 찾기
			                result += c;
			            }
			        }

			        System.out.println(result);
		 
		
	}

}
