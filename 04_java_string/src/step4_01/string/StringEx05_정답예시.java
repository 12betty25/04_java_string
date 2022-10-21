package step4_01.string;



public class StringEx05_정답예시 {

	public static void main(String[] args) {
	
		String jumin = "890101-2012932";
		
		// 문제 1) 나이 출력
		// 정답 1) 34세
		
		String strAge = jumin.substring(0, 2); //주민등록번호에서 89만 꺼내기
		int intAge = Integer.parseInt(strAge); //89 문자를 숫자로 바꿔주기
		int age = 2022 - (1900 + intAge) + 1;  //나이로 계산하기
		System.out.println(age + "세");
		
		
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		
		char key = jumin.charAt(7);
		if (key == '1' || key == '3') {
			System.out.println("남성");
		}
		else if (key == '2' || key == '4') {
			System.out.println("여성");
		}


	}

}
