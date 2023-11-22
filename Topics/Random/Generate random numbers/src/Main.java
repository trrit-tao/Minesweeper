import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Random random = new Random(a + b);
        int sam = 0;
        int intervalLength = b - a + 1;
        for (int i = 0; i < n; i++) {
            sam = sam + (random.nextInt(intervalLength) + a);
        }
        System.out.println(sam);
    }
}