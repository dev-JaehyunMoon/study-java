package study;

import java.util.Scanner;

public class Self {
	public static void main(String[] args) {
		
		int firstNumber = 0,  lastNumber = 0;
		String message = "���� �� ���� �Է��ϼ���";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		firstNumber = sc.nextInt();
		lastNumber = sc.nextInt();
		
		Object result = firstNumber > lastNumber ? "ū �� : " + firstNumber 
				: firstNumber == lastNumber ? "�� ���� ����."   : "ū �� :" + lastNumber;
		System.out.println(result);
	}
}
