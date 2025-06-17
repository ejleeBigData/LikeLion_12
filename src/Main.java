@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        MathOperation add = (int a, int b) -> a + b;

        /* 익명 클래스와 비교
        Calculator add = new Calculator() {
            @Override
            public int compute(int a, int b) {
                return a + b;
            }
        };
        */
        MathOperation multiply = (int a, int b) -> a * b;

        System.out.println("add : " + add.operate(5, 6));
        System.out.println("multiply : " + multiply.operate(8, 9));
    }
}