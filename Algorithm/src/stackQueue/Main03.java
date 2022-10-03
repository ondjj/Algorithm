package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Main03 {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int pos : moves) {
			for (int i = 0; i < board.length; i++) {
				if(board[i][pos-1] != 0) {
					int tmp = board[i][pos-1];
					board[i][pos-1] = 0;
					if(!stack.isEmpty() && tmp == stack.peek()) {
						answer += 2;
						stack.pop();
					}else {
						stack.push(tmp);
					}
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main03 t = new Main03();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[n][n];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		int k = in.nextInt();
		int[] moves = new int[k];
		for (int i = 0; i < moves.length; i++) {
			moves[i] = in.nextInt();
		}
		
		System.out.println(t.solution(arr, moves));
	}

}
