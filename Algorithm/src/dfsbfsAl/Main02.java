package dfsbfsAl;

import java.util.Scanner;

public class Main02 {
	
	static int answer = Integer.MIN_VALUE, c, n;
	
	public void DFS(int L, int sum, int[] arr) {
		
		if(sum > c) return;
		if(L == n) {
			answer = Math.max(answer, sum);
		}else {
			DFS(L+1,sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
		
	}

	public static void main(String[] args) {

		Main02 t = new Main02();
		
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		t.DFS(0, 0, arr);
		
		System.out.println(answer);
	}

}
