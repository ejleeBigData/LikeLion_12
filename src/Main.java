
public class Main {
    public static void main(String[] args) {
        String input = "123k";

        try {
            int number = Integer.parseInt(input);

            System.out.println("숫자 변환 : " + number);

        } catch (NumberFormatException e) {
            System.out.println("숫자로 바꿀수 없습니다.");
        } finally {
            System.out.println("종료");
        }

    }
}