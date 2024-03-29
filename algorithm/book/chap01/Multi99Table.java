package chap01;

public class Multi99Table {
	// 다중루프 : 반복안에서 다시 반복 중첩
	
	// 곱셈표
	// 실습 1-7 이중루프를 사용하는 알고리즘 - 곱셈표
	public static void main (String[] args) {
		System.out.println("  --------- 곱셈표 ---------");
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%3d", i*j); //%3d 3자리의 정수형을 표현, 1의 자리숫자이면 앞에 빈공간 2개 생김, $03d는 빈공간에 0이 들어감
			} // for j end
			System.out.println();
		}// for i end
	}
	
	/*
	  --------- 곱셈표 ---------
	  1  2  3  4  5  6  7  8  9  j는 가로 출력 i=1 i*j(1,2....9)
	  2  4  6  8 10 12 14 16 18
	  3  6  9 12 15 18 21 24 27
	  4  8 12 16 20 24 28 32 36
	  5 10 15 20 25 30 35 40 45
	  6 12 18 24 30 36 42 48 54
	  7 14 21 28 35 42 49 56 63
	  8 16 24 32 40 48 56 64 72
	  9 18 27 36 45 54 63 72 81
	  
	  i는 세로 출력
	 */
}
