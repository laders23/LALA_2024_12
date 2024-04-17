package Day2;
import java.util.Scanner;

/*
 1. 이름, 응시번호 6자리, 시험 성적 순서대로 입력
 	-> 이름 : String
 	-> 응시번호(ID) : String 으로 받은 뒤, Integer.valueOf(ID.charAt(ID.length()-1);
 		-> 문자열로 이루어진 응시번호를 입력받은 뒤, 해당 값의 제일 마지막 String을 가져와 Int형태로 변환해주는 코드
 	-> 시험 성적 : 
 2. 응시번호 홀수 = 가 형, 응시번호 짝수 = 나 형
 	-> % 연산자 사용해서 2로 나눈 뒤에, 0이면 짝수, 아니면 홀수
 	
 2_1. 가형(컴퓨터구조,DB, 소프트웨어공학) / 나형(한국어, 영어, 세법)
 	->if문 + && 연산자 사용해서 조건 여러개 
 
 3. 시험유형별 점수 출력
 
 4. 평균 점수 출력 + 80점이하 실격
 	-> Avg 메소드 따로 구현
 	-> PF 메소드 구현하면 편함
 
 	
 */

public class Day2 {
	public static void Even_Subject(String Name, String ID) {
		
		
	}
	
	public static void Odd_Subject(String Name, String ID) { //가형 즉, 응시 번호가 홀수인 경우
		Scanner scanner = new Scanner(System.in);
		
		int CS; //컴퓨터구조 (정수)
		int DB; //DB (정수)
		int SE; //소프트웨어 공학 (숫자, 정수형)
		
		int Total = 0;
		
		System.out.print("가형 응시자 입니다. 컴퓨터 구조 성적을 입력하세요 : "); //출력
		CS = scanner.nextInt(); //입력받고
		Total += CS; //더해주고
		
		System.out.print("데이터베이스 성적을 입력하세요 : ");
		DB = scanner.nextInt();
		Total += DB;
		
		System.out.print("소프트웨어공학 성적을 입력하세요 : ");
		SE = scanner.nextInt();
		Total += SE;
		
		int Avg = Total/3;
		
		//점수 출력
		System.out.println("컴퓨터 구조 성적 : " + CS + "점입니다. " + "데이터 베이스 성적: " + DB + "점입니다. " + "소프트웨어공학 성적 : " + SE +"점입니다.");
		
		//평균점수 : 80 이하 = 실격
		if(Avg <= 80) {
			System.out.println("평균 점수는 " + Avg + "점으로 실격입니다.");
		}
		else{
			System.out.println("평균 점수는 " + Avg + "점으로 합격입니다!");
		}
		
		
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		String Name; //이름 (문자열)
		String ID; //응시번호 -> 010101 이런 형태의숫자도 받기 위해서 String으로 선언 (문자열)
		
		System.out.println("이름, 응시번호, 성적을 차례로 입력하세요. "); //출력문 (행바꿈, Enter)
		System.out.print("이름 : ");
		Name = scanner.next(); //scanner.next = 문자를 입력받을 때 사용
		System.out.print("응시번호 : ");
		ID = scanner.next(); // 응시번호 입력
		
		int ID_num = Integer.valueOf(ID.charAt(ID.length()-1));
		
		// Integer.valueOf(ID.charAt(ID.length()-1);
		// ID.charAt() -> Image
		// I = 0, m = 1, a = 2
		// ID.length() -> 길이 010101 -> 6
		// Integer.valueOf() -> Int형 변환
		
		if(ID_num%2 != 0) { // 조건문에서 == 좌항과 우항이 같다. / != 같지 않다 
			Odd_Subject(Name, ID);
		}
		
		
	}
}
