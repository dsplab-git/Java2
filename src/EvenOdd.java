import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//사용자 입력
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		int number = input.nextInt();
		
		//홀짝 확인
		if(number % 2 == 1){
			System.out.print("입력된 정수는 홀수입니다.");
		}
		else {
			System.out.print("입력된 정수는 짝수입니다.");
		}
		System.out.print("프로그램이 종료되었습니다.");

	}

}
