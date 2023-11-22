
public class Test {

    public static final String DEFAULT_APPLICATION_NAME = "MyDemoApp";
    public static final int MAX_IMAGE_SIZE_KB = 4096;

    public static String hello = "Hello"; // (1)

    public static void main(String args[]) {

        System.out.println(DEFAULT_APPLICATION_NAME); // (2)

        printHello();


    }

    private static void printHello() {
        System.out.println(hello); // (5)
    }
}