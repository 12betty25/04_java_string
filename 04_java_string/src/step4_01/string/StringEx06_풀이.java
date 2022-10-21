package step4_01.string;

//# 문자열 1차원

public class StringEx06_풀이 {

	public static void main(String[] args) {
		
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		int[] arr = new int[3];
		
		int total = 0;
		String[] temp = str.split("/");
		
		for (int i = 0; i < temp.length; i++) {
			arr[i] = Integer.parseInt(temp[i]); //temp배열 전체를 숫자로 바꿀 수 없음
			total += arr[i];
		}
		System.out.println(total);
		
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = ""; //이게 String에서 0값?

		for (int i = 0; i < scores.length; i++) {
			text += scores[i] + ""; //+ "" -> 문자열로 변경
			if (i != scores.length - 1) {
				text += "/";
			}
		}
		System.out.println(text);
		
		
	}

}
