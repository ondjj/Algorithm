package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Main05 {
	public int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < str.length(); i ++) {
			if(str.charAt(i) == '(') {
				stack.push('(');
			}else if(str.charAt(i) == ')' && str.charAt(i-1) == ')'){
				stack.pop();
				answer ++;
			}else {
				stack.pop();
				answer += stack.size();
				
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Main05 t = new Main05();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		System.out.println(t.solution(str));

	}

}
