package step4_01.string;

// 문자열 관련 데이터 형변환

public class StringEx04 {

	public static void main(String[] args) {

		// [1] 문자열 > 숫자 형변환
		String birth = "2022";
		System.out.println(birth + 1); //20221, 문자열인 "2022"에 1을 이어붙이는 거니까 20221 
		int nBirth = Integer.parseInt(birth); //Integer.parseInt("문자열") 메서드 사용
		System.out.println(nBirth + 1);
		
		
		// [2] 숫자 > 문자열 형변환
		
		// 2-1) + "" 사용
		int salary = 2000000;
		String str1 = salary + "";
		System.out.println(str1 + 50000); //200000050000 출력
		
		// 2-2) Integer.toString(숫자) 사용
		String str2 = Integer.toString(salary);
		System.out.println(str2 + 50000); //200000050000 출력
		
		// 2-3) String.valueOf(숫자) 사용
		String str3 = String.valueOf(salary);
		System.out.println(str3 + 50000); //200000050000 출력
		
		System.out.println();
		
		//[참고] 구글에서 ASCII코드표 검색
		
		//문자 > 숫자 
		
		char ch1 = 'a';
		int n1 = ch1;
		System.out.println(ch1 + " / " + n1);
		
		//숫자 > 문자
		int n2 = 65;
		char ch2 = (char)n2; 
		System.out.println(ch2 + " / " + n2);
		
		System.out.println((int)'s' + 3);
		System.out.println((char)(65 + 10));
		
		
	}

}
