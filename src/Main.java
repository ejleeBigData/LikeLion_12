import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String input = sc.nextLine();

            if(input.equals("q")) {
                break;
            } else {
                System.out.println("입력값 : " + input);

                try {
                    int number = Integer.parseInt(input);

                    System.out.println("숫자값 : " + number);
                } catch (NumberFormatException e) {
                    System.out.println("int가 아닙니다.");
                }
            }
        }
        System.out.println("종료");

    }
}