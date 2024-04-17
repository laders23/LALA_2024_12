package Calculator;
import java.util.Scanner;

public class Calculator {

	public static double add(int a, int b) { // 덧셈
        return a + b;
    }

    public static double subtract(int a, int b) { // 뺄셈
        return a - b;
    }

    public static double multiply(int a, int b) { //곱셈
        return a * b;
    }

    public static double divide(int a, int b) { //나눗셈
        return a / b;
    }

    public static double remainder(int a, int b) { // % 연산
        return a % b;
    }

    public static void Menu (int a, int b, String operator) {
        double result = 0;
        
        switch (operator) { //operator = 연산자
            case "+":
                result = add(a, b); // a + b 를 수행해주는 add 함수(메소드) 호출
                break;
            case "-":
                result = subtract(a, b); // a - b 를 수행해주는 subtract 함수(메소드) 호출
                break;
            case "*":
                result = multiply(a, b); // a * b 를 수행해주는 multiply 함수(메소드) 호출
                break;
            case "/":
                result = divide(a, b); // a / b 를 수행해주는 divide 함수(메소드) 호출
                break;
            case "%":
                result = remainder(a, b); // a % b 를 수행해주는 remainder 함수(메소드) 호출
                break;
            default:
                System.out.println("Invalid operator"); //올바르지 않은 경우
                break;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //입력을 위한 Scanner 선언
        
        int input = -1; //-1로 세팅해서 일단 while문에 진입할 수 있도록 설정

        while(input != 0) { //0이 아닐 때, 즉, 0일 때 까지
            System.out.println("계산기 프로그램에 오신 것을 환영합니다! 종료하려면 0번, 계산기를 사용하려면 1번을 눌러주세요.");//시작을 알리는 출력문
            System.out.println("0. 종료"); //종료 시 입력받을 숫자
            System.out.println("1. 계산"); //계산 시 입력받을 숫자
            
            input = scanner.nextInt();
            
            switch(input) {
                case 0: //input 값 즉, switch 옆 괄호에 입력받은 값이 case와 동일할 때 = 조건을 만족할 때
                    System.out.println("Goodbye!"); //출력문
                    break; // 반복문 종료
                    
                case 1:
                    System.out.print("Enter mathematical expression: "); //수식입력
                    int a = scanner.nextInt(); //정수에 대해서만 계산, 1번 정수
                    String operator = scanner.next(); //연산자 +, -, *, /, %(나머지 연산자)
                    int b = scanner.nextInt(); //2번 정수
                    Menu(a, b, operator); //f(x) = y 
                    break;
            }

        }
    }

}



    


