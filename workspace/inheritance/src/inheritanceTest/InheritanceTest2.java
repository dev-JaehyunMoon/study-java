package inheritanceTest;

class Human{
	void eat() {
		System.out.println("�Ա�");
	}
	void sleep() {
		System.out.println("���ڱ�");
	}
	void walk() {
		System.out.println("�� �߷� �ȱ�");
	}
}
class Monkey extends Human{
	void shakeTail() {
		System.out.println("���� ġ��");
	}
	@Override
	void walk() {
		super.walk();
		System.out.print("�� �߷� �ȱ�");
	}
	
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		Human human = new Human();
		Monkey kingkong = new Monkey();
		kingkong.walk();
	}

}
