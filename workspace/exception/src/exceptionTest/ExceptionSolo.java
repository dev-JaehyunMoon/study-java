package exceptionTest;

public class ExceptionSolo {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			System.out.println("���� ����!00");
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
