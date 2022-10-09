package sort;
//버블정렬
import java.util.Scanner;

public class Main02 {
	public int[] solution(int[] arr, int n) {
		
		int tmp = Integer.MIN_VALUE;
		
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		Main02 t = new Main02();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			 arr[i] = in.nextInt();
		}
		
		for(int x : t.solution(arr,n)) {
			System.out.print(x + " ");
		}
			
	}

}
