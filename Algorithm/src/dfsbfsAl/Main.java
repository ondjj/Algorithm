package dfsbfsAl;

import java.util.Scanner;

public class Main {
	
	static int n;
	static int[] arr;
	static int[] ch;
	
	public String DFS(int n) {
		
		String answer = "NO";
		
		return answer;
	}

	public static void main(String[] args) {
		Main t = new Main();
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		arr = new int[n+1];
		ch = new int[n+1];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		t.DFS(1);
	}

}
