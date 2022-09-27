import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		System.out.print("학번을 입력하세요: ");
		int num = sc.nextInt();
		System.out.print("학과를 입력하세요: ");
		String ma = sc.next();
		System.out.println("\n"+ "<출력>");
		System.out.println("이름: "+ name);
		System.out.println("학번: "+ num);
		System.out.print("학과: "+ ma);
	}

}

