public class SubArray {


    public static void subArray(int[] array){
        for (int i=0;i<array.length;i++){
            int first = i;
            for (int j=i;j<array.length;j++){
                int end = j;
                for (int k=first;k<=end;k++){
                    System.out.print(array[k]+" ");
                }
                System.out.println();
            }
            System.out.println();


        }
    }
    public static void main(String[] args) {
        int[] array={2,4,6,8,10};
        subArray(array);

    }
}
