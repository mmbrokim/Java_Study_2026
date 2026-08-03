import java.util.Scanner;

import static java.lang.IO.println;

public class study1 {
    static void main() {
        int number = 1;
        Scanner scanner = new Scanner(System.in);

        println("369 게임을 시작합니다");
        println("1.player 부터 시작 2.computer 부터 시작");

        int selection = scanner.nextInt();
        println(selection + "을 선택하셨습니다!" );

        if(selection != 1 && selection != 2) {
            println("1또는 2를 선택해주세요");
        }

        if(selection == 2){
            println(number + "를 외쳤습니다");
            number ++;
        }

        while(true){
            String tempnumber = String.valueOf(number);

            println("당신의 차례입니다. 숫자를 입력해주세요.");
            String input = scanner.next();

            if(tempnumber.contains("3") || tempnumber.contains("6") || tempnumber.contains("9")){
                if(!input.equals("짝")){
                    gameOverCheck("당신은 틀렸습니다. 당신은 짝 을 외쳤어야 했습니다.", "당신의 입력", input);
                }
            }else{
                if(number != Integer.parseInt(input)){
                    gameOverCheck("당신은 틀렸습니다. 당신은" + number + "를 외쳤어야 했습니다.", "당신이 넣은 숫자", input);
                }
            }

            number++;

            String tempnumber2 = String.valueOf(number);

            if(tempnumber2.contains("3") || tempnumber2.contains("6") || tempnumber2.contains("9")){
                println("컴퓨터: 짝 을 외쳤습니다.");
                number ++;
            }else{
                println("컴퓨터: " + number + "를 외쳤습니다.");
                number ++;
            }


        }
    }

    private static void gameOverCheck(String obj, String x, String input) {
        println(obj);
        println(x + input);
        println("Game Over");
        System.exit(0);
    }
}
