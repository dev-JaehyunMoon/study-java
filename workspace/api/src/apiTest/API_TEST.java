package apiTest;

public class API_TEST {
	public static void main(String[] args) {
		
		Calc calc = new Calc();
		try {
			System.out.println(calc.div(10, 0));
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("0���� ���� �� �����ϴ�.");
		}
	}

}
