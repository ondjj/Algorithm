package dfsbfsAl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int n,m, answer= 0;
	static int[] ch;
	static ArrayList<ArrayList<Integer>> arr;
	
	public void DFS(int v) {
		
		if(v == n) answer ++;
		else {
			for(int nv : arr.get(v)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Main t = new Main();
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		arr = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= n; i++) {
			arr.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < m; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			arr.get(a).add(b);
		}
		
		ch = new int[n+1];
		ch[1] = 1;
		t.DFS(1);
		System.out.println(answer);
	}

}
