package chap06;
// 셸정렬(버전 2 : h = …, 40, 13, 4, 1)

import java.util.Scanner;

class ShellSort2 {
    //--- 셸 정렬 ---//
    static void shellSort(int[] a, int n) {
        int h;
        // --- 1부터 시작해 값을 3배하고 1을 더하면서 n을 넘지 않는 가장 큰 값 --- //
        for (h = 1; h < n; h = h * 3 + 1)
            ;

        // --- 반복할 때마다 h값을 3으로 나눠 마지막 h값은 1이된다.
        for ( ; h > 0; h /= 3)
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                // --- 정렬 조건 : 반복문 종료 조건 
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h)
                    a[j + h] = a[j];
                a[j + h] = tmp;
            }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("셸 정렬(버전 2)");
        System.out.print("요솟수: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        shellSort(x, nx);            // 배열 x를 셸정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]=" + x[i]);
    }
}
