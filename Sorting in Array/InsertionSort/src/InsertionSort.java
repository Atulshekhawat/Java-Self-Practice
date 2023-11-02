public class InsertionSort {
    public static void InsertionSort(int[] array){
        for (int i=1;i< array.length;i++){
            int curr =array[i] ;
            int prev = i-1;

            while (prev >=0 && array[prev]>curr){
                array[prev+1]=array[prev];
                prev--;

            }

            array[prev+1]=curr;
        }
    }


    public static void main(String[] args) {
        int [] array = {34,53,24,62,13,53};

        InsertionSort(array);
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
