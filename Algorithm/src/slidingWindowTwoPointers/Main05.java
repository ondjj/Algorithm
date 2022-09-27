package slidingWindowTwoPointers;
import java.util.Scanner;
//5. 연속된 자연수의 합
//설명
//N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
//만약 N=15이면
//7+8=15
//4+5+6=15
//1+2+3+4+5=15
//와 같이 총 3가지의 경우가 존재한다.


//입력
//첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.

//출력
//첫 줄에 총 경우수를 출력합니다.

//예시 입력 1 
//15

//예시 출력 1
//3
public class Main05 {
	public int solution(int n) {
		int answer = 0;
		int sum = 0;
		int lt = 1;
		
		for (int i = 1; i < n; i++) {
			sum += i;
			if(sum == n) {
				answer++;
			}
			
			while(sum>=n) {
				sum -= lt;
				lt++;
				
				if(sum == n) answer++;
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		Main05 t = new Main05();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(t.solution(n));
	}

}
