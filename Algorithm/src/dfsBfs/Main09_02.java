package dfsBfs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main09_02 {
	static int n, m, answer=0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			// 1번 ArrayList부터 탐색 시작
			for(int nv : graph.get(v)) {
			
				if(ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {

		Main09_02 t = new Main09_02();
		
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		
		m = in.nextInt();
		
		// ArrayList 생성 - ArrayList<Integer> 타입의 객체를 받음
		graph = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0; i<=n; i++) {
			// 0번부터 n번까지의 객체를 추가 --> ArrayList 객체를 타입으로 받기 때문에 해당 객체를 꺼내면 ArrayList를 꺼내 사용 하는것과 동일
			graph.add(new ArrayList<Integer>());
		}
		
		// 엣지(간선)을 통해 노드가 연결 됐다면, 체크 할 수 있어야 하기 때문에 체크 배열을 n+1 크기로 생성
		// n+1 배열로 하는 이유 : 배열은 0번 인덱스부터 생성되지만, 0번은 사용하지 않고 때문에 1 - n 크기로 생성하면 체크 배열의 수가 부족하다.
		ch = new int[n+1];
		for (int i = 0; i < m; i++) {
			//노드와 노드간의 이동 방향 입력 1 - 5 -> 1번 노드가 5번 노드 방향으로 이동한다.
			int a = in.nextInt();
			int b = in.nextInt();
			graph.get(a).add(b);
		}
		// 문제에서 1번 노드를 기준으로 목적지에 도달 할 수 있는 경우의 수를 물었기 때문에 1번 인덱스는 체크하고 시작한다.
		ch[1] = 1;
		t.DFS(1);
		System.out.println(answer);
	}

}
