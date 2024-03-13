public class Level1 {

    public static String PatternUnlock(int N, int [] hits)  {
        int sum = 0;

        for (int x = 0; x < hits.length - 1; x++) {
            if (hits[x] + hits[x + 1] == 8 || hits[x] + hits[x + 1] == 6 || hits[x] + hits[x + 1] == 11 || hits[x] + hits[x + 1] == 9 || hits[x] - hits[x + 1] == 1 || hits[x - 1] + hits[x] == 1)
                sum += 1.41;
            else
                sum += 1;
        }
        String s = String.valueOf(sum);
        return s;

    }
    public static void main(String[] args) {
        int[] hits = new int[] {1, 2, 3, 4, 5, 6, 2, 7, 8, 9};
        int N = 10;
        System.out.println(PatternUnlock(N, hits));
    }

}