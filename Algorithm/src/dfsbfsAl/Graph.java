package dfsbfsAl;

import java.util.Scanner;

public class Graph {
	static int[][] array;
	static int[] ch;
	static int n = 0;
	static int m = 0;
	static int answer = 0;
	
	public int graph(int node) {
		
		if(node == n) {
			answer++;
		}else {
			for (int i = 1; i <=n; i++) {
				if(array[node][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					graph(i);
					ch[i] = 0;
				}
				
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Graph t = new Graph();
		Scanner in = new Scanner(System.in)
;
		n = in.nextInt();
		m = in.nextInt();
		ch = new int[n+1];
		array = new int[n+1][n+1];
		
		for (int i = 0; i < m; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			array[a][b] = 1;
		}
		ch[1] = 1;
		t.graph(1);
		System.out.println(answer);
	}

}
