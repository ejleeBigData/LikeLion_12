import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] color = {"빨", "주", "노", "초", "파", "남", "보", "흰"};

        //배열의 경우 for 보다는 stream 사용
        for(String c: color) {
            System.out.println("color : " + c);
        }

        //Arrays.stream(color).forEach(n -> System.out.println(n));

        Arrays.stream(color).forEach(System.out::println);

    }
}