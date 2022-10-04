package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Main03_1 {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();

		for (int pos : moves) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][pos - 1] != 0) {
					int tmp = board[i][pos - 1];
					board[i][pos - 1] = 0;
					if(!stack.isEmpty() && stack.peek() == tmp) {
						answer +=2;
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
		Main03_1 t = new Main03_1();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] board = new int[n][n];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = in.nextInt();
			}
		}

		int m = in.nextInt();
		int[] moves = new int[m];
		for (int i = 0; i < moves.length; i++) {
			moves[i] = in.nextInt();
		}

		System.out.println(t.solution(board, moves));
	}

}
