package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main06 {
	public int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}
		
		while(!q.isEmpty()) {
			for(int i = 1; i < k; i++) {
				int tmp = q.poll();
				q.offer(tmp);
			}
			
			if(q.size() == 1) {
				answer = q.poll();
			}
			q.poll();
		}
		return answer;
	}

	public static void main(String[] args) {
		Main06 t = new Main06();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		
		System.out.println(t.solution(n, k));
	}

}
