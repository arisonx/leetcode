public class AddTwoNumbers {

    public static void main(String[] args) {

        int[] l1 = { 2, 4, 3,4 };
        int[] l2 = { 5, 6, 4,5 };

        int[] result = new AddTwoNumbers().Solution1(l1, l2);
        for (int i = 0; i < result.length; i++) {
            System.out.println("Value:" + result[i] + "  indice: " + i);
        }

    }

    public int[] Solution1(int[] l1, int[] l2) {
        StringBuilder stbl1 = new StringBuilder();
        StringBuilder stbl2 = new StringBuilder();
        for (int i = 0, j = 0; i < l1.length && j < l2.length; i++, j++) {
            stbl1.append(l1[i]);
            stbl2.append(l2[j]);
        }

        int n1 = Integer.parseInt(stbl1.toString());

        int n2 = Integer.parseInt(stbl2.toString());

        int rs = n2 + n1;

        int i = String.valueOf(rs).length();
        String resultString = String.valueOf(rs);

        int[] result = new int[i];

        for (int j = 0; j < result.length; j++) {
            result[j] = Character.getNumericValue(resultString.charAt(j));
        }

        return result;
    }

}
