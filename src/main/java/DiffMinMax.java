public class DiffMinMax {
    public static int diff(int[] array){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            }
            if(max < array[i]){
                max = array[i];
            }
        }
        return max - min;
    }
}
