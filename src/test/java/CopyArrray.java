import java.util.Arrays;
//Copying 1 array into another

public class CopyArrray {
    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4, 5};
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        for (int x = 0; x < array2.length; x++) {
            System.out.println(array2[x]);


        }
        //System.out.println(array2.toString());
    }
}
