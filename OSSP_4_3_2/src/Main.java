import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.next();
		System.out.print("�й��� �Է��ϼ���: ");
		int num = sc.nextInt();
		System.out.print("�а��� �Է��ϼ���: ");
		String ma = sc.next();
		System.out.println("\n"+ "<���>");
		System.out.println("�̸�: "+ name);
		System.out.println("�й�: "+ num);
		System.out.print("�а�: "+ ma);
	}

}

