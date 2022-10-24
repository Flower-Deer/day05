package day05;



public class ��������Ʈ����� {

	public static void main(String[] args) {
	  List arr = new List();
      arr.createList(10);//����ִ� ����Ʈ����� 
      System.out.println(arr.isEmpty(arr));//����Ʈ�ȿ� ����ִ��� �Ǵ�
      arr.insert(arr, 0, 1);
      arr.printall(arr);
      
      arr.insert(arr, 1, 2);
      arr.printall(arr);
      
      arr.insert(arr, 0, 3);
      arr.printall(arr);
      
      arr.insert(arr, 1, 4);
      arr.printall(arr);
      
      arr.delete(arr, 4);
     
      
//      List ulist =new ArrayList<Integer>();
//      ulist.add(10);
//      ulist.add(20);
//      ulist.add(1, 40);
//      ulist.add(30);
//      for(int i=0; i< ulist.size(); i++) {
//    	  System.out.println(i + "  "+ ulist.get(i));
//      }
	}

}
class List{
    int arr[];
    int size;
	public void createList(int number) {
		// �迭�� ũ�⸦ 10�� �迭 ����
		arr = new int[number];
		size=0;
	}
	public void delete(List a, int x) {
		// �ش簪�� ã�Ƽ� �����ϱ�
		for(int i=0; i< size; i++) {
			if(a.arr[i]==x) {
				while(i < size-1) a.arr[i] = a.arr[i+1];
				size--;
			}
		}
		
	}
	public void printall(List a) {
		// ��ü ����ϱ�
		System.out.println("-------");
		for(int i=0; i<size; i++) {
			System.out.printf("%3d", a.arr[i]);
		}
		
		
	}
	public void insert(List a, int i, int x) {
		// ����Ʈ�� �� �����ϱ�
		int len = size;
		while(i != len ) {
			a.arr[len] = a.arr[len-1];
			len--;
		}
		a.arr[i] = x;
		size++;
	}
	public boolean isEmpty(List a) {
		// �迭�� ����ִ��� Ȯ���ϱ� 
		return a.size == 0;
	}
	
}

//����Ʈ�� �����͸� ������� ������ ����
//���� ����Ʈ�� �ִ� ���� ���
//head node-���� ó���� �ִ� ���, tail node-���� �������� �ִ� ���
//predecessor node-�ϳ��� ��带 �������� �ٷ� �տ� ���
//successor node-�ϳ��� ��带 �������� �ٷ� �ڿ� ���