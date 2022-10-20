package dfsBfs;

import java.util.Scanner;

public class Main09 {
	static int n, m, answer = 0;
	static int[][] graph;
	static int[] ch;
	
	// v : 출발점
	public void DFS(int v) {
		
		if(v==n) answer++;
		else {
			for (int i = 1; i <= n; i++) {
					// 출발점 v 도착지 i v -> i 방향으로 탐색 시작
				if(graph[v][i] == 1 && ch[i] == 0) {
					// 방문하면 체크
					ch[i] = 1;
					DFS(i);
					// 빽트래킹
					ch[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main09 t = new Main09();
		Scanner in = new Scanner(System.in);
		
		// 노드 개 수
		n = in.nextInt();
		
		// 간선 엣지 개 수 
		m = in.nextInt();
		
		// n+1 --> 1번 인덱스부터 n번까지의 정점 번호를 의미
		graph = new int[n+1][n+1];
		
		// 방문배열 역시 정점 번호 의미
		ch = new int[n+1];
		
		for (int i = 0; i < m; i++) {
			// 간선 방향 ex : 1 2 --> 1번에서 2번 방향
			int a = in.nextInt();
			int b = in.nextInt();
			// 출발점 1
			graph[a][b] = 1;
		}
		// 출발점 체크
		ch[1] = 1;
		t.DFS(1);
		System.out.println(answer);
	}

}
