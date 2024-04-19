public class twosum {
    public static void main(String[] args) {
        int[] result = new int[2];
        int[] s = { 3, 3 };

        int target = 6; // target compare number

        for (int i = 0; i < s.length; i++) {
            for (int n = 0; n < s.length; n++) {
                if (s[n] + s[i] == target && result.length != s.length) {
                    result[0] = i;
                    result[1] = n;
                }

                if (s[n] + s[i] == target && result.length == s.length) {
                    result[0] = s[0]/s[1];
                    result[1] = s[0] - s[0];
                }
            }
        }
        System.out.println(result[0] + "," + result[1]);
    }
}