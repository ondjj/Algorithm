package chap05;

import java.util.Scanner;

public class EuclidGCD {

	static int gcd(int x, int y) {
		if(y==0)
			return x;
		else
			return gcd(y, x%y);
	}
	
	static int gcdA(int x, int y) {
		while(y!=0) {
			int temp = y;
			y = x % y;
			x= temp;
		}
		return x;
	}
	
	static int gcdArray(int[] a, int start, int no) {
		if(no==1)
			return a[start];
		else if (no == 2)
			return gcd(a[start], a[start + 1]);
		else
			return gcd(a[start], gcdArray(a, start + 1, no - 1));

	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("두 정수의 최대 공약수를 구합니다. ");
        
        System.out.print("정수를 입력하세요 : "); int x= in.nextInt();
        System.out.print("정수를 입력하세요 : "); int y= in.nextInt();
        
        int max = x > y ? x : y;
        int gcdn = 0;
        for(int i=1; i<=max; i++) {
        	if(x % i == 0 && y % i == 0) {
        		gcdn = i;
        	}
        }
        
        int[] a = {12,6,8,44,34,88};
        int num = a.length;
        int arrMax = gcdArray(a, 0, num);
        
        System.out.println("최대 공약수는 " + gcd(x, y) + "입니다.");
        System.out.println("최대 공약수는 " + gcdn + "입니다.");
        System.out.println("배열의 최대 공약수는 " + arrMax + "입니다.");
	}

}
