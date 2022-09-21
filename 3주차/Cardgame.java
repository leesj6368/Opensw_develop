import java.util.Scanner;
import java.util.Random;
 
public class Cardgame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            Random r = new Random();
            int k = r.nextInt(100); // Random class로 0-99까지의 임의의 정수를 생성한다.
            System.out.println("수를 결정하였습니다. 맞추어보세요");
            System.out.println("0-99");
            int i = 1;
            while(true) { //사용자가 마지막에 'n'을 입력하기 전까지 반복 실행.
                
                System.out.println(i + ">>");
                int input = scanner .nextInt(); 

                while(input != k) { //사용자가 정답을 맞추지 못했다면
                    if(input<k) //사용자가 입력한 수 < 임의의 정수(정답) 
                        System.out.println("더 크게");
                    else if(input>k) //사용자가 입력한 수 > 임의의 정수(정답)
                        System.out.println("더 작게");
                    i++;
                    break; //while(input!=k)를 빠져나가는 break문
                }

                if(input==k) { //사용자가 정답을 맞췄다면
                    System.out.println("맞았습니다.");
                    System.out.println("다시하시겠습니까? (y/n) >>");

                    if(scanner.next().equals("n")) { //프로그램 종료 코드
                        System.out.println("숫자 맞추기를 종료합니다.");
                        System.exit(0);
                    }
                    else //계속 게임을 한다면
                        break; //여기서 break가 와야 하는 이유는 
//이 작은 반복문(if(input==k))을 벗어나서 계속 게임(while true문)을 진행해야 하기 때문이다.
                    
                    
                }
                
            
            
            
            
                }
        }
 
}
}