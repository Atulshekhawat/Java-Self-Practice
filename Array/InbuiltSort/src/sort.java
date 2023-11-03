import java.util.Arrays;
import java.util.Collections;

public class sort {


    public static void inbuiltSortMethod(int[] array){
        Arrays.sort(array);
        for (int i=0;i<=array.length-1;i++){
            System.out.print(array[i]+" ");
        }

    }

    public static void inbuiltSortInReverseOrder(){
        Integer[] array1 = {23,54,25,75,34,85};
        Arrays.sort(array1, Collections.reverseOrder());
        for (int i=0;i<=array1.length-1;i++){
            System.out.print(array1[i]+" ");
        }
    }



    public static void main(String[] args) {

        int[] array = {23,54,25,75,34,85};
        inbuiltSortMethod(array);
        System.out.println();
        System.out.println("--------------------------------------");
        inbuiltSortInReverseOrder();

    }
}
