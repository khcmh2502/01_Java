package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	/*
	 * 
7 ~ 12 번 별찍기 문제 푸는 법

1. 패턴의 형태를 분석
- 행 : 몇 줄을 출력하는지 확인
- 공백(space)이 있다면 왼쪽 정렬인지, 가운데 정렬인지 확인
- 별(*) : 한 줄에 몇개씩 증가(혹은 감소) 하는지 확인

ex) 
   *
  ***
 *****
*******

-> 총 4줄 (== 4행)
-> 공백 : 왼쪽에 공백이 존재!
-> 별 개수는 1 -> 3 -> 5 - >7 (2씩 증가하는 모양새 : 2 * row - 1)

2. 공백과 * 의 개수의 규칙 찾기

3. 규칙을 반복문으로 변환하기
	 * */
	Scanner sc = new Scanner(System.in); // 필드
	
	public void practice1() {
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요. 
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다. 
		 * 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 */
		
		// 1. 내가 입력한 값(input)이 조건에 맞는지 파악하기
		// -> 조건문을 이용해야한다! -> if
		System.out.print("1 이상의 숫자를 입력하시오 : ");
		int input = sc.nextInt();
		
		if(input >= 1) { // 조건 O
			
			// 1 부터 input 까지 1씩 증가 반복 출력
			for(int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
			
		} else { // 조건 X
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
		
		
	}
	
	public void practice2() {
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요. 
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 */
		System.out.print("1 이상의 숫자를 입력하시오 : ");
		int input = sc.nextInt();
		
		if(input >= 1) { // 조건 O
			// input = 5 
			// 5 4 3 2 1 
			// 시작 5 부터 , 끝 1 , 1씩 감소하면서..
			for(int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
			
			
		} else { // 조건 X
			System.out.println("1 이상의 숫자만 입력해라");
		}
		
	}
	
	public void practice3() {
		/*
		 * 1부터 사용자에게 입력 받은 수까지의 
		 * 정수들의 합을 for문을 이용하여 출력하세요.
		 * 
		 * 1 + 2 + 3 + 4 + 5 = 15
		 */
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0; // 합계용 변수
		
		for(int i = 1; i <= input; i++) {
			sum += i; // 6
			
			// 마지막 숫자인 경우 "+" 출력하지 않음
			if(i == input) { // 마지막 턴
				System.out.print(i + " = " + sum);
				
			} else { // 이전 턴
				System.out.print(i + " + ");
			}
		}
		
	}
	
	public void practice4() {
		/*
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 
		 * 모두 출력하세요. 
		 * 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를
		 * 입력해주세요“를 출력하세요.
		 */
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) { // 1미만의 숫자가 입력된 경우
			System.out.println("1 이상의 숫자만 입력.");
			
		} else { // 정상인 경우
			
			// 일단 start에 첫 번째 숫자 , end에 두번째 숫자 대입
			int start = num1;
			int end = num2;
			
			// 만약 첫 번째 숫자가 크다면 start, end의 값 바꾸기
			if(num1 > num2) {
				start = num2;
				end = num1;
			}
			
			for(int i = start; i <= end; i++) {
				System.out.print(i + " ");
			}
			
		}
		
	}
	
	public void practice5() {
		/*
		 * 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		 */
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("========" + dan + "단 ========");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
		}
		
	}
	
	public void practice6() {
		/*
		 * 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요. 
		 * 단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를
		 * 출력하세요.
		 * 
		 */
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if(input < 2 || input > 9) { // 2~9 범위 벗어난 경우
			System.out.println("2~9 숫자만 입력하세요");
			
		} else { // 정상범위
			
			// 입력받은 숫자의 단부터 9단까지 단 증가하면서 반복 출력
			for(int dan = input; dan <= 9; dan++) {
				System.out.println("======" + dan + "단 ======");
				
				// 곱해지는 수 1~9 까지 반복
				for(int i = 1; i <= 9; i++) {
					System.out.printf("%d X %d = %d\n", dan, i, dan * i);
				}
				
				
			}
			
			
		}
		
		
		
		
		
	}

	public void practice7() {
		/*
		 * 
		 ex.
		정수 입력 : 4
		
		*
		**
		***
		****
		
		- 행(row)은 입력한 input 만큼
		- 열(col)은 현재행(row)만큼 반복
		
		 * 
		 * 
		 * */
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) { // 1~4까지 4번 반복
			
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			
			System.out.println(); // 한 행의 모든 열 출력이 끝나면 줄바꿈
			
		}
		
		
		
	}

	public void practice8() {
		/*
		 * 다음과 같은 실행 예제를 구현하세요.
		 * 
		 * ex. 정수 입력 : 4
		 
		 ****
		 ***
		 **
		 * 
		 
		 
		 * - 행(row)은 입력한 input 만큼 반복 (단, 안쪽 for문을 생각해서 1씩 감소하는 형태로 작성.) 
		 * - 열(col)은 1부터 현재행(row) 범위만큼 반복
		 * 
		 * 
		 */


		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for (int row = input; row >= 1; row--) {
			// 내가 입력한 input 값을 row에 대입하여 반복할때마다 1씩 감소
			// 4 3 2 1..

			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}

			System.out.println();

		}

	}

	public void practice9() {

		/*
		 * 
		 * 정수 입력 : 4
		 
		 	*
	 	   **
		  ***
		 ****
		 
		 * 
		 * 
		 * - 공백 부분이 input 보다 1 작은수에서 시작하여 1씩 감소하는것 처럼 보임
		 * 
		 * - * 부분은 현재행(row)만큼 찍힌것으로 보임
		 * 
		 */


		System.out.print("정수 입력 : ");
		int input = sc.nextInt();


        for (int row = 1; row <= input; row++) {  // row는 1부터 input까지 증가
        	
            for (int space = 1; space <= input - row; space++) { // 공백 출력 (input - row 개)
                System.out.print(" ");
            }
            
            for (int col = 1; col <= row; col++) { // 별 출력 (i 개)
                System.out.print("*");
            }
            
            System.out.println(); // 줄 바꿈
        }


	}

	public void practice10() {

		/*
		 * 
		 * 정수 입력 : 3
		 
		 *
		 **
		 *** (여기까지 위쪽삼각형)
		 **
		 *
		 
		 
		 * - 위쪽삼각형 : 행(row)은 input 만큼 반복, 열(col)은 현재행(row)만큼 반복 
		 * - 아래삼각형 : 행(row)은 input 보다 1 작은수에서부터 1씩 감소하며 반복 
		 * 					열(col)은 현재행(row)만큼 반복
		 * 
		 * 두개 합치기!
		 * 
		 */

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		// 위쪽삼각형
		for (int row = 1; row <= input; row++) {

			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}

			System.out.println(); // 줄바꿈
		}

		// 아랫쪽삼각형
		for (int row = input - 1; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}

			System.out.println(); // 줄바꿈
		}

	}

	public void practice11() {
		// 왼쪽 공백 + 가운데 정렬된 * 개수 증가 방식으로 구현
		// 즉, 공백 + 별 개수(홀수 개) 형태의 피라미드 모양
		/*
		 * 정수 입력 : 4 
		 * 
		       *
			  ***
			 *****
			*******
		 * */
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt(); // 4일때
		
		 for (int row = 1; row <= input; row++) { // 행(row) 1 ~ input 까지 1씩 증가
			 
            for (int space = 1; space <= input - row; space++) { // 왼쪽 공백 출력(input - row 개 출력 (맨 위가 가장 많고, 아래로 갈수록 줄어듦)
                System.out.print(" "); 
            }
            // 왼쪽 공백 출력 끝났으면 
            // 이제 아래 별 출력
            for (int col = 1; col <= (2 * row - 1); col++) { // 별 출력
                System.out.print("*");
            }
            
            System.out.println(); // 줄 바꿈
        }
		 
	}
	
	public void practice12() {

		/*
		 * 
		 * 정수 입력 : 5
		 *****
		 *   * 
		 *   * 
		 *   *
		 *****
		 * 
		 * - input == row(행) - 1행과 input행은 "*" 출력 
		 * - 1열과 input열은 "*" 출력
		 * 
		 * 
		 */


		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for (int row = 1; row <= input; row++) {

			for (int col = 1; col <= input; col++) {

				// 첫 번째 / 마지막 행, 첫 번째, 마지막 열 * 출력
				if (row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");

				} else { // 나머지는 공백 출력
					System.out.print(" ");

				}
			}

			System.out.println();

		}

	}

	public void practice13() {
		/*
		 * 
		 * 1부터 사용자에게 입력 받은 수까지 중에서 
		 * 1) 2와 3의 배수를 모두 출력하고 
		 * 2) 2와 3의 공배수의 개수를 출력하세요.
		 * 
		 * ex) 자연수 하나를 입력하세요 : 15 
		 * 2 3 4 6 8 9 10 12 14 15 
		 * count : 2
		 */

		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();

		int count = 0;

		for (int i = 1; i <= input; i++) {

			// 2의 배수 또는 3의 배수인 경우 출력
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");

				// 2와 3의 공배수 == 2로도 나누어 떨어지고, 3으로도 나누어 떨어진다.
				if (i % 2 == 0 && i % 3 == 0) {
					// 갯수세기
					count++;
				}

			}

		}

		System.out.println("\ncount : " + count);

	}

	
}
