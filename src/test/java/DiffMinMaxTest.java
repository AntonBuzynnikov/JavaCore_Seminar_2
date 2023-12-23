public class DiffMinMaxTest {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i <array.length; i++) {
            array[i] = i+1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(DiffMinMax.diff(array));
    }
}
