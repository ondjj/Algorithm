package chap06;

import java.util.Scanner;

public class BubbleSort {
	static int cnt = 0;
	static int pass = 0;
	
	static void swap(int[] a, int idx1, int idx2) {
		pass++;
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	// 맨뒤→ 맨앞 순서로 스캔
	static void bubbleSort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			for(int j=a.length-1; j>i; j--) {
				cnt++;
				if(a[j-1] > a[j])
					swap(a,j-1,j);
			}
		}
	}
	// 맨앞 → 맨끝 순서로 스캔
	static void bSort(int[] a) {
		for(int i= a.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				cnt++;
				if(a[j] > a[j+1])
					swap(a,j,j+1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전 1)");
		System.out.print("요소 수 : "); int nx = in.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i<nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = in.nextInt();
		}
		bSort(x);
		
		System.out.println("오름 차순으로 정렬했습니다.");
		for(int i=0; i< nx; i++)
            System.out.println("x[" + i + "]=" + x[i]);
		System.out.println("비교를 " + cnt + "회 했습니다.");
		System.out.println("교환을 " + pass + "회 했습니다.");
	}
	
	

}
