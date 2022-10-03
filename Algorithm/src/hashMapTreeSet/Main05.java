package hashMapTreeSet;
//5. K번째 큰 수
//설명
//현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
//현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
//기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
//만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main05 {
	public int solution(int n, int k, int[] arr) {
		int answer = -1;
		TreeSet<Integer> tree = new TreeSet<>(Collections.reverseOrder());
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int j2 = j+1; j2 < arr.length; j2++) {
					tree.add(arr[i] + arr[j] + arr[j2]);
				}
			}
		}
		int count = 0;
		for(int x : tree) {
			count++;
			if(count == k) {
				answer = x;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main05 t = new Main05();
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int k = in.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println(t.solution(n, k, arr));
	}
}
