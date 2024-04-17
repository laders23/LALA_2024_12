package Day1;

import java.util.Scanner;

public class Day1_Scan {
	
	public static void Convert(int n) {
		int input = 0;
		
		Scanner scan = new Scanner(System.in);
		
		switch(n) {
		case 1:
			System.out.print("변환할 Mile : ");
			input = scan.nextInt();
			System.out.println(MtoK(input));
			break;
		case 2:
			System.out.println("변환할 Kilo : ");
			input = scan.nextInt();
			KtoM(input);
			break;
		case 3:
			System.out.println("변환할 섭씨 : ");
			input = scan.nextInt();
			CtoF(input);
			break;
		case 4:
			System.out.println("변환할 화씨 : ");
			input = scan.nextInt();
			FtoC(input);
			break;
		
		default:
			break;
		}
		
	}
	
	public static double MtoK(int Mile) {
		return Mile * 1.6;
	}
	
	public static double KtoM(int Kilo) {
		return Kilo/1.6;
	}
	
	public static double CtoF(int C) {
		return (C*1.8) + 32;
	}
	
	public static double FtoC(int F) {
		return (F-32)/1.8;
	}

	public static void main(String args[]) {
		int Mile = 0;
		int Kilo = 0;
		int C = 0;
		int F = 0;
		
		int N = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("M->K : 1");
		System.out.println("K->M : 2");
		System.out.println("C->F : 3");
		System.out.println("F->C : 4");
		
		System.out.print("변경할 숫자를 입력하시오 : ");
		N = scanner.nextInt();
		
		Convert(N);
		
		scanner.close();
	}
}

/*
 * 
		double a1;
		int a2;
		char c1;
		String c2;
		
		System.out.print("문자열을 입력하세요 : ");
		c2 = scanner.next(); //문자나 문자열
		System.out.print("숫자를 입력하세요 : ");
		a2 = scanner.nextInt(); //숫자(Int형)
		System.out.print("소수를 입력하세요 : ");
		a1 = scanner.nextDouble(); //숫자 (Double형)
		
		
		System.out.println(c2);
		System.out.println(a2);
		System.out.println(a1);
 */