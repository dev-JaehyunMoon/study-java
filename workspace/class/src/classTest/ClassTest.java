package classTest;

class A{
	int data;
	
	A(int data){
		System.out.println("기본 생성자");
		this.data = data;
	}
	void printData() {
		System.out.println(data);
	}
}



public class ClassTest {
	public static void main(String[] args) {
		A a = new A(1);
		A a2 = new A(2);
		a.printData();
		a2.printData();
}
}
