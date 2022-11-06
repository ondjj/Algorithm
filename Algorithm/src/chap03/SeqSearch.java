package chap03;

import java.util.Scanner;

public class SeqSearch {

	
	static int seqSearch(int[] a, int n, int key) {
		int i=0;
		
		while(true) {
			if(i==n)
				return -1;
			if(a[i] == key)
				return i;
			i++;
		}
	}
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int n = in.nextInt();
		int[] x = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = in.nextInt();
		}
		System.out.print("검색할 값: ");
		int ky = in.nextInt();
		
		int idx = seqSearch(x, n, ky);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
		}
	}

}
