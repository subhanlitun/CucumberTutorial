/*Finding lenght of
array without
using lenght
function.Subh
*/


public class ArrayLength {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,6,7,8,9};
        int counter = 0;

        for (int i : array1)
        {
            counter = counter+1;
        }
        System.out.println(counter);
    }
}
