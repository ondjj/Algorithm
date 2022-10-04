package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Main04_1 {
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		int lt = 0;
		int rt = 0;
		
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) {
				stack.push(x-48);
			}else if(x == '+') {
				rt = stack.pop();
				lt = stack.pop();
				stack.push(lt + rt);
			}else if(x == '-') {
				rt = stack.pop();
				lt = stack.pop();
				stack.push(lt - rt);
				
			}else if(x == '*') {
				rt = stack.pop();
				lt = stack.pop();
				stack.push(lt * rt);
			}else if(x == '/') {
				rt = stack.pop();
				lt = stack.pop();
				stack.push(lt / rt);
			}
		}
		
		answer = stack.get(0);
		
		return answer;
	}

	public static void main(String[] args) {
		Main04_1 t = new Main04_1();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		System.out.println(t.solution(str));

	}

}
