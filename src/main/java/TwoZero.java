public class TwoZero {
    public static boolean twoZero(int[] array){
        for (int i = 1; i < array.length; i++) {
            if(array[i] == 0 && array[i-1] == 0){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
