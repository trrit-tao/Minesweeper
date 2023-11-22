import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentSeed = scanner.nextInt();
        int endSeed = scanner.nextInt();
        int sequenceLength = scanner.nextInt();
        int limit = scanner.nextInt();

        int resultSeed = 0;

        int minNum = Integer.MAX_VALUE;


        for (; currentSeed <= endSeed; currentSeed++) {
            Random random = new Random(currentSeed);
            int maxNum = 0;
            for (int i = 0; i < sequenceLength; i++) {
                int num = random.nextInt(limit);
                if (num > maxNum) {
                    maxNum = num;

                }
            }
            if (minNum > maxNum) {
                resultSeed = currentSeed;
                minNum = maxNum;
            }
        }
        System.out.println(resultSeed + "\n" + minNum);
    }
}