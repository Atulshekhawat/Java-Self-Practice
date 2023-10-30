public class ReverseArray {
    public  static  void reverseArray(int[] array){
        int fist = 0;
        int last = array.length-1;
        while (fist <last){
            int temp = array[last];
            array[last] = array[fist];
            array[fist] = temp;
            fist++;
            last--;
        }
    }
    public static void main(String[] args) {
        int[] array = {34,54,35,74,36,66,73,24,72,83};
        reverseArray(array);
        for (int i =0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
