import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

import static java.lang.IO.println;

public class study2 {
    // 실행을 하면, 계산기를 시작합니다 문구 생성.
    // 연산을 선택해주세요 문구 생성
    // 1. + 2. - 3. * 4. / 5. 종료 를 만들기.
    // 1 ~ 4 를 입력받으면 첫 번째 숫자와 두 번째 숫자를 연산한 결과를 출력하고,
    // 1. 메뉴로 돌아가기 2. 종료하기 를 선택할 수 있게 한다.
    // 5 를 입력받으면 종료.
    static void main() {
        // 스캐너 소환
        Scanner scanner = new Scanner(System.in);
        // 숫자(연산 선택) 입력을 받는다.
        int result = 1;

        while (true) {
            // 실행을 하면, 계산기를 시작합니다 문구 생성.
            println("계산을 시작합니다");
            // 연산을 선택해 주세요 문구 출력.
            println("연산을 선택해 주세요.");
            println("1. +");
            println("2. -");
            println("3. *");
            println("4. /");
            println("5. 계산기 종료");

            int operation = scanner.nextInt();
            if (operation == 1) {
                println("+ 을 선택했습니다.");
                // 첫 번째 숫자 입력받기
                println("첫 번째 숫자를 입력해 주세요");
                int num1 = scanner.nextInt();
                println(num1 + "을 선택했습니다.");

                // 두 번째 숫자를 입력받기
                println("두 번째 숫자를 입력해 주세요");
                int num2 = scanner.nextInt();
                println(num2 + "을 선택했습니다.");

                // 결과 출력
                result = num1 + num2;
                println("계산 결과 : " + result);
                println(" ");

            } else if (operation == 2) {
                println("- 을 선택했습니다.");
                // 첫 번째 숫자 입력받기
                println("첫 번째 숫자를 입력해 주세요");
                int num1 = scanner.nextInt();
                println(num1 + "을 선택했습니다.");

                // 두 번째 숫자를 입력받기
                println("두 번째 숫자를 입력해 주세요");
                int num2 = scanner.nextInt();
                println(num2 + "을 선택했습니다.");

                result = num1 - num2;
                println("계산결과 : " + result);
                println(" ");

            } else if (operation == 3) {
                println("* 를 선택했습니다.");
                // 첫 번째 숫자 입력받기
                println("첫 번째 숫자를 입력해 주세요");
                int num1 = scanner.nextInt();
                println(num1 + "을 선택했습니다.");

                // 두 번째 숫자를 입력받기
                println("두 번째 숫자를 입력해 주세요");
                int num2 = scanner.nextInt();
                println(num2 + "을 선택했습니다.");

                result = num1 * num2;
                println("계산결과 : " + result);
                println(" ");

            } else if (operation == 4) {
                println("/ 를 선택했습니다.");
                // 첫 번째 숫자 입력받기
                println("첫 번째 숫자를 입력해 주세요");
                int num1 = scanner.nextInt();
                println(num1 + "을 선택했습니다.");

                // 두 번째 숫자를 입력받기
                println("두 번째 숫자를 입력해 주세요");
                int num2 = scanner.nextInt();
                println(num2 + "을 선택했습니다.");

                result = num1 / num2;
                println("계산결과 : " + result);
                println(" ");
            }  else if (operation == 5) {
                break;
            }
            continue;
        }
    }
}
