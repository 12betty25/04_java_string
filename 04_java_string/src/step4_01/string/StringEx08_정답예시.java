package step4_01.string;

public class StringEx08_정답예시 {

	public static void main(String[] args) {
		
		// 문제) 이름과 성적을 하나의 문자열로 연결
		// 정답) "김철수/87,이만수/42,이영희/95"
				
		String[] name = {"김철수", "이만수", "이영희"};
		int[] score = {87, 42, 95};
		
		String str = ""; //string에서 0값으로 맞추는 방법
		
		for (int i = 0; i < name.length; i++) {
			str += name[i] + "/" +  score[i]; //이름과 "/"과 성적을 합친다
			if (i != name.length-1) {		  //만약 i가 마지막이 아니라면 (영희 다음엔 올 사람이 없으니 "," 생략)
				str += ",";					  //콤마 출력
			}
		}

		System.out.println(str);


	}

}
