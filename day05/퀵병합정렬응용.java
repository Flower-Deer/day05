package day05;

import java.util.Arrays;
import java.util.Comparator;

//254
public class �������������� {

	static class PhyscData{
		String name;
        int height;
        double vision;
		public PhyscData(String name, int height, double vision) {
			super();
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
        @Override
        public String toString() {
        // TODO Auto-generated method stub
        return name + " " + height + " " + vision;
        }
        
        static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
        private static class HeightOrderComparator implements Comparator<PhyscData>{
        	@Override
        	public int compare(PhyscData d1, PhyscData d2) {
        		
        		return (d1.height > d2.height ) ? 1 :  (d1.height > d2.height )   ?  0 : -1 ;
        	}
        }
    }
	
	public static void main(String[] args) {
          PhyscData[] x = {
                        new PhyscData("������", 162, 0.3),	
                        new PhyscData("������", 173, 0.7),
                        new PhyscData("���ؼ�", 175, 1.0),
                        new PhyscData("������", 171, 0.3),
                        new PhyscData("�̼���", 168, 0.3),
                        new PhyscData("����", 174, 0.3),
                        new PhyscData("Ȳ����", 169, 0.3) } ;
          Arrays.sort(x, PhyscData.HEIGHT_ORDER);               
          System.out.println("��ü�˻� ����Ʈ");
          System.out.println("�̸�    Ű    �÷�");
          System.out.println("----------------");
          for(int i=0; i< x.length; i++) {
        	  System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        	  
          }
          int[] aa= {3,6,0,2,8,5};
          Arrays.sort(aa);
          for(int i=0; i<aa.length; i++) {
        	  System.out.printf("%3d", aa[i]);
          }
	}
}




