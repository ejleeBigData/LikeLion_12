class Util {
    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}

@FunctionalInterface
interface A {
    public void say(String name);
}

public class Color {
    public static void main(String[] args){
        A a = Util::sayHello;

        a.say(("노랑"));
    }
}
