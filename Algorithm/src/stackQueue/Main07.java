package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main07 {
	public String solution(String need, String free) {
		String answer = "YES";
		Queue<Character> q1 = new LinkedList<>();
		
		for(char x : need.toCharArray()) {
			q1.offer(x);
		}
		for(char x : free.toCharArray()) {
			if(q1.contains(x)) {
				if(x != q1.poll()) {
					return "NO";
				}
			}
		}
		
		if(!q1.isEmpty()) {
			return "NO";
			}
		
		return answer;
	}

	public static void main(String[] args) {
		Main07 t = new Main07();
		Scanner in = new Scanner(System.in);
		String need = in.next();
		String free = in.next();
		
		System.out.println(t.solution(need, free));
	}

}
