//package collectionTest;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class ArrayListTest {
//	public static void main(String[] args) {
////		<?> : ���׸�(�̸��� ����)
////		��üȭ �� Ÿ���� �����ϴ� ���
////		������ ������ Ÿ���� ������ �� ���� ������ �ӽ÷� Ÿ���� ������ �� ����Ѵ�
////		���� �ٿ� ĳ������ �� �ʿ䰡 ������, ������ Ÿ�Կ� ������ �� �� �ִ�.
//		
//		ArrayList<Integer> datas = new ArrayList<>();
//		final int SIZE = 9;
//		
//		for(int i = 0; i < SIZE; i++) {
//			if(1 > 4) {
//				datas.add((i + 1) * 10);
//				System.out.println(datas.size());
//				continue;
//			}
//		}
//		for (int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//		}
//		Collections.sort(datas);
//		for (int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//			
//		}
//	}
//}
//
package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
   
   public static void main(String[] args) {
//      <?>: ���׸�(�̸��� ����)
//      ��üȭ �� Ÿ���� �����ϴ� ���
//      ������ ������ Ÿ���� ������ �� ���� ������ �ӽ÷� Ÿ���� ������ �� ����Ѵ�.
//      ���� �ٿ� ĳ������ �� �ʿ䰡 ������, ������ Ÿ�Կ� ������ �� �� �ִ�.
      
      ArrayList<Integer> datas = new ArrayList<>();
      final int SIZE = 9;
      
//      C
      for (int i = 0; i < SIZE; i++) {
         if(i > 4) {
            datas.add((14 - i) * 10);
            System.out.println(datas.size());
            continue;
         }
         datas.add((i + 1) * 10);
         System.out.println(datas.size());
      }
      
//      R
      for (int i = 0; i < datas.size(); i++) {
         System.out.println(datas.get(i));
      }
      
      Collections.sort(datas);		// �������� ����		
//      Collections.reverse(datas);	// �¿츦 �ݴ�� �ٲ��ִ� �޼ҵ�
//      Collections.shuffle(datas);	// �������� �ٲ��ִ� �޼ҵ�
      for (int i = 0; i < datas.size(); i++) {
         System.out.println(datas.get(i));
      }
      System.out.println("=====================================");
//      �߰�(����)
//      50�ڿ� 500 ����
//      if(datas.contains(50)) {
//    	  datas.add(datas.indexOf(50) +1, 500);
//      }
//      System.out.println(datas.toString());
//      ����
//      90�� 9�� ����
//      	int prev = 0;
//      	if(datas.contains(90)) {
//      		prev = datas.set(datas.indexOf(90), 9);
//      		System.out.println(prev + "�� 9�� ����");
//      		System.out.println(datas);
//      	}
//      ���� 
//      80 ����
//      1. �ε����� ����
//      int removedData = 0;
//      if(datas.contains(80)) {
//    	  removedData = datas.remove(datas.indexOf(80));
//    	  System.out.println(removedData + "����");
//    	  System.out.println(datas);
//      }
//      2. ������ ����
//      if(datas.remove(Integer.valueOf(80))) {
//    	  System.out.println("80����");
//    	  System.out.println(datas);
//      }

//      for (int i = 0; i < datas.size(); i++) {
//    	  if(i == 50) {
//    		  datas.add((i+1) * 100);
//    		  System.out.println(datas.get(i));
		
//	}
//      datas.add(5, 500);
//      for (int i = 0; i < datas.size(); i++) {
//		
//    	  System.out.println(datas.get(i));
//	}
//      datas.set(9, 9);
//      for (int i = 0; i < datas.size(); i++) {
//		System.out.println(datas);
//	}
//      datas.remove(8);
//      for (int i = 0; i < datas.size(); i++) {
//    	  System.out.println(datas.get(i));
//		
//	}
//      
//   }
      }
}
//}



















