package arrayListTask3;

import java.util.ArrayList;

public class Restaurant {
	ArrayList<Food> foods = new ArrayList<Food>();
//	- ���� �߰�
	
	public void add(Food food) {
		foods.add(food);
	}
//	   - ���� �̸����� ���� ���� ��ȸ
	public String findByName(String name) {
		for (Food food : foods) {
			if(food.getName().equals(name)) {
				return food.getKind();
			}
		}
		return null;
	}
	
	
//	   - ����ڰ� ���ϴ� ������ ���� ��ü ��ȸ
	public ArrayList<Food> findAllKind(String kind){
		ArrayList<Food> results = new ArrayList<Food>();
		for (Food food : foods) {
			if(food.getKind().equals(kind)) {
			}
		}
		return results;
	
		
	}
//	   - ���� ���� ���� �� ���� 10% ���
//	   - ����ڰ� ���ϴ� ������ ���� ���� ��ȸ
	
}