package step4_01.string;

import java.util.Arrays;

public class StringEx07_정답예시 {

	public static void main(String[] args) {
		
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];	//name배열 생성 - String
		int[] score = new int[3];		//점수 배열 생성 - int
		
		String[] temp1 = str.split(",");	//새로운 배열 temp1에 str에서"," 나눈 요소 저장
										    //김철수/87 이만수/42 이영희/95 총 3개 요소
		for (int i = 0; i < temp1.length; i++) {
			String[] temp2 = temp1[i].split("/");	//for문을 통해 temp1에 저장했던 str 요소들을 "/"로 나눈다	
													//temp2[0] = 김철수 temp[1] = 87
			name[i] = temp2[0];						
			score[i] = Integer.parseInt(temp2[1]);  //현재 점수가 String형식으로 되어있으니 int로 바꿔주고 저장
		}
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
		



	}

}
