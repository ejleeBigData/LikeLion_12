
public class Main {

    public static void main(String[] args) {
        String strNum = "123";

        try {
            int num = convertToInt(strNum);

            System.out.println("변한 결과 : " + num);

        } catch (NumberFormatException e) {
            System.out.println("숫자 형식 오류~");
        }
    }

    public static int convertToInt(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }

}