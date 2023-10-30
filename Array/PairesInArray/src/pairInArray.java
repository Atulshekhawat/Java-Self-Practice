public class pairInArray {

    public static void pairInArray(int[] array){
        int tp=0;
        for (int i=0;i<array.length;i++){
            int current = array[i];

            for (int j=i+1;j<array.length;j++){
                System.out.print("(" +current +","+array[j]+")");
                tp++;
            }
            System.out.println();

        }
        System.out.println("Total Number of Pair :"+tp);
    }
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10};

        pairInArray(array);

    }
}
