
public class Main {
    public static void main(String[] args) {
        String input = "111 2 3";
        String[] tokens = input.split(" ");

        try {
            for(String token : tokens) {
                System.out.println(token);
            }

            boolean result = validateTokenCount(tokens);

            if(result) {
                System.out.println("숫자 " + tokens.length + "개");
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean validateTokenCount(String[] tokens) throws NumberFormatException {
        if (tokens.length < 2) {
            throw new NumberFormatException("숫자 2개가 아닙니다.");
        }

        return true;
    }
}