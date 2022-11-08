package step4_01.string;

import java.util.Scanner;

/*
 * # 단어 검색
 * 
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */


public class StringEx16_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		
		char[] arr = new char[text.length()];				//문장을 배열로 만들어주기 text length만큼 배열 크기 저장
		
		for (int i = 0; i < text.length(); i++) {			
			arr[i] = text.charAt(i);						//저장(공백이랑 온점까지)
		}
		
		int textSize = word.length();						//입력받은 단어의 크기 변수 생성
		boolean isSame = false;								//확인 변수 생성 - 단어 크기 확인용 
		for (int i = 0; i < arr.length - textSize + 1; i++) {	//i는 최대 13까지 올 수 있음 
			// 마지막으로 올 수 있는 단어의 시작이 Short의 s (arr[13])이기 때문
			int correctCnt = 0;						
			for (int j = 0; j < textSize; j++) {
				if (arr[i+j] == word.charAt(j)) {
					correctCnt++;
				}
			}
			if (correctCnt == textSize) {
				isSame = true;
			}
		}
		
		if (isSame) 	System.out.println("일치"); 
		else 			System.out.println("불일치");
		
		
		scan.close();
	}

}
