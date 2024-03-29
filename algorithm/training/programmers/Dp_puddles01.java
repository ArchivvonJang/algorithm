package programmers;
//동적계획법 등굣길
//점화식 grid(n. m) = grid(n, m -1) + grid(n-1, m)
import java.util.Arrays;

public class Dp_puddles01 {
	private static int [][]dp;
						//세로 갯수 , 가로 갯수, 웅덩이 좌표
	static int solution(int m, int n, int[][] puddles) {
		
	   ///dp[n][m] :0,0 -> i,j로 가는 경우의 수 
	   // 배열의 인덱스는 0 시작이지만, 문제에서는 1 시작으로 배열[n+1][m+1] 
	   dp = new int[n+1][m+1];
	   
	   //웅덩이 피하기 - 배열의 위치의 값은 -1로 초기화
	   Arrays.stream(puddles).forEach(v -> dp[v[1]][v[0]] = -1);
	   
	   //출발지점 좌표 설정
	   dp[1][1]=1;
	   
	   return toSchool(n,m);
    }
	
	private static int toSchool(int row, int col) {
		
		System.out.println("row : " + row + ", col : " + col);
		
		System.out.println("dp[row][col] : "+dp[row][col]);
		
		if(row < 1 || col < 1 || dp[row][col] < 0) return 0;
		
		//처리된 값이 있다면 그 값을 반환
		if(dp[row][col] > 0) return dp[row][col];
		
		
		
		System.out.println("toSchool(row, col-1) : " + toSchool(row, col-1));
		System.out.println("toSchool (row-1 , col) : " + toSchool (row-1 , col));
		System.out.println(toSchool(row, col-1) + toSchool (row-1 , col));
		
	
		return dp[row][col] = (toSchool(row, col-1) + toSchool (row-1 , col)) % 1000000007;
		
	}
	
	public static void main(String[] args) {
		//y,x
		int[][] puddles = {{2,2}};   // puddle[I][J] 배열에서  puddle[I][0] 열(col),puddle[I][1] 행(row)
		int m = 4; 
		int n = 3;
		
		System.out.println(solution(m,n,puddles));
		
	}

}
