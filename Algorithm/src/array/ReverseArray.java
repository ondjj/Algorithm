package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t =a[idx1]; 
		a[idx1] = a[idx2]; 
		a[idx2] = t;
		System.out.println(Arrays.toString(a));
	}
	
	static void reverse(int[] a) {
		for(int i=0; i< a.length/2; i++) {
			swap(a, i, a.length - i - 1);
			System.out.println("배열 a[" + i + "] 과 배열 a[" + (a.length-i-1) + "]을 교환합니다.");
		}
	}
	
	static int sumOf(int[] a) {
		int sum = 0;
		for(int x : a) { sum += x; }
		return sum;
	}
	
	static void copy(int[] a, int[] b) {
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
		}
	}
	
	static void rcopy(int[] a, int[] b) {
		for(int i=0; i<a.length/2; i++) {
			b[i] = a[a.length-1-i];
		}
		System.out.println("Rcopy : "+Arrays.toString(b));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = in.nextInt();
		
		int[] x = new int[num];
		int[] y = new int[x.length];
		
		for(int i=0; i<num; i++) {
			System.out.print("X["+ i + "] : ");
			x[i] = in.nextInt();
		}
		
		copy(x, y);
		
		reverse(x);
		
		rcopy(x, y);
		
		System.out.println("배열을 역순으로 정렬했습니다.");
		System.out.println("X = " + Arrays.toString(x));
		System.out.println("배열의 총 합 : " + sumOf(x));
		System.out.print("복사된 배열 y : ");
		for(int c : y) {
			System.out.print(c + " ");
		}
		System.out.println();

		
	}

}
