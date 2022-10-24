package day05;

public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] x = { 5,8,4,2,6,1,3,9,7};
       int nx = x.length;
       partition(x, x.length);
       quickSort(x,0,nx-1); //���ȣ���� Ȱ���� ������
//       System.out.println();
//       System.out.println("������ �߽��ϴ�");
//       for(int a : x) {
//    	   System.out.printf("%3d", a);
//       }
       quickSort2(x, 0, nx-1); //��������� �����ı��ϱ�
       
	}

	private static void quickSort2(int[] x, int left, int right) {
		IntStack lstack = new IntStack(right-left+1);// 9
		IntStack rstack = new IntStack(right-left+1);
		lstack.push(left);
		rstack.push(right);
		while(lstack.isEmpty() != true) {
			int pl = left=lstack.pop();
			
		}
	}

	private static void quickSort(int[] a, int left, int right) {
		// ������
		int pl = left;
		int pr= right;
		int x = a[ (pl+pr) / 2];
		System.out.println();
		System.out.printf("a[%d]~a[%d] : { " , left, right);
		for(int i=left; i<right; i++) 
			System.out.printf("%3d",  a[i]);
		System.out.printf("%3d } ", a[right]);
		
		do {
			while( a[pl] < x) pl++;
			while( a[pr] > x) pr--;
			if(pl <= pr) swap(a, pl++, pr--);
		}while(pl <= pr);
		if(left < pr) quickSort( a, left, pr);
		if(pl < right) quickSort(a, pl, right);
	}

	private static void partition(int[] a, int n) { // n=9
		int pl=0;//���ʽ�������Ʈ�� �ε��� 0���� 
		int pr=n-1; //������ ��������Ʈ �ε��� n-1 8
		int x= a[n/2]; //����� �� ���ϱ� a[4] 5
		do {
			while( a[pl] < x) pl++; //pl=1  a[0] 1 < 5 a[1]  8 < 5 pl=1
			while( a[pr] > x ) pr--; //pr=7 pr=6
			if(pl <= pr) swap(a, pl++, pr--);
				
		}while( pl<=pr);
		System.out.println("�ǹ����� " + x + " �Դϴ�" );
		
		System.out.println("�ǹ������� ���� �׷�(����)");
		for(int i=0; i <= pl - 1;i++) {
			System.out.printf("%3d", a[i]);
		}
		System.out.println();
		System.out.println("�ǹ��� ���� �׷�");
		if(pl > pr + 1) {
			System.out.println("�ǹ��� ���� �׷�");
			for(int i=pr+1; i<=pl-1; i++) {
				System.out.printf("%3d", a[i]);
			}
			System.out.println();
		}
		
		System.out.println("�ǹ������� ū �׷�(�̻�)");
		for(int i=pr+1; i<n;i++) {
			System.out.printf("%3d", a[i]);
		}
		System.out.println();
	}

	private static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		 a[idx1] = a[idx2];
		 a[idx2] = temp;
		
	}
	

}
