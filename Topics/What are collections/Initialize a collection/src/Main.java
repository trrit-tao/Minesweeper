public class Main {
    public static void main(String[] args) {
        int[] a = {3, 0 , 3, 9, 2, 1};
        int r = 7;

        r = 7;
        for (int i = 0; i < a.length; ++i) {
            int x = a[i];
            x = x * x;
            r += x;
        }

        System.out.println(r);

        r = 13;
        r += a[a[0]];
        r -= a[a[a.length-1]];
        System.out.println(r);

        r = 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] < a.length)
                r += a[i];
        }
        System.out.println(r);
    }
}