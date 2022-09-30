package hashMapTreeSet;

import java.util.HashMap;
import java.util.Scanner;

//4. 모든 아나그램 찾기
//S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
//아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.

//입력
//첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
//S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.

//출력
//S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.

//예시 입력 1 
//bacaAacba
//abc

//예시 출력 1
//3

public class Session_04 {
	public int solution(String a, String b) {
		int answer = 0;
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		for (int i = 0; i < b.length() - 1; i++) {
			map1.put(a.charAt(i), map1.getOrDefault(a.charAt(i), 0) + 1);
		}
		
		for(char x : b.toCharArray()) {
			map2.put(x, map2.getOrDefault(x, 0)+1);
		}
		int lt = 0;

		for (int rt = b.length() - 1; rt < a.length(); rt++) {
			
			map1.put(a.charAt(rt), map1.getOrDefault(a.charAt(rt), 0) + 1);
			
			if(map1.equals(map2)) {
				answer++;
			}
			
			map1.put(a.charAt(lt), map1.get(a.charAt(lt)) -1);
			
			if(map1.get(a.charAt(lt)) == 0) {
				map1.remove(a.charAt(lt));
			}
			lt ++ ;
			
		}

		return answer;
	}

	public static void main(String[] args) {
		Session_04 t = new Session_04();
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();

		System.out.println(t.solution(a, b));
	}

}
