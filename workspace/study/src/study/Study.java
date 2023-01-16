package study;

import java.util.Scanner;

class Car{
	String brand;
	String color;
	String password;
	int price;
	boolean engine;
	int wrongCount;
	{
		password = "0000";
	}
	public Car() {;}
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public Car(String brand, String color, String password, int price) {
		this.brand = brand;
		this.color = color;
		this.password = password;
		this.price = price;
	}
	void engineStart() {
		engine = true;
		
	}
	void engineStop() {
		engine = false;
	}
	boolean checkPassword(String password){
		return this.password.equals(password);
		
	}
}

public class Study {
	public static void main(String[] args) {
		String message = "1. �õ��ѱ�\n2. �õ�����";
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		Car car = new Car("BMW", "YELLOW", "1234", 35000);
		boolean flag = false;
		while(true) {
			System.out.println(message);
			choice = sc.nextInt();
		
			
		
			switch(choice) {
			case 1:
				if(!car.engine) {
					System.out.println("��й�ȣ : ");
					if(car.checkPassword(sc.next())) {
						car.engineStart();
						System.out.println("�õ� ����");
						car.wrongCount = 0;
					}
			}else {
			
					car.wrongCount++;
					if(car.wrongCount > 2) {
						System.out.println("���� �⵿");
						flag = true;
						
					}
					System.out.println("��й�ȣ"+car.wrongCount+"ȸ ����");
					
				}
				break;
		}
			System.out.println("�õ��� �̹� �����̾��ϴ�");
			break;
	//   �귣��, ���� ����
	////�õ��� �����ִٸ�, "�õ� �ѱ�" ���
	////�̹� �õ��� �����ִٸ�, "�õ��� �̹� �����ֽ��ϴ�" ���
	//
	//
	////�õ� ����
	////���� ���¸� Ȯ���ϰ�
	////�õ��� �����ִٸ�, "�õ� ����" ���
	////�̹� �õ��� �����ִٸ�, �õ��� �̹� �����ֽ��ϴ�. ���
	//
	////�õ��� �ѱ� ���ؼ� ��й�ȣ 4�ڸ��� �Է¹޾ƾ� �Ѵ�.
	////3������ �߸� �Է����� �� "���� �⵿" ���
	////���ڿ� �񱳴� ==�� �ƴ� equals()�� ���Ѵ�
		
	}
	
}
}