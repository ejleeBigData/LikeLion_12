
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result =  a / b ;

            System.out.println("result : " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌수 없습니다.");
        } finally {
            System.out.println("항상 실행 됩니다.");
        }

    }
}