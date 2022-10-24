package day05;

public class ������ {

	public static void main(String[] args) {
		int[] x= {6,4,3,7,1,9,8};
		int nx = x.length;
		heapSort(x, nx);
		System.out.println("���� ������ �������߽��ϴ�.");
		for(int aa : x) {
			System.out.printf("%3d", aa);
		}
	}

	private static void heapSort(int[] a, int n) {
		for(int i=(n-1)/2 ; i>=0; i--) {  //i=3, 2, 1, 0
			downHeap(a, i, n-1);//�� ����� �θ���� �ڽĳ�庸�� ū ���ڸ� ������ �Ѵ�
		}
		for(int i=n-1; i>0; i--) { //i=6 5 4 3 2 1 
			swap(a, 0, i);
			downHeap(a, 0, i-1);
		}
	}

	private static void swap(int[] a, int idx1, int idx2) {
		int t=a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		
	}

	private static void downHeap(int[] a, int left, int right) { //left 3 right 6
		int temp = a[left]; // temp = a[3] temp = 7
		int child;
		int parent;
		
		for( parent = left; parent < (right + 1) / 2; parent = child) {
			// parent = 3; parent < 3 ; 
			int cl=parent * 2 + 1;//���� �ڽ��� �迭 �ε���
			int cr = cl + 1;//������ �ڽ��� �迭�� �ε���
			child =(cr <= right && a[cr] > a[cl])  ? cr : cl;
			if(temp >=  a[child]) 
				break;
			a[parent] = a[child];
		}
	   	a[parent] = temp;
	}

}
