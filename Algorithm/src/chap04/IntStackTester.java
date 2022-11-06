package chap04;

import java.util.Scanner;

public class IntStackTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println();
			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1) 푸시   (2) 팝   (3) 피크   (4) 덤프   (5) 비움   (6) 크기   (7) 갯 수   (8) 비어있는지   (9) 가득찼는지   (10) x 찾기   (0) 종료 :");
			
			int menu = in.nextInt();
			if(menu == 0) break;
			
			int x;
			switch (menu) {
			case 1:
				System.out.print("데이터 : ");
				x = in.nextInt();
				try {
					s.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
				
			case 2:
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
				
			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 4:
				s.dump();
				break;
			case 5:
				s.clear();
				break;
			case 6:
				System.out.println("전체 크기 : " + s.getCapacity());
				break;
			case 7:
				System.out.println("현재 요소 개 수 : " + s.size());
				break;
			case 8:
				System.out.println(s.isEmpty());
				break;
			case 9:
				System.out.println(s.isFull());
				break;
			case 10:
				System.out.print("데이터 : ");
				x = in.nextInt();
				System.out.println("찾는 요소 : " + s.indexOf(x));
				break;
			}
	}
	}
}
