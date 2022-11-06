package step4_01.string;

// # 정렬 (사전순으로 정렬해 보시오.)

public class StringEx13_풀이 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		
		for (int i = 0; i < names.length; i++) {
			
			String minName = names[i];
			int minIdx = i;
			
			for (int j = i; j < names.length; j++) { //j = i인 이유
													 //0은 이미 제일 작은 글자(김유신)으로 결정되었으니까
				if(minName.compareTo(names[j]) > 0) {
					minName = names[j];
					minIdx = j;
				}
			}
			
			String temp = names[i];
			names[i] = names[minIdx];
			names[minIdx] = temp;
			
		}
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
	}

}
