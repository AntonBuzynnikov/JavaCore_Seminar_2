public class TwoZeroTest {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i <array.length; i++) {
            array[i] = i+1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(TwoZero.twoZero(array));
        array[0] = 0;
        array[1] = 0;
        for (int i = 0; i <array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(TwoZero.twoZero(array));
    }
}
