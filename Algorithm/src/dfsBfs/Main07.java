package dfsBfs;

import java.util.LinkedList;
import java.util.Queue;

class Node2{
	int data;
	Node2 lt, rt;
	
	public Node2(int val){
		data = val;
		lt=rt=null;
	}
}

public class Main07 {
	
	Node2 root;
	
	public void BSF(Node2 root) {
		
		Queue<Node2> Q = new LinkedList<>();
		
		Q.offer(root);
		
		int L = 0;
		
		while(!Q.isEmpty()) {
			
			int len = Q.size();
			
			System.out.print(L + " : ");
			
			for(int i=0; i<len; i++) {
				Node2 cur = Q.poll();
				System.out.print(cur.data + " ");
				if(cur.lt != null) {
					Q.offer(cur.lt);
				}
				if(cur.rt != null) {
					Q.offer(cur.rt);
				}
			}
			System.out.println();
			L ++;
		}
	}
	
	

	public static void main(String[] args) {
		
		Main07 tree = new Main07();
		tree.root = new Node2(1);
		tree.root.lt = new Node2(2);
		tree.root.rt = new Node2(3);
		tree.root.lt.lt = new Node2(4);
		tree.root.lt.rt = new Node2(5);
		tree.root.rt.lt = new Node2(6);
		tree.root.rt.rt = new Node2(7);
		tree.BSF(tree.root);
	}

}