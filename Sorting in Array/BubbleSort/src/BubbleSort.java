public class BubbleSort {

    public static void bubbleSort(int arr[]){
        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>=arr[j+1]){
                    int tem = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=tem;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {32,45,65,46,25};
        bubbleSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
