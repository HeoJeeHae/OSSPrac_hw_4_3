import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		System.out.print("학번을 입력하세요: ");
		int num = sc.nextInt();
		System.out.println("\n"+ "<출력>");
		System.out.println("이름: "+ name);
		System.out.print("학번: "+ num);
	}

}
