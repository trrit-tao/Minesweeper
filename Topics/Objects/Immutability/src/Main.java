import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int lower = scanner.nextInt();
    int upper = scanner.nextInt();
    Random random = new Random(100);

    int intervalLength = upper - lower + 1;

    System.out.println(random.nextInt(intervalLength) + lower);
    System.out.println(random.nextInt(intervalLength) + lower);
    System.out.println(random.nextInt(intervalLength) + lower);
    System.out.println(random.nextInt(intervalLength) + lower);
    System.out.println(random.nextInt(intervalLength));
  }
}