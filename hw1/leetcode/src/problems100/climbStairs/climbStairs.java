package problems100.climbStairs;

public class climbStairs {
    public static void main(String[] main) {
        int n = 3;
        System.out.println(application(n));
    }

    private static int application(int n) {
        int[] way = new int[n];
        way[0] = 1;
        way[1] = 2;

        for (int i = 2; i < n; i++) {
            way[i] = way[i - 1] + way[i - 2];
        }

        return way[n - 1];
    }
}
