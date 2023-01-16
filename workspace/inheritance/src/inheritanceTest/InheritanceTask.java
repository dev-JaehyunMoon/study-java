package inheritanceTest;

class Car{
	String brand;
	String color;
	int price;
	
	public Car() {;}
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	void engineStart() {
		System.out.println("����� �õ� Ŵ");
	}
	void engineStop() {
	System.out.println("����� �õ� Ŵ");
	
	}
}

class SuperCar extends Car{
	String mode;
	
	
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	
	}
	@Override
	void engineStart() {
		super.engineStart();
		System.out.println("�������� �õ� �ѱ�");
	}
	@Override
	void engineStop() {
		// TODO Auto-generated method stub
		super.engineStop();
		System.out.println("�������� �õ� ����");
	}
	
}
//	����ī�� �������� �õ��� �Ѱ� �� �� �ִ�.


public class InheritanceTask {
	public static void main(String[] args) {
		
		SuperCar supercar = new SuperCar("���", "red", 5000, "������");
		supercar.engineStart();
		supercar.engineStop();
		
	}

}
