public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try{
            int result = a / b;
            System.out.println("결과 : " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

            System.out.println("오류 발생!");
        } catch (NullPointerException e) {

            System.out.println("비정상 접근! 초기화면으로 이동합니다.");
        }

    }
}